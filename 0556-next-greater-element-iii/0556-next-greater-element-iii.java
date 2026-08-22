class Solution {
    public int nextGreaterElement(int n) {
         List<Integer> list = new ArrayList<>();

        int temp = n;

        while (temp != 0) {
            list.add(temp % 10);
            temp /= 10;
        }

        Collections.reverse(list);

        int i = list.size() - 2;

        // Step 1: Find first decreasing element from right
        while (i >= 0 && list.get(i) >= list.get(i + 1)) {
            i--;
        }

        // No next permutation
        if (i < 0) {
            return -1;
        }

        // Step 2: Find element just greater than list[i]
        int j = list.size() - 1;

        while (list.get(j) <= list.get(i)) {
            j--;
        }

        // Step 3: Swap
        int t = list.get(i);
        list.set(i, list.get(j));
        list.set(j, t);

        // Step 4: Reverse suffix
        int left = i + 1;
        int right = list.size() - 1;

        while (left < right) {
            t = list.get(left);
            list.set(left, list.get(right));
            list.set(right, t);

            left++;
            right--;
        }

        // Convert to number and check int overflow
        long num = 0;

        for (int digit : list) {
            num = num * 10 + digit;

            if (num > Integer.MAX_VALUE) {
                return -1;
            }
        }

        return (int) num;
        
    }
}