package bean;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomList<T> implements IList<T> {
	
	private int size;
	private int DEFAULT_CAPACITY = 6;
	private T[] elements;
	
	public CustomList() {
		elements = createGenericArray(DEFAULT_CAPACITY);
	}

	@Override
	public boolean add(T newValue) {
		// TODO Auto-generated method stub
		if (size == elements.length) {
			elements = grow();
		}
		elements[size] = newValue;
		size++;
		return true;
	}

	@Override
	public boolean add(int postoBeAdded, T newValue) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return elements[index]; 
	}

	@Override
	public void set(int index, T newValue) {
		// TODO Auto-generated method stub
		elements[index] = newValue;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}
	
	@SuppressWarnings("unchecked")
	private T[] createGenericArray(int length) {
		return (T[])Array.newInstance(Object.class, length);
	}
	
	private T[] grow() {
		return Arrays.copyOf(elements, size * 3 / 2);
	}
	
}
