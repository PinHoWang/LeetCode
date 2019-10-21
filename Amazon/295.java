class MedianFinder {

    private List<Integer> stream;
    /** initialize your data structure here. */
    public MedianFinder() {
        stream = new ArrayList<>();
    }
    
    public void addNum(int num) {
        if(stream.size() == 0) stream.add(num);
        else {
            int i = 0;
            while(i < stream.size()) {
                if(stream.get(i) < num) i++;
                else break;
            }
            stream.add(i, num);
        }
    }
    
    public double findMedian() {
        return (stream.size() % 2 == 0) ? ((double) (stream.get(stream.size()/2-1) + stream.get(stream.size()/2))) / 2: ((double) stream.get(stream.size()/2));
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
