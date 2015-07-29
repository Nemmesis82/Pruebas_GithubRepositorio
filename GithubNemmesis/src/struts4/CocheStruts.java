package struts4;

import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class CocheStruts extends StrutsTypeConverter  
{

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) 
	{
		Coche c = new Coche(arg1[0], arg1[1]);
		return c;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) 
	{
		

		return null;
	}
	
	
}

