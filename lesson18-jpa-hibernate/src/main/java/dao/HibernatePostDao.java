package dao;

import dao.base.GenericDao;
import persistence.Post;

public class HibernatePostDao extends GenericDao implements PostDao {

	@Override
	public Post get(Integer id) {
		return openSession().find(Post.class, id);
	}

}
