public class DequeTester {
    public static void main (String [] args) {
	/*
	  change the name of "DQ" to the name of the className
	  assigned to your implementation of deque
	 */

	/*testing for peekFirst, with the assumption that the
	  first case of add (queue is empty) is correctly coded
	*/

	//testing for add, assuming toString is correct & add is implemented to insert at the _end
	Deque <String> test = new DQ <String>();
	Deque <String> experiment = new DQ <String> ();
	test.add("1");
	test.add("2");
	test.add("3");
	System.out.println("should read 1<---2<---3 or 3--->2--->1, wherein 1 is the _front");
        System.out.println("your implementation: " + test);
	
	// new DQ 
	System.out.println("\nTesting peekLast() ");
	System.out.println("Adding 'hi'");
	experiment.add("hi");
	if (experiment.peekLast()== "hi") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'b'");
	experiment.add("b");
	if (experiment.peekLast() == "b") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'whatsGood'");
	experiment.add("whatsGood");
	if (experiment.peekLast() == "whatsGood") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("\nTesting peekFirst:");
	if (experiment.peekFirst() == "hi")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// testing for size()
	System.out.println("Testing for size()");
	if (experiment.size() == 3)
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// testing for addFirst()
	System.out.println ("\nTesting for addFirst()");
	experiment.addFirst("zimbabwe");
	if (experiment.peekFirst() == "zimbabwe")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	//testing for addLast()
	// testing for addFirst()
	System.out.println ("\nTesting for addLast()");
	experiment.addLast("zambia");
	if (experiment.peekLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	/* 
	   Uncomment out the poll methods or the remove methods (depends
	   on what you chose to implement). keep in mind that the test
	   for remove is intended to throw an error
	*/

	// poll() and pollFirst(), assuming that they are the same 
	System.out.println("\nTesting poll()");
	if (experiment.poll() == "zimbabwe")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// pollLast()
	System.out.println("\nTesting pollLast()");
	if (experiment.pollLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	System.out.println("\nShould return null...");
        System.out.println(experiment.poll());
	System.out.println(experiment.poll());
	System.out.println(experiment.poll());
	System.out.println(experiment.poll());
	System.out.println(experiment.poll());
	
	/*
	// remove() and removeFirst(), assuming that they are the same 
	System.out.println("\nTesting remove()");
	if (experiment.remove() == "zimbabwe")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// pollLast()
	System.out.println("\nTesting removeLast()");
	if (experiment.removeLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("\nShould throw error");
	System.out.println(experiment.remove());
	System.out.println(experiment.remove());
	System.out.println(experiment.remove());
	System.out.println(experiment.remove());
	System.out.println(experiment.remove());
	*/

	//adding more to experiment
	System.out.println ("\nAdding more to experiment....");
	experiment.add("internet");
	experiment.add("power");

	/*
	// element(); should eventually throw an error
	if (experiment.element() == experiment.peekFirst()) 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	experiment.remove();
	experiment.remove();
	experiment.element();
	*/
    }
}


	/* methods left:
	   contains(), descendingIterator(), offer(), offerFirst(), offerLast()
	   push(E), pop(), removeFirstOccurrence(), removeLastOccurrence()
	*/
   
	
    
