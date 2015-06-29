package hibernate.ejemplos.clase;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hibernate.ejemplos.clase.model.services.XMLService;

public class ContarElementosXMLServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String url = null;
		int nElementos = 0;
		if (null != (url = req.getParameter("url"))) {
			XMLService xmlService = new XMLService();
			nElementos = xmlService.contarElementos(url);
			System.out.println(url);
			resp.getWriter().println("Hay " +nElementos+" Elementos");
		}

	}
}
