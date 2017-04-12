public interface Deque<T>{
    //pop & push
    public T pop();
    public void push(T x);

    //removing
    public T poll();
    public T pollFirst();
    public T pollLast();
    public T removeFirst();
    public T removeLast();
    public T remove();

    //adding
    public void addFirst(T x);
    public void addLast(T x);
    public boolean add(T x);
    
    //peek
    public T peekFirst();
    public T peekLast();
    public T peek();

    public boolean isEmpty();
    public int size();
}
