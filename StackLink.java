public class StackLink <E> implements stack <E>{
	private Node<E> tope;
	
	public StackLink() {
		this.tope=null;
	}
	
	public void push(E x) {
		this.tope=new Node<E>(x,this.tope);
	}
	
	public E top() throws ExceptionIsEmpty{
	if(isEmpty())
			throw new ExceptionIsEmpty("Stack esta vacio...");
		E item=this.tope.getData();
		return item;
	}
	public boolean isEmpty() {
		return this.tope==null;
	}
}
