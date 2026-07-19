class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        int n = arr.length;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            String tp = arr[i];
            if (!tp.trim().isEmpty()) {
                sb.append(tp);
                if (i > 0) {
                    sb.append(" ");
                }

            }

        }
        String ret = new String(sb);
        return ret.trim();

    }
}