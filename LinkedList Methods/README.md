# LinkedList Methods

| Method                 | Description                                                       | Return Type    |
|------------------------|-------------------------------------------------------------------|---------------|
| add()                  | Add an item to the list.                                        | boolean, void |
| addAll()               | Add a collection of items to the list.                          | boolean       |
| addFirst()             | Adds an item to the beginning of the list.                      | void          |
| addLast()              | Adds an item to the end of the list.                            | void          |
| clear()                | Remove all items from the list.                                | void          |
| clone()                | Create a copy of the LinkedList.                               | Object        |
| contains()             | Checks whether an item exists in the list.                     | boolean       |
| descendingIterator()   | Returns an iterator to loop through the items of the list in reverse order. | Iterator      |
| element()              | Retrieves the first item in the list (Similar to `getFirst()`). | T             |
| forEach()              | Perform an action on every item in the list.                   | void          |
| get()                  | Return the item at a specific position in the list.            | T             |
| getFirst()             | Returns the first item in the list.                            | T             |
| getLast()              | Returns the last item in the list.                             | T             |
| indexOf()              | Return the position of the first occurrence of an item in the list. | int       |
| isEmpty()              | Checks whether the list is empty.                              | boolean       |
| iterator()             | Return an Iterator object for the LinkedList.                  | Iterator      |
| lastIndexOf()          | Return the position of the last occurrence of an item in the list. | int       |
| listIterator()         | Return a ListIterator object for the LinkedList.               | ListIterator  |
| offer()                | Adds an item at the end of the list.                           | boolean       |
| offerFirst()           | Adds an item at the beginning of the list.                     | boolean       |
| offerLast()            | Adds an item at the end of the list.                           | boolean       |
| peek()                 | Retrieves the first item in the list (Similar to `getFirst()`). | T             |
| peekFirst()            | Retrieves the first item in the list (Similar to `peek()`).    | T             |
| peekLast()             | Retrieves the last item in the list.                           | T             |
| poll()                 | Retrieves and removes the first item in the list.              | T             |
| pollFirst()            | Retrieves and removes the first item in the list (Similar to `poll()`). | T     |
| pollLast()             | Retrieves and removes the last item in the list.               | T             |
| pop()                  | Returns the first element in the list (Similar to `removeFirst()`). | T   |
| push()                 | Adds an item to the beginning of the list (Similar to `addFirst()`). | void  |
| remove()               | Remove an item from the list.                                  | boolean, T    |
| removeAll()            | Remove a collection of items from the list.                    | boolean       |
| removeFirst()          | Removes the first item in the list.                            | T             |
| removeFirstOccurrence()| Removes the first occurrence of a specified item in the list.  | boolean       |
| removeIf()             | Remove all items from the list that meet a specified condition. | boolean       |
| removeLast()           | Removes the last item in the list.                             | T             |
| removeLastOccurrence() | Removes the last occurrence of a specified item in the list.   | boolean       |
| replaceAll()           | Replace each item in the list with the result of an operation on that item. | void      |
| retainAll()            | Remove all elements from the list which do not belong to a specified collection. | boolean   |
| set()                  | Replace an item at a specified position in the list.           | T             |
| size()                 | Return the number of items in the list.                        | int           |
| sort()                 | Sort the list.                                                 | void          |
| spliterator()          | Return a Spliterator object for the LinkedList.               | Spliterator   |
| subList()              | Return a sublist which provides access to a range of this list's items. | List       |
| toArray()              | Return an array containing the list's items.                   | Object[]      |
