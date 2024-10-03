package datastructure.object;

public class Ex06ObjectTypeAvailableDiff {
	
	public static void main(String[] args) {
		
		String s1 = new String("hello");
		String s2 = new String("xin chao");
		String s3 = new String("hello");
		System.out.printf(
				"s1[value=%s](hash=%s)\n"
			   +"s2[value=%s](hash=%s)\n"
			   +"s1[value=%s](hash=%s)\n",
			    s1, System.identityHashCode(s1),
			    s2, System.identityHashCode(s2),
			    s3, System.identityHashCode(s3)
			    );
		
		System.out.println("\n======================\n");
		
		String s11 = "bye";
		String s22 = "tam biet";
		String s33 = "bye";
		String s44 = "bye";
		s33 = "teo";
		
		System.out.printf(
				 "s11[value=%s](hash=%s)\n"
			   + "s22[value=%s](hash=%s)\n"
			   + "s33[value=%s](hash=%s)\n"
			   + "s44[value=%s](hash=%s)\n",
				s11, System.identityHashCode(s11),
				s22, System.identityHashCode(s22),
				s33, System.identityHashCode(s33),
				s44, System.identityHashCode(s44)
				);
		
	}

}
