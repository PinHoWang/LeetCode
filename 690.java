/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    // idMap < ID, position in List >
    private HashMap<Integer, Integer> idMap = new HashMap<>();
    private int im = 0;
    
    public int getImportance(List<Employee> employees, int id) {
        makeIdMap(employees);
        
        recurHelper(employees, findEmployee(employees, id));
        return im;
    }
    
    private void recurHelper(List<Employee> employees, Employee e) {
        im += e.importance;
        int listSize = e.subordinates.size();
        if(listSize == 0) return;
        
        for(int i = 0; i < listSize; i++) {
            recurHelper(employees, findEmployee(employees, e.subordinates.get(i)));
        }
        
    }
    
    private void makeIdMap(List<Employee> ls) {
        for(int i = 0; i < ls.size(); i++) {
            Employee e = ls.get(i);
            idMap.put(e.id, i);
        }
    }
    
    private Employee findEmployee(List<Employee> l, int id) {
        return l.get(idMap.get(id));   
    }
}
