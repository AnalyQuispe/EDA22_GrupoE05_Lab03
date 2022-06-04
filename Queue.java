public interface Queue<E> {
  boolean add(E x);
  boolean offer(E x); 
  E remove() throws ExceptionIsEmpty; 
  E poll() throws ExceptionIsEmpty; 
  E element() throws ExceptionIsEmpty;
  E peek();
  boolean isEmpty();
}
