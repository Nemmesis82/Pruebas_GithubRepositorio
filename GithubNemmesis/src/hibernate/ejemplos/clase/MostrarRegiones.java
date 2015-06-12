package hibernate.ejemplos.clase;

import java.util.Iterator;
import java.util.List;

public class MostrarRegiones 
{

	public void mostrarRegiones()
	{
		SessionManager sM3 = new SessionManager();
		System.out.println("Mostrar regiones");
		
		try {
			
			sM3.transaction = sM3.session.beginTransaction();
			
			@SuppressWarnings("unchecked")
		
			List<Regions> listR;
			
			Regions r= null;
			Countries c=null;
			
			listR = sM3.session.createSQLQuery("SELECT * FROM REGIONS").addEntity(Regions.class).list();
			
			Iterator<Regions> itREG = listR.iterator();
			
			while (itREG.hasNext()) 
			{
				r = itREG.next();				
				Iterator<Countries> itREG2 = r.getCountrieses().iterator();
				System.out.println("El nombre del continente es "+ r.getRegionName());
				 while (itREG2.hasNext())
				{
					
					System.out.println(itREG2.next().getCountryName());
				}
				
			}
			
			sM3.transaction.commit();
		
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		
			sM3.transaction.rollback();
		}
		finally 
		{
			sM3.disconectSession();
			
		}
	
	}
}
