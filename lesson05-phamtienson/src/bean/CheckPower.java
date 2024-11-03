package bean;

public class CheckPower {
	public boolean isPower(int a, int b) {
		if (a==1 || b==1) {
			return true;
		}
		if (a==0|| b==0) {
			return false;
		}
		
		int nA = a;
		while (nA > 1) {
			if (nA % b != 0) {
				break;
			}
			nA= nA/b;
		}
		if(nA==1) {
			return true;
		}
		
		int nB = b;
		while (nB > 1) {
			if (nB % a != 0) {
				break;
			}
			nB= nB/a;
		}
		if(nB==1) {
			return true;
		}
		return false;

	}
}
