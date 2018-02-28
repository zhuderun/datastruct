package isumi.datastruct.list.link;

import isumi.datastruct.MyIterator;
import isumi.datastruct.list.MyAbstractList;
import isumi.datastruct.list.MyList;

public class MyLinkList<E> extends MyAbstractList<E> implements MyList<E> {

    private Node first;
    private Node last;

    private int size = 0;

    public boolean add(E e) {
        Node n = new Node(e);
        if(size == 0){
            this.first = n;
            this.last = n;
        }else{
            this.last.next = n;
            n.prev = this.last;
            this.last = n;
        }
        this.size++;
        return true;
    }

    public int size() {
        return size;
    }

    public void removeLast(){
        if(size == 1){
            this.first = null;
            this.last = null;
        }else{
            Node tmp = this.last.prev;
            this.last = tmp;
            this.last.next = null;
        }
        size--;
    }

    public E getLast(){
        return this.last.element;
    }

    public E get(int index) {
        if(index<0 || index>=this.size){
            throw new RuntimeException("out of index");
        }
        Node result = null;
        for(int i=0;i<=index;i++){
            if(i==0){
                result = first;
            }else{
                result = result.next;
            }

        }
        return result == null?null:result.element;
    }

    class Node{
        Node(E e){
            this.element = e;
        }
        E element;
        Node next;
        Node prev;
    }
}
