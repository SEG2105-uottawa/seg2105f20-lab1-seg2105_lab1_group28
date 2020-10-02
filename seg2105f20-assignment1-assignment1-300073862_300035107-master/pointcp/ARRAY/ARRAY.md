
Commit your data about arrays here.

Use suitable tables and draw conclusions
from an analysis of the data. From your conclusions,
develop recommendations to designers.



size of linked list, vector and ordinary array: 20000000
|       method            | running time of sum elements in each array
| ordinary array        |    11
| LinkedList              |    83
| Vector                    |    513

|       method            | running time of adding element 
| ordinary array        |    489
| LinkedList              |    9411
| Vector                    |    1335


From our analysis, we find that for the same size of LinkedList, Vector and ordinary array, adding elements to LinkedList and Vector especially LinkedList will take more time. And adding elements to ordinary array will take less time. LinkedList and Vector are dynamic structure, which can grow and shrink depending upon the data. It is not like arrays is stored in a contiguous memory location. Thus, when it is needed to add a new element in LinkedList, a seperate memory need to be allocated for this element. Therefore, adding elements to LinkedList or Vector will take more time. 
LinkedList can be used as the base data structure for stacks and queues
Vector is a dynamic array and implement the List interface, so it can be used to create resizable arrays.
Ordinary array can be used in the case when we know the exact size of something. 

What's more, from the table above, we can find that using iterator for LinkedList and Vector to sum element will take more time than using for loop for ordinary array to sum element.
Thus, when in the situation we need to use full size structure, ordinary array is a good choice, since it will take less time for adding elements and do some search and calculation.
While, when we need to use dynamic structure dealing with small number of size, LinkedList maybe better than Vector. Since using iterator for linked list to sum element take less time than using vectro to sum element. Thus, using LinkedList is more efficient. However, when dealing with large number of size, Vector maybe a better choice, because using LinkedList to add large number of elements take too much time.
