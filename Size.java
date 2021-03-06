/**
 * Created by lenovo on 03/05/2021.
 */
public class Size<E> {
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public int size() {
        while (head != null) {
            Node<E> x = head.getNext();
            head = x;
            size++;
        }

        return size;
    }

    public void addFrist(E element) {
        head = new Node<E>(element, head);
        if (size == 0) tail = head;
    }

    public String print(){
        Node<E> i= head;
        String all= "";
        while (i !=null)
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

        Size<Integer> list = new Size<>();

        System.out.println(list.size());

    }
}