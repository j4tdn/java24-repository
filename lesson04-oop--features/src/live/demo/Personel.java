package live.demo;

import java.time.LocalDate;

public abstract  class Personel {
	
	
	private String name;
	private LocalDate birht;
	private double incomeratio;
	
	public Personel() {
		// TODO Auto-generated constructor stub
	}

	public Personel(String name, LocalDate birht, double incomeratio) {
		super();
		this.name = name;
		this.birht = birht;
		this.incomeratio = incomeratio;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getBirht() {
		return birht;
	}

	public void setBirht(LocalDate birht) {
		this.birht = birht;
	}

	public double getIncomeratio() {
		return incomeratio;
	}

	public void setIncomeratio(double incomeratio) {
		this.incomeratio = incomeratio;
	}

	@Override
	public String toString() {
		return "Personel [name=" + name + ", birht=" + birht + ", incomeratio=" + incomeratio + "]";
	}
	
	
	
	
	
	
	
	
	

}
