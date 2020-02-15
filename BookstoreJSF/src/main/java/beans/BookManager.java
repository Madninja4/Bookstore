package beans;

import javax.ejb.Local;
import java.util.List;

@Local
public interface BookManager {

	void add(Book book);

	void delete(Book book);

	void update(Book book);

	List<Book> list();

}
