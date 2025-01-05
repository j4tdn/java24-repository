package bean;

public class Item implements Comparable<Item>{
	private Integer id;
	private String name;
	public Item() {
		// TODO Auto-generated constructor stub
	}
	public Item(Integer id, String name) {
		super();
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
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Item that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int compareTo(Item o) {
		return this.getId() - o.getId();
		
		
	}
	
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
