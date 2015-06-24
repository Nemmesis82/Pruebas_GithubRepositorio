package hibernate.ejemplos.clase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Savepoint;

public class LoginUsuario 
{

	private ResultSet rset;
	
	public Users obtenerUsuario(String USER_NAME, String USER_PASS) 
			throws ClassNotFoundException, SQLException
	{
		Users u1 = null;
		String us = null;
		Connection newconex =null;
		PreparedStatement ps = null;
		Savepoint sp = null;	
	
		try {
				newconex = Conexion.obtenerConexion();
				newconex.setAutoCommit(false);
				sp= newconex.setSavepoint();
				ps = newconex.prepareStatement(InstruccionesSQL.buscarUsuario());
//				ps.setString(1,	USER_NAME);
//				ps.setString(1,	USER_NAME);
				rset=ps.executeQuery();
				
				if (rset.next())
					{
						us=rset.getString("USER_NAME");
						us=rset.getString("USER_PASS");
					}
					else
					{
						u1="No existe el usuario";
					}
			
			while (rset.next()) 
			{
				String USER_NAME1 = rset.getString(1);
				u1. = rset.getString(2);
		}
			newconex.commit();
		} catch (Exception e) {
			//newconex.rollback(sp);
			e.printStackTrace();
		} finally // libero los recursos
		{
			Conexion.LiberarRecursos(newconex,ps);
		}
		return u1;
	}
}
