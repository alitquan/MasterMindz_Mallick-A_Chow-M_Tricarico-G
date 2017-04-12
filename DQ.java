public class DQ <T> implements Deque<T>{
    /*
      all of the methods have constant runtimes, pince
      no transversing ever takes place--- with 
      the exception of toString which has a linear
      runtime
    */
    private DLLNode <T> _front, _end;
    private int _size;
    
    public DQ() {
        _front = _end = null;
	_size = 0;
    }
    
    //pop & push: STACK PROPERTIES- FILO

    // removes from the _end of the deque
    public T pop(){
	return removeFirst();
    }
    // adds to the end of the deque
    public void push( T x ){
        addFirst( x );
    }
    
    //same functionality as remove; return null if empty
    public T pollFirst() {
	if ( this.isEmpty() ) {
	    return null;
	}
	else if ( size() == 1 ) {
	    T retVal = _front.getCargo();
	    _front = _end = null;
	    _size--;
	    return retVal;
	}
	else {
	    // temporary node set to hold cargo of designated node
	    T retVal= _front.getCargo();

	    // front set to the next node and prevNode set to null, eliminating the older _front
	    _front= _front.getNext();
	    _front.setPrev( null );
	    _size--;
	    return retVal;
	}
    }

    //retrieves and removes the _end of the queue (last element); returns null if empty
    public T pollLast() {
	if ( this.isEmpty() ) {
	    return null;
	}
	else{
	    // temporary node set to hold cargo of designated node
	    T retVal= _end.getCargo();

	    // end set to the previous node and nextNode set to null, eliminating the older _end
	    _end= _end.getPrev();
	    _end.setNext(null);
	    _size--;
	    return retVal;
	}
    }
	
    // inserts into _front of queue
    public void addFirst( T x ){
	// if list is empty, _front and _end are set to the same node
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>( x, null, null );
	}
	// otherwise, new node with cargo of x placed at the _front 
	else {
	    DLLNode<T> holder=new DLLNode<T>( x, null, _front );
	    _front=holder;
	}
	_size++;
    }

    // same functionality as add
    public void addLast(T x) {
	// if list is empty, _front and _end are set to the same node
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>( x, null, null );
	}
	// otherwise, new node with cargo of x placed at the _front
	else{
	     _end.setNext(new DLLNode<T>( x, _end, null));
	    _end = _end.getNext();
	}
	_size++;
    }
    
    //returns cargo of _front of deque; returns  null if deque is empty
    public T peekFirst() {
	if ( this.isEmpty() ) {
	    return null;
	}
	return _front.getCargo();
    }

    //returns cargo of _back of deque; returns null if deque is empty
    public T peekLast(){
	if (this.isEmpty()) {
	    return null;
	}
	return _end.getCargo();
    }

    // returns true if deque is empty, false otherwise
    public boolean isEmpty() {
	return (_size == 0); 
    }

    // returns size of deque
    public int size() {
	return _size;
    }

    // overridden toString method to print contents of deque
    public String toString() {
	String retStr = "FRONT----";
	DLLNode<T> trav = _front;
	while ( trav != null ){
	    retStr +=trav.getCargo()+ "<----";
	    trav =trav.getNext();
	}
	retStr = retStr.substring( 0, retStr.length() - 5);
	retStr += "----END";
	return retStr;
    }
    public static void main ( String[] args ) {
        
	//testing for add, assuming toString is correct & add is implemented to insert at the _end
	Deque <String> test = new DQ <String>();
	Deque <String> experiment = new DQ <String> ();
	test.addLast("1");
	test.addLast("2");
	test.addLast("3");
	System.out.println("should read 1<---2<---3 or 3--->2--->1, wherein 1 is the _front");
        System.out.println("your implementation: " + test);
	
	// new DQ 
	System.out.println("\nTesting peekLast() ");
	System.out.println("Adding 'hi'");
	experiment.addLast("hi");
	if (experiment.peekLast()== "hi") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'b'");
	experiment.addLast("b");
	if (experiment.peekLast() == "b") 
	    System.out.println ("success");
	else
	    System.out.println ("failed");
	System.out.println("Adding 'whatsGood'");
	experiment.addLast("whatsGood");
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
	System.out.println ("\nTesting for addLast()");
	experiment.addLast("zambia");
	if (experiment.peekLast() == "zambia")
	    System.out.println ("success");
	else
	    System.out.println ("failed");

	// pollFirst(), assuming that they are the same 
	System.out.println("\nTesting pollFirst()");
	if (experiment.pollFirst() == "zimbabwe")
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
        System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());
	System.out.println(experiment.pollFirst());

	//adding more to experiment
	System.out.println ("\nAdding more to experiment....");
	experiment.addFirst("internet");
	experiment.addFirst("power");
    }
	
	
    
}

