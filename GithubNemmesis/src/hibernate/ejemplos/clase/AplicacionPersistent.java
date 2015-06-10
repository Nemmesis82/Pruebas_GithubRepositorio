package hibernate.ejemplos.clase;
// Esto va en hibernate
//<property name ="show_sql">true</property>
public class AplicacionPersistent
{
				
		public static void main(String[] args) 
		{
			//llamada al metodo de incremento de salario
			
			IncrementoSalario isS =new IncrementoSalario();
			
			try
			{
			
				//llamada al metod de mostrar departamento de ventas
				isS.mostrarVentas();
				//llamada al metodo de incremento de salario
				isS.incrementoSalario20();
				//llamada al metodo de ventas despues del incremento del salario
				isS.mostrarVentas();
				
				isS.mostrarRegiones();
			}
			
			catch (Exception e) 
			
			{
				e.printStackTrace();
			}
			
			finally
			{
				isS.closeSession();
			}
		}
	
}
