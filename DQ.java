public class DQ <T> implements Deque<T>{
    /*
      all of the methods have constant runtimes-- with 
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
    public T pop(){
	return this.pollLast();
    }
    public void push(T x){
        this.addLast(x);
    }

    //retrieves and removes the _front of the queue (first element); returns null if empty
    public T poll() {
	if (this.isEmpty()) {
	    return null;
	}
	else {
	    T retnode=_front.getCargo();
	    _front=_front.getNext();
	    _front.setPrev(null);
	    _size--;
	    return retnode;
	}
    }
	    

    //same functionality as remove; return null if empty
    public T pollFirst(){
	if (this.isEmpty()) {
	    return null;
	}
	else {
	    T retnode=_front.getCargo();
	    _front=_front.getNext();
	    _front.setPrev(null);
	    _size--;
	    return retnode;
	}
    }

    //retrieves and removes the _end of the queue (last element); returns null if empty
    public T pollLast(){
	if (this.isEmpty()) {
	    return null;
	}
	else{
	    T retnode=_end.getCargo();
	    _end=_end.getPrev();
	    _end.setNext(null);
	    _size--;
	    return retnode;
	}
    }
	
    //inserts into _end of queue
    public void add(T x){
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>(x,null,null );
	}
	else {
	    _end.setNext(new DLLNode<T>(x,_end,null));
	    _end = _end.getNext();
	}
	_size++;
    }

    // inserts into _front of queue
    public void addFirst(T x){
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>(x,null,null );
	}
	else{
	DLLNode<T> holder=new DLLNode<T>(x,null,_front);
	_front=holder;
	}
	_size++;
    }

    // same functionality as add
    public void addLast(T x){
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>(x,null, null );
	}
	else{
	     _end.setNext(new DLLNode<T>(x,_end,null));
	    _end = _end.getNext();
	}
	_size++;
    }
    
    //returns cargo of _front of deque
    public T peekFirst(){
	if (this.isEmpty()) {
	    return null;
	}
	return _front.getCargo();
    }

    //returns cargo of _back of deque
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
	return _size();
    }

    // overridden toString method to print contents of deque
    public String toString(){
	String retStr="FRONT----";
	DLLNode<T> trav=_front;
	while (trav!=null){
	    retStr+=trav.getCargo()+"<----";
	    trav=trav.getNext();
	}
	retStr= retStr.substring(0,retStr.length()-5);
	retStr+="----END";
	return retStr;
    }
    public static void main(String[] args){
	Deque<String> DairyQueen=new DQ<String>();
	DairyQueen.add("mango");
	DairyQueen.add("strawberry");
	DairyQueen.add("blitz");
	DairyQueen.addFirst("luscious");
	DairyQueen.addLast("soup");
	System.out.println(DairyQueen);
	System.out.println("peekFirst() == " + DairyQueen.peekFirst());
	System.out.println("peekLast() == " + DairyQueen.peekLast());
	System.out.println("pollFirst() == " + DairyQueen.pollFirst());
	System.out.println(DairyQueen);
       	System.out.println("pollLast() == " + DairyQueen.pollLast());
	System.out.println(DairyQueen);
    }
	
	
    
}

