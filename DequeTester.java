public class DequeTester {

    public static void main(String[] args) {

	Deque<String> tester = new DQ<String>();//replace QQ with whatever the name of your implementation of deque is

	//testing addFirst

	tester.addFirst("princess");
	tester.addFirst("fair");
	tester.addFirst("there");
	tester.addFirst("hello");
	System.out.println(tester); //should become "hello there fair princess"    
	
	//testing removeFirst
	/*
	System.out.println(tester.removeFirst());
	System.out.println(tester.removeFirst());
	System.out.println(tester.removeFirst());
	System.out.println(tester.removeFirst());
	*/
	//testing addLast
	
	tester.addLast("hello");
	tester.addLast("there");
	tester.addLast("fair");
	tester.addLast("prince");
	System.out.println(tester); //should become "hello there fair prince"    
	//testing removeLast
	/*
	System.out.println(tester.removeLast());
	System.out.println(tester.removeLast());
	System.out.println(tester.removeLast());
	System.out.println(tester.removeLast());
	*/
	//testing peekFirst and peekLast

	tester.addLast("i'm first");
	tester.addLast("i'm last");
	System.out.println(tester.peekFirst());
	System.out.println(tester.peekLast());

	/*
	  terminal should display:

hello   there   fair   princess
hello
there
fair
princess
hello   there   fair   prince
prince
fair
there
hello
i'm first
i'm last

	*/

    }

}
