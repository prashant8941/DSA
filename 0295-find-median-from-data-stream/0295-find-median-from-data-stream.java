class MedianFinder {
    List<Integer> list;

    public MedianFinder() {
        list = new ArrayList<>();

    }

    public void addNum(int num) {
        int idx = Collections.binarySearch(list, num);

        if (idx < 0)
            idx = -idx - 1;

        list.add(idx, num);

    }

    public double findMedian() {
        if (list.size() % 2 != 0) {
            double ans = (double) list.get(list.size() / 2);
            return ans;
        } else {
            int a = list.get(list.size() / 2);
            int b = list.get(list.size() / 2 - 1);
            double ret = (a + b) / 2.0;
            return ret;
        }

    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */