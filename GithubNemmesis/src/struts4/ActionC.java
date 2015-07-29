package struts4;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.conversion.annotations.TypeConversion;

public class ActionC extends ActionSupport
{

	private Coche coche;
	
	
	public Coche getCoche() {
		return coche;
	}

	@TypeConversion(converter="struts4.CocheStruts")
	public void setCoche(Coche coche) {
		this.coche = coche;
	}


	@Override
	public String execute() throws Exception 
	{
		
		System.out.println(coche.getMarca());
		System.out.println(coche.getModelo());		
		
		return SUCCESS;
	
		//return super.execute();
	}
	
	
}
