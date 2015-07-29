package hibernate.ejemplos.clase;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.SQLException;
import java.sql.Savepoint;

import hibernate.ejemplos.clase.Conexion;
import hibernate.ejemplos.clase.InstruccionesSQL;


public class EmpleadoDAO{
	//recuperar Todos() List<Empleados>
	private ResultSet rset;
	
	public EmpleadoDTO obtenerEmpleadoPorID(int id) throws ClassNotFoundException, SQLException{
		EmpleadoDTO respuesta = null;
		Departments dep = new Departments();
		
			
			
		return respuesta;
	}
	
}