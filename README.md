# Double-ended queue lab (aka deque)
## Team Name: MasterMindz

## Roster: Alitquan Mallick, Melanie Chow, Gian "Giant" Tricarico

### Underlying Container: Doubly-Linked List
We decided to use a doubly-linked list as the underlying container. We did not choose an arrayList as a container because then we would
have to keep in mind the capacity of the container and runtimes would be affected by the resizing of the arrayList. Another big factor was 
the poll() method, which involved the removal of an element. In an arrayList, this removal would require a linear runtime due to the fact 
that every element of the arrayList would have to be shifted down. With a doubly-linked list, it would have constant runtime because
the only step needed would be to set the front or the back to the nextNode or the prevNode. We chose a doubly-linked list rather than 
a single one primarily because of the ease of implementation.

### Choice of Methods
We chose to include the following methods because they were the most important for the deque to function as both a stack and a queue. We 
had originally intended to include the remove methods rather than the poll methods, but we found that in our implementations, we returned 
null when the removal was unsuccessful rather than throwing an exception, so we changed the method signatures to show that they were 
actually poll() as described in the *Deque* interface.

Methods included:

* 'pop()': retrieves and removes end of the deque
* 'push(E e)': adds to the end of the deque
* 'pollFirst()': removes from front of the deque; prints null if empty
* 'pollLast()': removes from end of the deque; prints null if emptu
* 'peekFirst()': returns element at the front of the deque
* 'peekLast()': returns element at the end of the deque
* 'addFirst(E e)': adds to the front of the deque
* 'addLast(E e)': adds to the end of the deque
* 'size()': returns number of elements in deue
* 'toString()': over-ridden method to give an illustration of deque
We prioritized pollFirst() and pollLast() over removeFirst and removeLast() because we wanted to avoid the throwing of errors while the 
code was running, and poll's null return aspect seemed to facilitate this avoidance. We did not bother using any of the 'offer()' 
variations because our doubl-linked list does not need a capacity.

#### Changes made due to code review:
* removal of the List.java and LList.java, both of which were unnecessarily on the repo
* further analysis of the choice of a doubly-linked list as a container in the readMe
* removal of poll() and add() which seemed redundant
* upgraded consistency of whitespace in code
* main method replaced with our original dequeTester
