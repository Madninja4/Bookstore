package commands;

import java.util.List;

import javax.servlet.http.*;
import beans.Book;

public class CommandStatistics extends Command{

	@Override
	public String getOrderName() {
		return "statistics";
	}
	
	@Override
	public Action executeAction(HttpServletRequest req) {
		int bookCount = dao.bookCount();
		double totalPrice = dao.totalPrice();
		double averagePrice = totalPrice / bookCount;
		
		req.setAttribute("bookCount", bookCount);
		req.setAttribute("averagePrice", averagePrice);
		
		return new Action("Statistics.jsp", false);
	}
}
