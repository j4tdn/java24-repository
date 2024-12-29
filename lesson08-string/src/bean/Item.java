package bean;

public class Item implements Comparable<Item> {
	
	private Integer id;
	private String name;
	
	public Item() {
	}

	public Item(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// i1.equals(i2)
	// Object o = i2
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	// i1.compareTo(i2)
	// this(i1)
	// o(i2)
	// int: dương i1 > i2
	//      0     i1 = i2
	//      âm    i1 < i2
	@Override
	public int compareTo(Item o) {
		Item i1 = this;
		Item i2 = o;
		
		Integer id1 = i1.getId();
		Integer id2 = i2.getId();
		
		// Quy ước null < value
		if (id1 == null && id2 == null) {
			return 0;
		}
		
		if (id1 == null) {
			return -1;
		}
		
		if (id2 == null) {
			return 1;
		}
		
		return id1 - id2;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}

	
}