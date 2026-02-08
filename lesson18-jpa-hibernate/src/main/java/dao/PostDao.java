package dao;

import persistence.Post;

public interface PostDao {
	
	/**
	 * Get post by given id
	 * 
	 * @param id the id
	 * @return {@link Post}
	 */
	Post get(Integer id);
	
}
