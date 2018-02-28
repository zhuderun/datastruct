package isumi.datastruct.list;

import isumi.datastruct.MyCollection;

public interface MyList<E> extends MyCollection<E> {

    int size();

    E get(int index);

}
