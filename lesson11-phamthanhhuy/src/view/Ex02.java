package view;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import bean.CdDisk;
import model.DataCdDisk;

public class Ex02 {

	private static List<CdDisk> cddisks = DataCdDisk.getDataCdDisk();

	public static void main(String[] args) {

		System.out.println("Viết phương thức thêm 1 CD vào danh sách, thêm thành công nếu không trùng mã CD.");
		addCd(new CdDisk(104, "Classical", "Huy", 4, 27.0));
		//cddisks.add(new CdDisk(105, "Classical", "Huy", 4, 27.0));
		System.out.println(cddisks);
	}

	private static void addCd(CdDisk element) {
		boolean beDuplicated = false;
		
	for(CdDisk cd:cddisks) {
		if(cd.equals(element)) {
			beDuplicated = true;
		}
	}
	
	if(beDuplicated = true) {
		cddisks.add(element);
	} else {
		System.out.println("Bị trùng");
	}
		
	}

}
