package servlet.supers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class SuperServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @param req
	 * @param res
	 * @return jsp path
	 */
	protected abstract String doServlet(HttpServletRequest req, HttpServletResponse res);

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jsp = doServlet(request, response);
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String jsp = doServlet(request, response);
		getServletContext().getRequestDispatcher(jsp).forward(request, response);
	}
}