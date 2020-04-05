package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserBServlet
 */
@WebServlet("/UserBServlet")
public class UserBServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserBServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init (ServletConfig config) throws ServletException{
    	super.init(config);
    	ArrayList<ShoppingCart> list = new ArrayList<ShoppingCart>();
    	list.add(new ShoppingCart(1, "David", "ETA-310", "Famous Star Burger"));
    	list.add(new ShoppingCart(2, "John", "SHC-123", "Chicken Tenders"));
    	getServletContext().setAttribute("orders", list);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("ViewUserBMenu.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
