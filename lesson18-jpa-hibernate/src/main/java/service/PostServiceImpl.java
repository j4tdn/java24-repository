package service;

import dao.HibernatePostDao;
import dao.PostDao;
import persistence.Post;

public class PostServiceImpl implements PostService {
	
	private PostDao postDao;
	
	public PostServiceImpl() {
		postDao = new HibernatePostDao();
	}
	
	@Override
	public Post get(Integer id) {
		return postDao.get(id);
	}
	
}
