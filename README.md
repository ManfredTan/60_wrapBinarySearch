# exercise the List.indexOf

[Java API on the `indexOf` method](https://docs.oracle.com/javase/10/docs/api/java/util/List.html#indexOf(java.lang.Object))

based on [solutionsHolmes/5D_genericTypes/OrderedList_inArraySlots_v2/](https://github.com/stuyvesant-cs/solutionsHolmes/tree/master/5D_genericTypes/OrderedList_inArraySlots_v2)
as of 2019-04-10 04:48


# Recursive solution

0. Determine which section the desired value is in, given 2 sections.
1. Determine which section the desired value is in, given 2 sections made from one of the previous sections.
2. 1) Decide between which: if (low > hi) return -1;
   2) Solution to Base case: if (list_iAS.get(currentPage) == findMe) return currentPage;
   3) Recursive abstraction:
    4) Solution to R.A: if (list_iAS.get(currentPage) < findMe) return indexOfRecursively(currentPage + 1, hi, findMe);
    5) Combination: no combination.
    6) Leftover: return indexOfRecursively(low,currentPage - 1, findMe);


0 State the problem
1 State the recursive abstraction
2 Identify the parts of this solution that correspond to the six parts of a generalized recursive solution.
