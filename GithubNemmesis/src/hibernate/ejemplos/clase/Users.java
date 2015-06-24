package hibernate.ejemplos.clase;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("serial")
public class Users implements java.io.Serializable 
{
	private String USER_NAME;
	private String USER_PASS;
	
	
	public Users(String uSER_NAME, String uSER_PASS) 
	{
		USER_NAME = uSER_NAME;
		USER_PASS = uSER_PASS;
	}

	@Override
	public String toString() 
	{
		return "Users [USER_NAME=" + USER_NAME + ", USER_PASS=" + USER_PASS + "]";
	}

}
