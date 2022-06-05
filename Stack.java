public interface Stack<E>{
	void push(E x);
	E top() throws ExceptionIsEmpty;
	boolean isEmpty();
}
