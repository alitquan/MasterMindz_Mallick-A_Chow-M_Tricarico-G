public interface Deque<T>{
    //pop & push
    public T pop();
    public void push(T x);

    //removing
    public T poll();
    public T pollFirst();
    public T pollLast();

    //adding
    public void add(T x);
    public void addFirst(T x);
    public void addLast(T x);
    
    //peek
    public T peekFirst();
    public T peekLast();

    public boolean isEmpty();
    public int size();
}
