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
 * Servlet implementation class Deliver
 */
@WebServlet("/Deliver")
public class Deliver extends HttpServlet {
	private Integer i ;
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deliver() {
        super();
        // TODO Auto-generated constructor stub
    }

    private ShoppingCart getEntry( int id )
    {
        ArrayList<ShoppingCart> lists = (ArrayList<ShoppingCart>) getServletContext().getAttribute(
            "orders" );

        for( ShoppingCart s : lists )
            if(s.getId() == id) return s;

        return null;
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.valueOf( request.getParameter( "id" ) );
		this.i = id;
		request.setAttribute("id", id);
		ShoppingCart s = getEntry(i);
		request.setAttribute("name", s.getName());
		request.setAttribute("location", s.getLocation());
		request.setAttribute("details", s.getDetails());
		request.getRequestDispatcher("Delivery.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
