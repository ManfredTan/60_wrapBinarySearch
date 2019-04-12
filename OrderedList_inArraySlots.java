/**
  OrderedList_inArraySlots, holding Integers

  A list with the invariant the elements are in order by
  increasing value, implemented using a
  ArrayList<Integer>
 */

public class OrderedList_inArraySlots
    implements OrderedList {

    private java.util.ArrayList<Integer> list_iAS;

    private int cost;

    /**
      @return the index of the first occurrence of
              \findMe in this list, or -1 if
              \findMe is absent from this list.
     */

    // // while-style
    // public int indexOf( Integer findMe) {
    //     int currentPage;
    //     int low = 0;
    //     int hi = list_iAS.size() - 1;
    //
    //     while (low <= hi) {
    //         currentPage = (low + hi)/2;
    //         if (list_iAS.get(currentPage) == findMe) return currentPage;
    //         if (list_iAS.get(currentPage) < findMe) low = currentPage + 1;
    //         else hi = currentPage - 1;
    //     }
    //     return -1;
    // }

    public int indexOf( Integer findMe) {
        cost = 0;
        return indexOfRecursively(0, list_iAS.size() - 1, findMe);
    }

    private int indexOfRecursively( int low, int hi, Integer findMe) {
        cost += 1;

        int currentPage = (low + hi)/2;

        if (low > hi) return -1;
        if (list_iAS.get(currentPage) == findMe) return currentPage;

        else
            if (list_iAS.get(currentPage) < findMe) return indexOfRecursively(currentPage + 1, hi, findMe);
            return indexOfRecursively(low,currentPage - 1, findMe);
    }


    // ------ code from previous assignments below here ----

    public OrderedList_inArraySlots() {
        list_iAS = new java.util.ArrayList<Integer>();
    }

    /**
      @return the number of elements in this list
     */
    public int size(){
        return list_iAS.size();
    }

    /**
      @return a string representation of this Orderedlist_iAS
     */
    public String toString() {
        return list_iAS.toString();
    }


    /**
      Put @value where it belongs in the list.
      @pre: the list is in increasing order
     */
     public boolean add( Integer value) {
         int dest = 0;
         for( ; dest < list_iAS.size() && list_iAS.get( dest) < value
              ; dest++) ;
         // System.out.println( "OL adding " + value
         //                   + " at index " + dest);
         list_iAS.add( dest, value);
         return true;
     }


     /**
      @return element @index from this list
      precondition: @index is within the bounds of the array.
          (Having warned the user about this precondition,
           you should NOT complicate your code to check
           whether the condition was violated.)
     */
    public Integer get( int index ) {
        return list_iAS.get( index);
    }


    /**
      Remove the element at position @index in this list.

      Shift any subsequent elements to the left (that is,
      decrease the index associated with each).

      @return the value that was removed from the list
     */
    public Integer remove( int index) {
        return list_iAS.remove( index);
    }

    // return number of iterations/comparisons
    public int cost() {
        return cost;
    }



}
