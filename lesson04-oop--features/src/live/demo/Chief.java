package live.demo;

import java.time.LocalDate;

public  class Chief extends Personel {
  
  private double titleRatio;
  
public Chief() {
	// TODO Auto-generated constructor stub
}

public Chief(String name, LocalDate birht, double incomeratio, double titleRatio) {
	super(name, birht, incomeratio);
	this.titleRatio = titleRatio;
}

public double getTitleRatio() {
	return titleRatio;
}

public void setTitleRatio(double titleRatio) {
	this.titleRatio = titleRatio;
}

@Override
public String toString() {
	return "Chief [titleRatio=" + titleRatio + ", getName()=" + getName() + ", getBirht()=" + getBirht()
			+ ", getIncomeratio()=" + getIncomeratio() + ", toString()=" + super.toString() + "]";
}



 
  
  
  
  
	

}
