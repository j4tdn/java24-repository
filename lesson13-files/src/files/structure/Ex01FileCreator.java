package files.structure;

import utils.FileUtils;

public class Ex01FileCreator {
	
	public static void main(String[] args) {
		
		// File - Path --> tạo ra các tập tin hay thư mục
		
		// \
		// /
		// File.separator
		
		
		// đường dẫn tương đối từ vị trí hiện tại của dự án hoặc từ vị trí ổ đĩa trong máy
		// nếu path mà có folder/file folder đó yêu cầu đã tồn tại, nếu chưa -> báo lỗi
		
		String path = "storage/d3.txt"; 
		
		FileUtils.createFile(path);
		
		System.out.println("Done !!!");
	}
	
}
