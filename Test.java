public class Test {
	public static void main(String []args) {
		
		stack<Integer> lint=new StackArray<Integer>(6);
		try {
		lint.push(10);
		System.out.println(lint);
		lint.push(14);
		System.out.println(lint);
		lint.push(7);
		System.out.println(lint);
		lint.push(23);
		System.out.println(lint);
		lint.push(16);
		System.out.println(lint);
		lint.push(9);
		System.out.println(lint);
		lint.push(230);
		System.out.println(lint);
		
		
		
		System.out.println("Tope: "+lint.top());
	
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}
		
		/*stack<Integer> lint=new StackLink<Integer>();
		try {
		lint.push(10);
		System.out.println("Tope: "+lint.top());
		lint.push(14);
		System.out.println("Tope: "+lint.top());
		lint.push(7);
		System.out.println("Tope: "+lint.top());
		lint.push(23);
		System.out.println("Tope: "+lint.top());
		lint.push(16);
		System.out.println("Tope: "+lint.top());
		lint.push(9);
		System.out.println("Tope: "+lint.top());
		lint.push(230);
		System.out.println("Tope: "+lint.top());
		
		
		
		
	
		}
		catch(ExceptionIsEmpty x) {
			System.out.println(x.getMessage());
		}*/
	}
}
