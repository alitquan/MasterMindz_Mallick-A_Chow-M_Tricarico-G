# Double-ended queue lab (aka deque)
Team Name: MasterMindz

Roster: Alitquan Mallick, Melanie Chow, Gian "Giant" Tricarico

We chose to include the following methods because they were the most important for the deque to function as both a stack and a queue. We had originally intended to include the remove methods rather than the poll methods, but we found that in our implementations, we returned null when the removal was unsuccessful rather than throwing an exception, so we changed the method signatures to show that they were actually poll() as described in the *Deque* interface.

Methods included:

* pop()
* push(E e)
* poll()
* pollFirst()
* pollLast()
* peekFirst()
* peekLast()
* add(E e)
* addFirst(E e)
* addLast(E e)
* size()

We decided to use a doubly linked list as the underlying container rather than a singly linked list or an ArrayList so that adding and removing from either side would not require traversing through the rest of the list.