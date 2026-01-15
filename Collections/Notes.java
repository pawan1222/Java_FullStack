package Collections;
/*

Collection Framework:
    It provides a mechanism to perform CRUD operation, searching operation and sorting
    operation on group of objects.

Collections:
    Group of object store inside another object.

Framework:
    It has many inbuilt classes and interfaces.

    Collection Hierarchy:
                ---------------------
                 Iterable (Interface)
                        |
                    Collection
                        |
    ----------------------------------------------------------------------------------------
        |                                       |                                       |
     List (Interface)                    Set (Interface)                        Queue (Interface)
        |                                       |                                         |
    -------------------------            --------------------------------             ------------------------
    |       |             |               |           |             |                        |            |
 ArrayList  LinkedList  Vector          HashSet    TreeSet   LinkedHashSet         PriorityQueue   LinkedList
                          |                           
                        Stack                                           


    List:
        It is a interface which extends Collection interface.
        It is present inside java.util package.
        List is a interface so we cannot create its object.
        But we can use as a reference variable.

        It can store different types of objects/elements.
        It is dynamic in size.
        It can maintain insertion order.
        It can store duplicate elements.
        It maintains index for each element.
        Index starts from 0.
        Random access of elements is possible using index.
        It allows null values.

        Methods of List interface:

        1.To add an element:
                add(Object o)
                addall(Collection c)
                add(int index, Object o)
                addAll(int index, Collection c)

            2.To remove an element:
                remove(Object o)
                remove(int index)
                removeAll(Collection c)
                clear()

            3.To search an element:
                contains(Object o)
                containsAll(Collection c)
                indexOf(Object o)
                lastIndexOf(Object o)

            4.To access elements:
                get(int index)
                iterator()
                listIterator()
                forEach(Consumer action)


            add(Object o):
                It is used to add the specified element to the end of the list.
                return type: boolean
                Returns true if the element is added successfully.

            size():
                It is used to get the number of elements present in the list.
                return type: int

            get(int index):
                It is used to get the element present at the specified index.
                return type: Object

            addAll(Collection c):
                It is used to add all the elements of the specified collection to the end of the list.
                return type: boolean
                Returns true if the elements are added successfully.

            addAll(int index, Collection c):
                It is used to add all the elements of the specified collection at the specified index.
                return type: boolean
                Returns true if the elements are added successfully.

            remove(int index):
                It is used to remove the specified element from the list.
                return type: Object
                Returns the removed element.

            remove(Object o):
                It is used to remove the specified object from the list.
                return type: boolean
                Returns true if the object is removed successfully.
                if multiple occurences are present, removes the first occurence.

            removeAll(Collection c):
                It is used to remove all the elements of the specified collection from the list.
                return type: boolean
                Returns true if the elements are removed successfully.

            clear():
                It is used to remove all the elements from the list.
                return type: void

            contains(Object o):
                It is used to check whether the specified object is present in the list or not.
                return type: boolean
                Returns true if the object is present in the list.

            containsAll(Collection c):
                It is used to check whether all the elements of the specified collection are present in the list or not.
                return type: boolean
                Returns true if all the elements are present in the list.


            
            
            

            
        In all the classes collection heirarchy toString() ,hashCode() and equals() methods are already overridden.

        In java we have two types of collections:
            1. Non-Generic Collection
            2. Generic Collection
                In Generic collection we can specify the type of objects and store same type of objects only.
                for that we use angle brackets <> while creating collection object.
                inside angle brackets we specify the type of objects to be stored.

        For each Loop or anvance for loop or enhanced for loop:
            It is used to traverse the elements of array and collection.
            Syntax:
                for(DataType variable: collection/array){
                    //body
                }
            
        Q-> Difference between for loop and for each loop ?
         -> For loop:
                we can use break and continue condition in it.

         -> For each:
                Iterate over the list of elements sequentially.
                we cannot use break and continue condition in it.
        
        Iterator:
            It is used to traverse the elements of collection.
            It is present inside java.util package.
            It is a interface.
            It provides three methods:
                
                1.hasNext():
                    It is used to check whether the next element is present or not.
                    return type: boolean
                2.next(): 
                    It is used to get the next element.
                    return type: Object
                3.remove(): 
                    It will remove the last element returned by the iterator.
                    which means it removes the current element.
                    if try to use remove() method before calling next() method then it will throw IllegalStateException.
                    return type: void


                with the help of iterator we can traverse in forward direction only.

                Syntax to create Iterator object:
                    Iterator itr = collectionObject.iterator();

            






    
*/
public class Notes {
    
}
