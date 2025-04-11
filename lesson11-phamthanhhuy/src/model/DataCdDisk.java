package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.CdDisk;

public class DataCdDisk {
	
	private DataCdDisk() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<CdDisk> getDataCdDisk() {
		List<CdDisk> cddisks = new ArrayList<>(Arrays.asList(
			    new CdDisk(101, "Pop", "Taylor Swift", 5, 12.5),
			    new CdDisk(102, "Rock", "Linkin Park", 3, 15.0),
			    new CdDisk(103, "Jazz", "Norah Jones", 7, 10.0),
			    new CdDisk(104, "Classical", "Mozart", 4, 20.0)
			));

		return cddisks;
	}
}
