package bean;

public interface IList <E>{
    boolean add(E e);
    boolean add(int index, E e);
    E get(int index);
    void set(int index, E e);
    int size();
}
