package hibernate.ejemplos.clase;
//package pruebas;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//
////import session.SessionManager;
//import hibernate.ejemplos.clase.Jobs;
////import clases.DAO.JobsDAO;
//
//public class JobsServices 
//{
//
//	private static JobsDAO jDAO;
//	
//	public JobsServices(){
//		jDAO = new JobsDAO();
//	}
//	
//	@SuppressWarnings("finally")
//	public Jobs mostrarJobs(String j_id){
//		Jobs j_dev = null;
//		Session session = null;
//		Transaction transaction = null;
//		
//		try{
//		session = SessionManager.obtenerSession();
//		jDAO.setSession(session);
//		transaction = session.beginTransaction();
//		j_dev = (Jobs) jDAO.Read((Object)j_id);
//		} catch (Exception e) {
//			e.printStackTrace();
//			transaction.rollback();
//		}finally{
//			SessionManager.disconectSession();
//			return j_dev;
//		}
//	}
//	
//	
//}
