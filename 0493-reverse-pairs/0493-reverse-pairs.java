class Solution {
    public static int merge(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (right <= high && arr[i] > 2L * arr[right]) {
                right++;
            }
            count += right - (mid + 1);
        }
        int i = low;
        int j = mid + 1;
        int temp[] = new int[high - low + 1];
        int k = 0;
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];

            } else {

                temp[k++] = arr[j++];

            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        for (int p = low; p <= high; p++) {
            arr[p] = temp[p - low];
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high)
            return count;
        int mid = low + (high - low) / 2;
        count += mergeSort(arr, low, mid);
        count += mergeSort(arr, mid + 1, high);
        count += merge(arr, low, mid, high);
        return count;
    }

    public int reversePairs(int[] nums) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);

    }
}