public interface Stack<E>{
	void push(E x);
	E peek() throws ExceptionIsEmpty;
	boolean isEmpty();
}
