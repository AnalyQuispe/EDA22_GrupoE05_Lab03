package Lab_03;

public class Stack<T extends Comparable<T>> {
	
	private Node<T> root;
	
	boolean isEmpty() {
		return this.root==null;
	}
	
	T peek() throws ExceptionIsEmpty{//Mira el objeto superior de la pila sin sacarlo
		Node<T> aux = this.root;
		while(aux.getNextNode() != null)
			aux = aux.getNextNode();
		
		return aux.getDato();
	}
	
	T pop() throws ExceptionIsEmpty{//Devuelve y elimina el objeto superior de la pila
		Node<T> aux = this.root;
		while(aux.getNextNode() != null) 
			aux = aux.getNextNode();
		return null;
	}
	
	T push(T item) {
		if(this.isEmpty()) {
			this.root=new Node<T>(item);
		}
		else {
			Node<T> aux = this.root;
			while(aux.getNextNode()!=null) {
				aux=aux.getNextNode();
			}
			aux.setNextNode(new Node<T>(item));

		}
		return item;
		
	}
	
	int search(T element) {
		Node<T> aux = this.root;
		int pos=1;
		do {
			if (aux.getDato().compareTo(element)==0)
				return pos;
			else {
				aux=aux.getNextNode();
				pos++;
			}
		}
		while (aux.getNextNode() != null);
			
		
		return (Integer) null;
	}

}
