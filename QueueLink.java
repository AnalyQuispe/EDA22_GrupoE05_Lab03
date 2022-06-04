public class QueueLink<E> implements Queue<E> {
  private Node<E> root;

  public QueueLink(){
    this.root = null;
  }
 
  public boolean add(E x) {
    if(isEmpty())
      this.root = new Node<E>(x,this.root);
    else{
      Node<E> aux = this.root;
      for(; aux.getNext() != null; aux = aux.getNext());
      aux.setNext(new Node<E>(x));
    }
    return true;
  }

  public boolean offer(E x) {
    return false;
  }

  public E remove() throws ExceptionIsEmpty {
    if (isEmpty())
      throw new ExceptionIsEmpty("La cola esta vacia...");
    E item = this.root;
    this.root = item.getNext(); 
    return item;
  }

  public E poll() throws ExceptionIsEmpty {
    return null;
  }

  public E element() throws ExceptionIsEmpty { 
    if (isEmpty())
      throw new ExceptionIsEmpty("La cola esta vacia...");
    E item = this.root;
    return E item;
  }

  public E peek() {
    return null;
  }
  
  public boolean isEmpty() {
    return this.root == null;
  }

  public String toString() {
    String str= "";
    for (Node<E> aux = this.first; aux != null; aux = aux.getNext()){
      str += aux.getData() + ", ";
    }
  }
}
