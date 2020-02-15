package beans;

import org.primefaces.event.RowEditEvent;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named("books")
@SessionScoped

public class BookList implements Serializable {


	/**
	 *
	 */
	private static final long serialVersionUID = -7289255274807274883L;

	@EJB
	private BookManager bm;


	private List<Book> cache = new ArrayList<Book>();
	private Book addition = new Book();

	public List<Book> getCache() {
		if (cache.isEmpty()) cache = bm.list();
		return cache;
	}

	public void delete(Book book) {
		bm.delete(book);
		refreshCache();
	}

	public void reset(Book book) {
		addition.setId(null);
		addition.setDescription(null);
		addition.setAuthor(null);
		addition.setTitle(null);
		addition.setPrice(0.0);
	}

	public void add() {
		bm.add(addition.cloneMe());
		refreshCache();
	}

	public Book getAddition() {
		return addition;
	}

	public void setAddition(Book addition) {
		this.addition = addition;
	}

	public void onEdit(RowEditEvent event) {
		Book book = (Book) event.getObject();
		bm.update(book);
		refreshCache();
	}

	private void refreshCache() {
		cache.clear();
	}
}
