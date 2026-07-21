class Solution {
    public static long mod = 1000000007L;
    public static boolean RabinC(String a, String b){
      int n = b.length();

        if (n > a.length()) {
            return false;
        }

        long hash = 0;
        long base = 31;
        int pow = 0;

        // Calculate hash of string b
        for (int i = n - 1; i >= 0; i--) {

            char ch = b.charAt(i);
            long d = ch - 'a' + 1;

            hash = (hash
                    + d * (long) Math.pow(base, pow)) % mod;

            pow++;
        }

        int alen = a.length();
        int pw = n - 1;
        long hs = 0;
        int left = 0;

        for (int i = 0; i < alen; i++) {

            // Create first window hash
            if (i < n) {

                long ch = a.charAt(i) - 'a' + 1;

                hs = (hs
                        + ch * (long) Math.pow(base, pw)) % mod;

                pw--;

                if (i == n - 1 && hs == hash) {
                    // if (a.substring(0, n).equals(b)) {
                        return true;
                    // }
                }
            }

            // Slide the window
            else {

                long pr = a.charAt(left) - 'a' + 1;

                long val = (pr
                        * (long) Math.pow(base, n - 1)) % mod;

                hs = (hs - val + mod) % mod;

                hs = (hs * base) % mod;

                long nc = a.charAt(i) - 'a' + 1;

                hs = (hs + nc) % mod;

                left++;

                if (hs == hash) {

                    // int start = i - n + 1;

                    // if (a.substring(start, start + n).equals(b)) {
                        return true;
                    // }
                }
            }
        }

        return false;

    }

    public int repeatedStringMatch(String a, String b) {
        String temp = a;
        int rep = 1;
        while (temp.length() < b.length()) {
            temp += a;
            rep++;
        }
        if (temp.equals(b))
            return rep;
        if (RabinC(temp, b))
            return rep;
        temp += a;
        rep++;
        if (RabinC(temp, b))
            return rep;
        return -1;

    }
}