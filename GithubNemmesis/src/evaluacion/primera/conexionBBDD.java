package evaluacion.primera;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class conexionBBDD 
{
		public static void main(String[] args) throws Exception 
		{
			/**
			 * Declaro las variables para hacer la conexion
			 */
			Connection conn = null;
			ResultSet rset = null;
			Statement stmt = null;
			/**
			 * Ahora declaro un arraylis de regiones para almacenar todas las regiones
			 */
			ArrayList<regiones> arrayRegiones = new ArrayList<regiones>(); 	
			
			System.out.println("Imprimir toda la tabla de REGIONS:");
			System.out.print("\n");
			try
			{
				
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection ("jdbc:oracle:thin:@localhost:1521:xe", "hr", "HR");
				stmt = conn.createStatement();
				rset = stmt.executeQuery("SELECT * FROM REGIONS");
		
			while (rset.next())
			{
			
				//Se muestra la base de datos de ConexiónBBDD
				
				
				System.out.println(rset.getString(1)+" "+rset.getString(2));

			}
			
			//Hago otra sentencia para que me busque el id que le he puesto y me muestre la region entera
			System.out.print("\n");
			rset = stmt.executeQuery("SELECT * FROM REGIONS WHERE REGION_ID = 2");
			
			System.out.println("Imprimir la region 2 que es la que he puesto en el select para que muestre sus datos en el array");
			System.out.print("\n");
			
			while (rset.next())
			{
				
				//Se muestra la base de datos de ConexiónBBDD
				//System.out.println(rset.getString(2));
				arrayRegiones.add(new regiones(rset.getString(2),rset.getInt(1)));
				
			}
			
			for (regiones region : arrayRegiones )
			{
				System.out.println(region);
			}
			
			rset = stmt.executeQuery("INSERT INTO regions (REGION_ID,REGION_NAME) VALUES (12,'Brasil')");
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			finally //libero recursos, de "adentro a fuera" , ResultSet, Statment, Conexion
			{
				if (rset != null) 	{ try { rset.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (stmt != null)	{ try {	stmt.close(); } catch (Exception e2) { e2.printStackTrace(); }}
				if (conn != null) 	{ try { conn.close(); } catch (Exception e3) { e3.printStackTrace(); }}
			  	   
			}   

		}
}
