package isumi.datastruct.list.link;

import isumi.datastruct.MyIterator;
import isumi.datastruct.list.MyList;

public class MyLinkList<E> implements MyList<E> {

    private Node<E> first;
    private Node<E> last;

    private int size = 0;

    public boolean add(E e) {
        Node n = new Node(e);
        if(size == 0){
            this.first = n;
            this.last = n;
        }else{
            this.last.next = n;
            this.last = n;
        }
        this.size++;
        return true;
    }

    public MyIterator<E> iterator() {
        return null;
    }

    public int size() {
        return 0;
    }

    public E get(int index) {
        return null;
    }

    class Node<E>{
        Node(E e){
            this.element = e;
        }
        E element;
        Node<E> next;
        Node<E> prev;
    }
}
