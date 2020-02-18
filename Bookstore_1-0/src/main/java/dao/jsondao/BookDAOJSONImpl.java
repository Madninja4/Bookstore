package dao.jsondao;

import javax.enterprise.context.ApplicationScoped;
import dao.BookDAO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import beans.Book;

import java.io.FileReader; 
import java.util.Iterator; 
import java.util.Map; 
  
import org.json.simple.JSONArray; 
import org.json.simple.JSONObject; 
import org.json.simple.parser.*; 

@ApplicationScoped @JSON
public class BookDAOJSONImpl implements BookDAO{

	public Book find(int id) {
		
		Object obj = new JSONParser().parse(new FileReader("books.json"));
		
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
