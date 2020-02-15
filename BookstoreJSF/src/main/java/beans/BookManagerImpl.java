package beans;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Stateless
public class BookManagerImpl implements BookManager {

	@PersistenceContext(name = "myBooks")
	EntityManager em;

	@Override
	public void add(Book book) {
		em.persist(book);
		em.flush();
	}

	@Override
	public void delete(Book book) {
		Book b = em.merge(book);
		em.remove(b);
		em.flush();
	}

	@Override
	public void update(Book book) {
		em.merge(book);
		em.flush();
	}

	@SuppressWarnings("unchecked")
	public List<Book> list() {
		Query query = em.createQuery("SELECT b from Book b");
		return query.getResultList();
	}

}
