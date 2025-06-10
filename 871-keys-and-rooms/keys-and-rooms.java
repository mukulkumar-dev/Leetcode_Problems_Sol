class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int start=0;
        boolean[] visit=new boolean[rooms.size()];
        visit[start]=true;
        visitRoom(rooms,visit,start);
        for(boolean neighbour: visit){
            if(!neighbour){
                return false;
            }
        }
        return true;
    }
    
    public static void visitRoom(List<List<Integer>> rooms, boolean[] visit, int start){
        for(int num:rooms.get(start)){
            if(!visit[num]){
                visit[num]=true;
                visitRoom(rooms,visit,num);
            }
        }
    } 
}