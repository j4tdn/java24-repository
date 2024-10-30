package bean;

public class Manager extends Shared {
	private Double position;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(Double position) {
		this.position = position;
	}
	public Double getPosition() {
		return position;
	}
	public void setPosition(Double position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Manager [position=" + position + "]";
	}
	
	

}
