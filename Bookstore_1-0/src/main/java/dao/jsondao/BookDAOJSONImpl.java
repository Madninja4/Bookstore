package dao.jsondao;

import javax.enterprise.context.ApplicationScoped;
import dao.BookDAO;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.sql.DataSource;
import beans.Book;

@ApplicationScoped @JSON
public class BookDAOJSONImpl implements BookDAO{

	public Book find(int id) {
		
		return new Book();
	}
	
	public void add(int id, String title, String desc, String author, String price) {
		
	}
	
	public void modify(int id, String title, String desc, String author, String price) {
		
	}
	
	public void delete(int id) {
		
	}
	
	public List<Book> list() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByIdAsc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByIdDesc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByTitleAsc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByTitleDesc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByPriceAsc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByPriceDesc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByAuthorAsc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public List<Book> listByAuthorDesc() {
		
		List<Book> list = new ArrayList<Book>();
		
		return list;
	}
	
	public int bookCount() {
		
		int temp = 0;
		
		return temp;
	}
	
	public double totalPrice() {
		
		double temp = 0;
		
		return temp;
	}
	
}
