package view;

import java.util.Arrays;

import functional.StringCompFunc;

public class Ex04 {
	
	public static void main(String[] args) {
		
		String[] strings = {"-2", "-6", "10", null, "4", "8", null, "Special", "a", "c", "b", "xx"};
		
		
		sort(strings, (str1,str2) -> {
			 if (isNumber(str1) && isNumber(str2)) {
	                String temp = str1;
	                str1 = str2;
	                str2 = temp;
	            }
			 return compareStr(str1, str2);
			
		});
		
		System.out.println("Mang sap xep tang dan: " + Arrays.toString(strings));
		
		sort(strings, (str2,str1) -> {
			if (isNumber(str1) && isNumber(str2)) {
	                String temp = str1;
	                str1 = str2;
	                str2 = temp;
	            }
		    return compareStr(str1, str2);
			
		});
		System.out.println("Mang giam dan: " + Arrays.toString(strings));
		
	}
	
	public static void sort(String[] sources, StringCompFunc scf) {
		for(int i = 0;i < sources.length - 1;i++) {
			for(int j = 0;j < sources.length - i - 1;j++) {
				if(scf.compare(sources[j], sources[j+1]) > 0) {
					String temp = sources[j];
					sources[j] = sources[j + 1 ];
					sources[j + 1] = temp;
				}
			}
		}
	}
	
	public static boolean isNumber(String source) {
		if(source == null) {
			return false;
		}
		return source.matches("\\d+");
	}
	
	public static int compareStr(String str1, String str2) {
		
	    if (str1 == null && str2 == null) {
	        return 0;
	    }
	    if (str1 == null) {
	        return 1;
	    }
	    if (str2 == null) {
	        return -1;
	    }
	    return str1.compareTo(str2);
	}


}
