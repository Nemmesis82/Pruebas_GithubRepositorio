package hibernate.ejemplos.clase;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ServSegundo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
  /*  public ServSegundo() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ha llamado a service de Serv segundo");
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ha llamado a doGet de Serv segundo");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Ha llamado a doPost de Serv segundo");
	}

}
