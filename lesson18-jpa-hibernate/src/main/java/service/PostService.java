package service;

import persistence.Post;

public interface PostService {
	
	/**
	 * Get post by given id
	 * 
	 * @param id the id
	 * @return {@link Post}
	 */
	Post get(Integer id);
	
}
