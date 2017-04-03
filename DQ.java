public class DQ <T> implements Deque <T>{
    
    private DLLNode <T> _front, _end;
    private int _size;
    
    public DQ {
        _front = _end = null;
	_size = 0;
    }
    /*
     //pop & push
    public T pop();
    public void push(T x);
    */

    //removing
    public T remove() {
	if (isEmpty()) {
	    return null;
	}
	else {
	}
    }
	    
	    
    public T removeFirst();

    //adding
    public void add(T x);
    public void addFirst(T x);
    public void addLast(T x);
    
    //peek
    public T peekFirst();
    public T peekLast();

    public boolean isEmpty() {
	if (_size == 0) 
	    return true;
	return false;
    }
    
}

