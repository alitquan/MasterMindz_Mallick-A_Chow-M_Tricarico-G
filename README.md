# Double-ended queue lab (aka deque)
## Team Name: MasterMindz

## Roster: Alitquan Mallick, Melanie Chow, Gian "Giant" Tricarico

### Underlying Container: Doubly-Linked List
We decided to use a doubly-linked list as the underlying container. We did not choose an ArrayList as a container because then we would
have to keep in mind the capacity of the container and runtimes would be affected by the resizing of the ArrayList. Another big factor was 
the poll() and remove() methods, which involved the removal of an element. In an ArrayList, this removal would require a linear runtime due to the fact 
that every element of the ArrayList would have to be shifted down. With a doubly-linked list, it would have constant runtime because
the only step needed would be to set the front or the back to the nextNode or the prevNode. We chose a doubly-linked list rather than 
a single one so that the deque would not require a traversal of the list
in order to add or remove at the end.

### Choice of Methods
We chose to include the following methods because they were the most important for the deque to function as both a stack and a queue, as specified by
the *Deque* interface.

__Methods included:

* `pop()`: retrieves and removes from the front of the deque
* `push(E e)`: adds to the front of the deque
* `pollFirst()`: removes from front of the deque; prints null if empty
* `pollLast()`: removes from end of the deque; prints null if empty
* `poll()`: same as `pollFirst()`
* `removeFirst()`: removes from front of the deque
* `removeLast()`: removes from end of the deque
* `remove()`: same as `removeFirst()`
* `peekFirst()`: returns element at the front of the deque
* `peekLast()`: returns element at the end of the deque
* `peek()`: same as peekFirst()
* `addFirst(E e)`: adds to the front of the deque
* `addLast(E e)`: adds to the end of the deque
* `add(E e)`: same as `addFirst()`
* `size()`: returns number of elements in deque
* `isEmpty()`: returns true if the deque is empty
* `toString()`: over-ridden method to give an illustration of deque

We prioritized `pollFirst()` and `pollLast()` over `removeFirst()` and `removeLast()` because we wanted to avoid the throwing of errors 
while the code was running, and poll's null return aspect seemed to facilitate this avoidance. We did not bother using any of the 
`offer()` variations because our doubly-linked list does not need a capacity.

#### Changes made due to code review:
* removal of the List.java and LList.java, both of which were unnecessarily on the repo
* further analysis of the choice of a doubly-linked list as a container in the readMe
* removal of poll() and add() which seemed redundant
* upgraded consistency of whitespace in code
* main method replaced with our original dequeTester
* put poll() and add() back in because they are in the *Deque* interface
(these methods are part of the encapsulation that allows the deque to function as a queue)
* add the remove() methods
