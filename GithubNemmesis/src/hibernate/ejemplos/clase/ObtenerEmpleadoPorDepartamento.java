package hibernate.ejemplos.clase;

import java.util.List;
import java.util.Scanner;

public class ObtenerEmpleadoPorDepartamento 
{

	public void obtenerEmpleadoPorDepartamento()
	{
	
		SessionManager sM5 = new SessionManager();
		
	try 
	{					
		sM5.transaction = sM5.session.beginTransaction();

		
		@SuppressWarnings("unchecked")
					
	    List<Employees> listE;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el departamento que desee revisar: 10,20,30,40,50,60,70,80,90,100,110,120,130,140,150,160,170,180,190,200,210,220,230,240,250,260,270");
		
		int dep = sc.nextInt();
		 
		 
		switch (dep) 
	    {
		case 10:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 10").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 20:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 20").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 30:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 30").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 40:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 40").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 50:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 50").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 60:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 60").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			break;
		case 70:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 70").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			break;
		case 80:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 80").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			break;
		case 90:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 90").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			break;
		case 100:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 100").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 110:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 110").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 120:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 120").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 130:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 130").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 140:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 140").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 150:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 150").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 160:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 160").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 170:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 170").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 180:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 180").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 190:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 190").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
					
			break;
		case 200:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 200").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 210:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 210").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			
			break;
		case 220:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 220").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
						
			break;
		case 230:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 230").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
						
			break;
		case 240:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 240").addEntity(Employees.class).list();
			
			
			break;
		case 250:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 250").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 260:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 260").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		case 270:
			listE= sM5.session.createSQLQuery("SELECT * FROM EMPLOYEES WHERE DEPARTMENT_ID= 270").addEntity(Employees.class).list();
			
			for (int i = 0; i < listE.size(); i++) 
			   {
				   System.out.println(listE.get(i));
			   }
			
			break;
		default:
			System.out.println("Introduzca un departamento correcto:");
			break;
		}
	 
		sM5.transaction.commit();
		
	}
	
	catch (Exception e) 
	
	{
		e.printStackTrace();
		
		sM5.transaction.rollback();
	}
	
	finally	
	{
		sM5.disconectSession();
				
	}
}

	
	
}
