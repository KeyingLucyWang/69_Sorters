/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {


    /**
      Construct an instance to process the user's data
     */
    public InsertionSorter(  ArrayList<String> usersData) {
        super( usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        // your code here
        for( int indexToSort = 1; indexToSort < elements.size(); indexToSort++){
        insert1( indexToSort);
        System.out.println( "    dbg: "
        + "after inserting element " + indexToSort
        + " elements: " + elements
        );
      }
    }

    public void insert1( int alreadyInserted){
    String valueToInsert = elements.get(alreadyInserted);
    int dropIndex = alreadyInserted;
    // for debugging
    //System.out.println( valueToInsert);
    for( int indexToCompare = alreadyInserted - 1; indexToCompare >= 0 && valueToInsert.compareTo( elements.get( indexToCompare)) < 0; indexToCompare--){
      if ( valueToInsert.compareTo(elements.get( indexToCompare)) < 0){
        dropIndex = indexToCompare;
        if( indexToCompare == 0){
          elements.set(1, elements.get( 0));
          elements.set( 0, valueToInsert);
        }
        else
          elements.set( indexToCompare + 1, elements.get( indexToCompare));
      }
    }
    // for debugging
    //System.out.println( dropIndex);
    elements.set( dropIndex, valueToInsert);
  } 
}
