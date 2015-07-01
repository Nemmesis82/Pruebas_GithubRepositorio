package hibernate.ejemplos.clase;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class LeerXML extends HttpServlet{

	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		int nelements = 0;
		List<Element> elements = null;
		try{
			
			String in = req.getParameter("URL");
			URL url = new URL(in);
			URLConnection urlCon = url.openConnection();
			SAXBuilder builder = new SAXBuilder();
			InputStream is = urlCon.getInputStream();
			Document documentJDOM = builder.build(is);

			Element raiz = documentJDOM.getRootElement();
			
			 elements = raiz.getChildren();
			 nelements ++;
			for (Element element : elements) {
				
				nelements ++;
				
			}
			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			//out.println("<h1>el fichero XML tiene "+nelements+" elementos dentro</h1>");
		}
		catch(Exception e){
			
		}
		finally{
			
		}
		
		System.out.println("este XML tiene " + nelements + " elementos");
	}
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	}
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(arg0, arg1);
	}
}
