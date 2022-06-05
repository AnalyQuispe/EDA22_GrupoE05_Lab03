public class StackArray<E> implements stack<E>{
	private int tope;
	private E[] array;
	
	public StackArray(int n) {
		this.array=(E[])new Object[n];
		this.tope=-1;
	}
	
	public void push(E x) {
		if(this.tope<this.array.length-1)
			this.array[++this.tope]=x;
		else
			System.out.println("stack esta lleno...");
	}
	
	public E top() throws ExceptionIsEmpty{
		if(isEmpty())
			throw new ExceptionIsEmpty("Stack esta vacio...");
		E item=this.array[this.tope];
		return item;
	}
	public boolean isEmpty() {
		return this.tope==-1;
	}
	public String toString() {
		String str="";
		for(int i=0;i<=this.tope;i++)
			str+=this.array[i]+", ";
		return str;  
	}
}