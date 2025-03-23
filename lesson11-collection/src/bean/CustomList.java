package bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<E> implements IList<E> {
    private int size;
    private int DEFAULT_CAPACITY = 10;
    private E[] elements;

    public CustomList() {
        elements = createGenericArray(DEFAULT_CAPACITY);
    }

    @Override
    public boolean add(E e) {
        if (size == elements.length) {
            elements = grow();
        }
        elements[size] = e;
        size++;
        return false;
    }

    @Override
    public boolean add(int index, E e) {
        return false;
    }

    @Override
    public E get(int index) {
        return elements[index];
    }

    @Override
    public void set(int index, E e) {
        elements[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    private E[] createGenericArray(int length) {
        return (E[]) Array.newInstance(Object.class, length);
    }

    private E[] grow() {
        int newSize = size * 3/2;
        return (E[]) Arrays.copyOf(elements, newSize);
    }

}
