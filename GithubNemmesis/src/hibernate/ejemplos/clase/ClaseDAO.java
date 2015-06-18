package hibernate.ejemplos.clase;
//package pruebas;
//
//import java.util.Iterator;
//import java.util.List;
//import hibernate.ejemplos.clase.Jobs;
//import hibernate.ejemplos.clase.Employees;
////import interfaces.InterfaceEmployeesDAO;
//
//public class ClaseDAO 
//{
//	public class EmployeesDAO extends SuperClaseDAO implements InterfaceEmployeesDAO{
//		
//		
//
//		/**
//		 * de la session obtenida por la 
//		 * @return List<Employees>
//		 */
//		@SuppressWarnings("unchecked")
//		public List<Employees> obtenerEmpleados(){	
//			return getSession().createSQLQuery("SELECT * FROM EMPLOYEES").addEntity(Employees.class).list();	
//			}
//
//		/* (non-Javadoc)
//		 * @see interfaces.InterfaceDAO#create(java.lang.Object)
//		 */
//		@SuppressWarnings("finally")
//		@Override
//		public boolean create(Object arg) {
//			boolean b_dev = false;
//			try{
//				getSession().saveOrUpdate((Employees)arg);
//			}catch(Exception e){
//				e.printStackTrace();
//			}finally{
//			return b_dev;
//			}
//		
//		
//}
