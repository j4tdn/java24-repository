package bean;

public class Student {
	private String mssv;
	private String name;
	private String sort;

	public Student() {
	}

	public Student(String mssv, String name, String sort) {
		this.mssv = mssv;
		this.name = name;
		this.sort = sort;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "Student [mssv=" + mssv + ", name=" + name + ", sort=" + sort + "]";
	}

}
