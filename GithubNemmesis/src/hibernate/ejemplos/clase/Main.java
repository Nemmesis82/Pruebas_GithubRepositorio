package hibernate.ejemplos.clase;


public class Main  
{
		public static void main(String[] args) 
	{
			SessionManager sM = new SessionManager();
			IncrementoSalario iS = new IncrementoSalario();
			MostrarRegiones mR = new MostrarRegiones();
			MostrarVentas mV = new MostrarVentas();
			
			sM.setSession(null);		
			iS.incrementoSalario20();
			mR.mostrarRegiones();
			mV.mostrarVentas();
			
			
	}
}