class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] marked = new boolean[rooms.size()];
        dfs(0, marked, rooms);
        for(int i = 0; i < rooms.size(); i++) {
            if(marked[i] == false) return false;
        }
        return true;
    }
    
    private void dfs(int room, boolean[] marked, List<List<Integer>> rooms) {
        marked[room] = true;
        for(int i : rooms.get(room)) {
            if(!marked[i]) dfs(i, marked, rooms);
        }
    }
}
