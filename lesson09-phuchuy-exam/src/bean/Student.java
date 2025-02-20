package bean;

import common.Rank;

public class Student {
	
	private String name;
	private Integer id;
	private Rank rank;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer id, String name, Rank rank) {
		this.name = name;
		this.id = id;
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
		return true;
		}
		if (!(o instanceof Student that)) {
			return false;
		}
		return getId() == that.getId();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", rank=" + rank + "]";
	}
	
	

}
