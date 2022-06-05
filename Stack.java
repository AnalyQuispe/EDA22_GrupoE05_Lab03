public interface stack<E>{
	void push(E x);
	E pop() throws ExceptionIsEmpty;
	boolean isEmpty();
}
