package bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<E> implements IList<E> {
	
	private int size;
	private int DEFAULT_CAPACITY = 6;
	private E[] elements; // {"a", n, n, n, n, n}
	
	public CustomList() {
		elements = createGenericArray(DEFAULT_CAPACITY);
	}

	@Override
	public boolean add(E newValue) {
		if (size == elements.length) {
			elements = grow();
		}
		elements[size] = newValue;
		size++;
		return true;
	}

	@Override
	public boolean add(int posToBeAdded, E newValue) {
		return false;
	}

	@Override
	public E get(int index) {
		return elements[index];
	}

	@Override
	public void set(int index, E newValue) {
		elements[index] = newValue;
	}

	@Override
	public int size() {
		return size;
	}
	
	@Override
	public int capacity() {
		return elements.length;
	}
	
	@SuppressWarnings("unchecked")
	private E[] createGenericArray(int length) {
		return (E[])Array.newInstance(Object.class, length);
	}
	
	private E[] grow() {
		return Arrays.copyOf(elements, size * 3 / 2);
	}

}
