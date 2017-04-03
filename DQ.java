public class DQ <T> implements Deque<T>{
    
    private DLLNode <T> _front, _end;
    private int _size;
    
    public DQ() {
        _front = _end = null;
	_size = 0;
    }
    
    //pop & push: STACK PROPERTIES- FILO
    public T pop(){
	return this.removeLast();
    }
    public void push(T x){
        this.addLast(x);
    }

    //remove-retrieves and removes the head of the queue (first element) 
    public T remove() {
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
	    
	    
    public T removeFirst(){
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

    public T removeLast(){
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
	
    //add-inserts into queue (tail)
    public void add(T x){
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>(x,null,null );
	}
	else{
	DLLNode<T> holder=new DLLNode<T>(x,_end,null);
	_end=holder;
	}
	_size++;
    }
    
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
    
    public void addLast(T x){
	if ( isEmpty() ) {
	    _front = _end = new DLLNode<T>(x,null, null );
	}
	else{
	DLLNode<T> holder=new DLLNode<T>(x,_end,null);
	_end=holder;
	}
	_size++;
    }
    
    //peek
    public T peekFirst(){
	if (this.isEmpty()) {
	    return null;
	}
	return _front.getCargo();
    }
    
    public T peekLast(){
	if (this.isEmpty()) {
	    return null;
	}
	return _end.getCargo();
    }

    public boolean isEmpty() {
	return (_size == 0); 
    }

    public String toString(){
	String retStr="";
	DLLNode<T> trav=_front;
	while (trav!=null){
	    retStr+=trav.getCargo()+"";
	    trav=trav.getNext();
	}
	return retStr;
    }
    public static void main(String[] args){
	Deque<String> DairyQueen=new DQ<String>();
	DairyQueen.add("mango");
	DairyQueen.add("strawberry");
	DairyQueen.add("blitz");

	System.out.println(DairyQueen);
    }
	
	
    
}

