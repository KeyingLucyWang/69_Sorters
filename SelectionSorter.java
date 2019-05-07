import java.util.ArrayList;

public class SelectionSorter extends Sorter {

	  /**
      Construct an instance to process the user's data
     */
    public SelectionSorter(  ArrayList<String> usersData) {
        super( usersData);
    }
    

    /**
      sort the user's data, implementing insertion sort
     */
    public void mySort() {
        // your code here
       
        for (int currentIndex = 0; currentIndex < elements.size(); currentIndex++){
          for (int index = currentIndex; index < elements.size(); index++ ){
            String currentElement = elements.get( currentIndex);
            String element = elements.get(index);
            if( currentElement.compareTo( element) > 0){
              elements.set( currentIndex, element);
              elements.set( index, currentElement);
          }
        }
      }
    }
}
