class MyCalendarTwo {
    static List<int[]> bookings;
    static List<int[]> overlap; 
    public MyCalendarTwo() {
        bookings=new ArrayList<>();
        overlap=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] over:overlap){
            if(startTime<over[1] && endTime>over[0]){
                return false;
            }
        }
        for(int[] books:bookings){
            if(startTime<books[1] && endTime>books[0]){
                int overlapStart=Math.max(startTime,books[0]);
                int overlapEnd=Math.min(endTime,books[1]);
                overlap.add(new int[]{overlapStart, overlapEnd});
            }
        }
        bookings.add(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(startTime,endTime);
 */