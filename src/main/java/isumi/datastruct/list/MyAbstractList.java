package isumi.datastruct.list;

import isumi.datastruct.MyIterator;

public abstract class MyAbstractList<E> implements MyList<E> {
    public MyIterator<E> iterator() {
        return new Itr();
    }



    class Itr implements MyIterator{
        int cursor = 0;

        public boolean hasNext() {
            if(cursor >= size()){
                return false;
            }else{
                return true;
            }
        }

        public E next() {
            return get(cursor++);
        }

    }

}
