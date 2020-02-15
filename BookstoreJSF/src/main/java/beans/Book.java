package beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;


@Entity
@Table(name = "Book")
public class Book implements Serializable, Cloneable {

	/**
	 *
	 */
	private static final long serialVersionUID = -4813877306322510306L;
	private String title;
	private String description;
	private double price;
	private String author;

	@Id
	private String id;


	public Book(String id, String ttl, String desc, String auth, double prc) {
		this.id = id;
		this.title = ttl;
		this.description = desc;
		this.price = prc;
		this.author = auth;

	}

	public Book() {
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String t) {
		author = t;
	}

	public String getAuthor() {
		return author;
	}

	public void setDescription(String t) {
		description = t;
	}

	public String getDescription() {
		return description;
	}

	public void setPrice(double p) {
		price = p;
	}

	public double getPrice() {
		return price;
	}

	public void setId(String i) {
		this.id = i;
	}

	public String getId() {
		return this.id;
	}

	public void setTitle(String t) {
		title = t;
	}

	public String toString() {
		return "Livre [title=" + title + ", description=" +
				description + ", author=" + author + ", price="
				+ price + ", id=" + id + "]";
	}

	public Book cloneMe() {
		try {
			return (Book) super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return null;
	}

}
