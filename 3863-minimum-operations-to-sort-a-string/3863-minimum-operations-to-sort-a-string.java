class Solution {
    public int minOperations(String s) {
         int n = s.length();

        // Check whether the string is already sorted
        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) < s.charAt(i - 1)) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return 0;
        }

        // A reversed string of length 2 cannot be changed
        if (n == 2) {
            return -1;
        }

        char mn = 'z';
        char mx = 'a';

        for (int i = 0; i < n; i++) {
            mn = (char) Math.min(mn, s.charAt(i));
            mx = (char) Math.max(mx, s.charAt(i));
        }

        // One operation
        if (s.charAt(0) == mn || s.charAt(n - 1) == mx) {
            return 1;
        }

        // Check whether minimum occurs before the last position
        // or maximum occurs after the first position
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == mn) {
                return 2;
            }
        }

        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == mx) {
                return 2;
            }
        }

        return 3;
        
    }
}