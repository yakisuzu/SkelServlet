package servlet.sample;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.supers.SuperServlet;

@WebServlet("/SampleServlet")
public class SampleServlet extends SuperServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected String doServlet(HttpServletRequest req, HttpServletResponse res) {
		SampleBean bean = new SampleBean();
		bean.setId("iddddddd");
		bean.setName("nameeee");
		req.setAttribute("sampleBean", bean);
		return "/jsp/sample.jsp";
	}
}