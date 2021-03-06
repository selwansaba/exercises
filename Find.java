/**
 * Created by lenovo on 03/05/2021.
 */
public class Find<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public void addFrist(E element) {
        head = new Node<E>(element, head);
        if (size == 0) tail = head;
    }

    public String find(){
        Node<E> i= head.getNext();
        String all= "";
        while (i !=null )
        {

            all=all+i.getElement().toString()+"\n";
            i= i.getNext();

        }
        return all;
    }

    public static class Node<E> {

        private E element;
        private Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        Find<Integer> list = new Find<>();
          list.addFrist(1);
          list.addFrist(2);
        System.out.println(list.find());
    }
}
