package hibernate.ejemplos.clase;

import java.util.Iterator;
import java.util.List;
import hibernate.ejemplos.clase.Jobs;
import hibernate.ejemplos.clase.Employees;
//import interfaces.InterfaceEmployeesDAO;

public class ClaseDAO 
{
	public class EmployeesDAO extends SuperClaseDAO implements InterfaceEmployeesDAO{
		
		

		/**
		 * de la session obtenida por la 
		 * @return List<Employees>
		 */
		@SuppressWarnings("unchecked")
		public List<Employees> obtenerEmpleados(){	
			return getSession().createSQLQuery("SELECT * FROM EMPLOYEES").addEntity(Employees.class).list();	
			}

		/* (non-Javadoc)
		 * @see interfaces.InterfaceDAO#create(java.lang.Object)
		 */
		@SuppressWarnings("finally")
		@Override
		public boolean create(Object arg) {
			boolean b_dev = false;
			try{
				getSession().saveOrUpdate((Employees)arg);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
			return b_dev;
			}
		}

		/* (non-Javadoc)
		 * @see interfaces.InterfaceDAO#Read(java.lang.Object)
		 */
		@Override
		public Object Read(Object arg) {
			int s = (Integer)arg;
			@SuppressWarnings("unchecked")
			List<Employees> le =getSession().createSQLQuery("Select * from employees where EMPLOYEE_ID ="+s).addEntity(Employees.class).list();
			Iterator<Employees> ie = le.iterator();
			return ie.next();
		}

		/* (non-Javadoc)
		 * @see interfaces.InterfaceDAO#update(java.lang.Object)
		 */
		@Override
		public Object update(Object arg) {
			// TODO Auto-generated method stub
			return false;
		}

		/* (non-Javadoc)
		 * @see interfaces.InterfaceDAO#delete(java.lang.Object)
		 */
		@Override
		public boolean delete(Object arg) {
			// TODO Auto-generated method stub
			return false;
		}
}
