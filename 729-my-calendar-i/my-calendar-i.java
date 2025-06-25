class MyCalendar {
    private List<int[]> booking;
    public MyCalendar() {
        booking=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
       for (int[] event : booking) {
            int existingStart = event[0];
            int existingEnd = event[1];
            
            if (startTime < existingEnd && endTime > existingStart) {
                return false;
            }
        }
        booking.add(new int[] {startTime, endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */