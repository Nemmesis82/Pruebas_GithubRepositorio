package hibernate.ejemplos.clase;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class MainIber 
{
	
	/*******************************************************
	 * 
	 * EJEMPLO B�sico del Uso de HIBERNATE
	 * 
	 * Todo lo que hasta hora est�bamos metiendo en el paquete "DAO", es lo que va a englobar y encargarse de ello
	 * el conjunto de bibliotecas que representa Hibernate
	 * 
	 * 		- Las conexiones ( y la concurrencia entra ellas )
	 * 		- La comunicaci�n con la base de datos (ejecuci�n de consultas SQL)
	 * 		- La escritura de POJOS o DTO's (para persistir clases en la base de datos)
	 * 		- La recuperaci�n de registros en DTO's (para recuperar filas y pasarlas a clases Java)
	 * 		- El manejo de las transacciones (Para gestionar adecuadamente la interacci�n con la BD, salvaguardadno la integridad)
	 * 
	 * Metodos utiles 
	 * sessionFactory - 1 vez- obtengo sesion
	 * factory openSession()  almenos 1 vez- obtengo sesion
	 * factory.getCurrentsSession() - cada vezque se necesite operar Base de datos
	 * session.disconnect() Cada vez que termine de operar la base de datos
	 * session.close() Al finalizar todas las operacones de la base de datos
	 * */
	
    public static void main(String args[]){
    	
    	//Cargo la configuraci�n: MAPPING entre Tablas y Objetos as� como La descripci�n de la base de de datos
    	//Dicho de otra forma: cargamos en memoria en la clase Configuration el hibernate.cfg.xml
    	Configuration configuration = new Configuration().configure();
    	//Preparo a un objeto, que ser� el encargado de generarme el estado de comunicaci�n con la base de datos
    	//StandardServiceRegistryBuilder se preconfigura el entorno a emplear
    	StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
    	
    	//Ahora s�, obtengo el objeto SessionFactory, a partir de la anterior clase /servicio
    	//que ya es la clase que encapsula al Pool y dem�s recursos f�sicos
    	SessionFactory factory = configuration.buildSessionFactory(builder.build());
    	/* Las tres primeras son las que inician sesion*/
    	
    	//Ahora ya con sesion, obtengo y manejo conexiones que me va dando SessionFactory
    	Session session = factory.openSession();
    	
    	//Me creo el POJO
    	/*Me creo la region */
    	Region region = new Region();
    	region.setRegion_id(850);;
    	region.setRegion_name("Antartida");
    	
    	
    	Transaction transaction = null;
    	//Y procedo a guardarlo --> INICIO DE LA TRANSACCION
    	try 
    	{
    		/*arranca la sesion y mete la sesion de la bbdd*/
    		transaction = session.beginTransaction();
    		/*Salva la sesion pero no en la base de datos*/
    		/*save hace un insert en la bbdd de copia*/
    		session.save(region);
    		/* esto es como la confimacion de la transacci�n en la base de datos original*/
    		transaction.commit();//si todo ha ido bien, persisto los cambio, los hago de verdad, no en la copia de la BD
    	}
    	catch (Exception e)
    	{
    		transaction.rollback();//si algo ha ido mal, deshago la transacci�n
    	}
    	
    	
    	try 
    	{
    		transaction = session.beginTransaction();
    		@SuppressWarnings("unchecked")
			List<Region> list = session.createSQLQuery("SELECT * FROM REGIONS").addEntity(Region.class).list();
    		Iterator<Region> it = list.iterator();
    		Region rg;
    		while (it.hasNext())
    		{
    			rg = it.next();
    			System.out.println(rg.toString());
    		}
    		transaction.commit();//si todo ha ido bien, persisto los cambio, los hago de verdad, no en la copia de la BD
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    		transaction.rollback();//si algo ha ido mal, deshago la transacci�n
    	}
    	finally 
    	{
    		//session.close();//haya ido bien o mal, libero recursos!
    		//Es mejor usar disconnect()
    		session.disconnect();
    		factory.close();
    	}
    	
    }

	
}
