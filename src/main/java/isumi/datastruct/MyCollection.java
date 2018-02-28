package isumi.datastruct;

public interface MyCollection<E> {

    boolean add(E e);

    MyIterator<E> iterator();

}
