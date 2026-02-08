package view;

import persistence.Post;
import service.PostService;
import service.PostServiceImpl;
import utils.IoUtils;

public class Ex05PostView {
	
	private static PostService postService;
	
	static {
		postService = new PostServiceImpl();
	}
	
	public static void main(String[] args) {
		
		Post post = postService.get(1);
		
		IoUtils.generate("4. Liệt kê bài đăng theo id", post);
		
		System.out.println("Tag size: " + post.getTags().size());
		
	}
	
}
