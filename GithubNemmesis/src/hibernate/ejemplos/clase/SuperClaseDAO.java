package hibernate.ejemplos.clase;
import org.hibernate.Session;
public class SuperClaseDAO
{
	
	private  Session session;

	public  Session getSession() {
		return session;
	}

	public  void setSession(Session session) {
		this.session = session;
	}
	
	
	
}
