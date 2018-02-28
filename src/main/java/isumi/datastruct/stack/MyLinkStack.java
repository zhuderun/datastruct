package isumi.datastruct.stack;

import isumi.datastruct.list.link.MyLinkList;

public class MyLinkStack<E> implements Stack<E>{

    private MyLinkList<E> list;

    public MyLinkStack(){
        list = new MyLinkList();
    }

    public boolean push(E e) {
        this.list.add(e);
        return true;
    }

    public E pop() {
        E e = this.list.getLast();
        this.list.removeLast();
        return e;
    }
}
