package edu.cmu.cs.cs214.rec04;


/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntList{
    // Write your implementation below with API documentation
    private int totalAdded = 0;

    public boolean add(int value){
        totalAdded++;
        return super.add(value);
    }

    public boolean addAll(IntegerList list){
        for(int i = 0; i < list.size(); i++){
            this.add(list.get(i));
            totalAdded++;
        }
        return true;
    }

    public int getTotalAdded(){
        return totalAdded;
    }
}