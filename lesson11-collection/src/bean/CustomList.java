package bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<E> implements IList<E> {
	private int size;
	private int DEFAULT_CAPACITY = 6;
	private E[] elements;
	
	public CustomList() {
		elements = createGenericArray(DEFAULT_CAPACITY);
	}
	public boolean add(E newValue) {
		if(size == elements.length) {
			elements = grow();
		}
		elements[size] = newValue;
		size++;
		return true;
	};
	public boolean add(int posToBeAdded, E newValue) {
		return false;
	};
	@Override
	public E get(int index) {
		return elements[index];
	}
	@Override
	public int size() {
		return size;
	}
	@Override
	public void set(int index, E newValue) {
		elements[index] = newValue;
	}
	public int capacity() {
		return elements.length;
	}
	
	
	private E[] createGenericArray(int size) {
		return (E[])Array.newInstance(Object.class, size);
	}
	private E[] grow() {
		int newSize = size * 3/2;
		return Arrays.copyOf(elements, newSize);
	}
}
