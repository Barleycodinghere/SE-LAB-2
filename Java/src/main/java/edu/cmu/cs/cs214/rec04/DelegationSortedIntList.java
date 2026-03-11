package edu.cmu.cs.cs214.rec04;

/**
 * DelegationSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class DelegationSortedIntList implements IntegerList {
    // Write your implementation below with API documentation
    private SortedIntList delegatedList = new SortedIntList();
    private int totalAdded = 0;

    public boolean add(int value){
        totalAdded++;
        delegatedList.add(value);
        return true;
    }
    
    public boolean addAll(IntegerList list){
        totalAdded += list.size();
        delegatedList.addAll(list);
        return true;
    }

    public int getTotalAdded(){
        return totalAdded;
    }
    public int get(int index){ return 0;};
    public boolean remove(int num){return false;};
    public boolean removeAll(IntegerList list){return false;};
    public int size(){return delegatedList.size();};
}