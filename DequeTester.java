public class DequeTester{
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
	test.add("1");
	test.add("2");
	test.add("3");
	System.out.println("should read 1<---2<---3 or 3--->2--->1, where 1 is the _front");
        System.out.println("your implementation: " + test);
	

	Deque <String> experiment = new DQ <String> ();
	System.out.println("Testing peekLast() ");
	System.out.println("Adding 'hi'");
	experiment.add("hi");
	if (experient.peekLast== "hi") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'b'");
	experiment.add("b");
	if (experient.peekLast == "b") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'whatsGood'");
	experiment.add("whatsGood");
	if (experient.peekLast == "whatsGood") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("\nTesting peekFirst:");
	if (experiment.peekFirst == "hi")
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	    
	
    }
    
