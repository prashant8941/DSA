class Solution {
    public int myAtoi(String s) {

        s = s.trim();
        if (s.length() == 0)
            return 0;
        int n = s.length();
        boolean neg = false;
        if (s.charAt(0) == '-') {
            neg = true;
        }
        int ind = -1;
        if (neg == false) {
            ind = 0;
        } else {
            ind = 1;
        }
        if(s.charAt(0) =='+'){
            ind++ ; 
        }
        long num = 0;

        for (int i = ind; i < n; i++) {
            char ch = s.charAt(i);

            if (ch < '0' || ch > '9') {
                break;
            }

            int digit = ch - '0';
            num = num * 10 + digit;

            if (!neg && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }

            if (neg && num > 2147483648L) {
                return Integer.MIN_VALUE;
            }
        }

        if (neg) {
            return (int) -num;
        }

        return (int) num;

    }
}