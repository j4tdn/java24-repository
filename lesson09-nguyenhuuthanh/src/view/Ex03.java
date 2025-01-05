package view;

public class Ex03 {

	public static void main(String[] args) {
		String input = "Welcome to JAVA10 class";
		
		String[] characs = input.strip().split("\\s+");
		StringBuilder sb = new StringBuilder();
		for(String charac : characs) {
			sb.append(revert(charac)).append(" ");
		}
		
		System.out.println("--> Kết quả : "+sb);
	}

	private static StringBuilder revert(String ip){
        return new StringBuilder(ip).reverse();
	}

}