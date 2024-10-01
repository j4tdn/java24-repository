package bean;

public class Classroom {
	
	public int sohocsinh;
	public int vang;
	public char ten;
	
public Classroom() {}

@Override
public String toString() {
	return "Classroom [sohocsinh=" + sohocsinh + ", vang=" + vang + ", ten=" + ten + "]";
}

public Classroom(int sohocsinh, int vang, char ten) {
	super();
	this.sohocsinh = sohocsinh;
	this.vang = vang;
	this.ten = ten;
}

	
	
}
