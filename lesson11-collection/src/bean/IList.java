package bean;

public interface IList<E> {

	boolean add(E e);
	
	boolean add(int posToBeAdded, E newValue);
	
	E get(int index);
	
	void set(int index, E newValue);
	
	int size();
	
	int capacity();
	
}
