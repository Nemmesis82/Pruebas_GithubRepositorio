package wrf;


import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

import wrf2.*;
import wrf3.Persona;


import com.google.gson.Gson;

@Path("/sala")
@XmlRootElement(name="Employee")
public class sala
{
	/**
	 * 
	 * @param id
	 * @return
	 * esto sirve para pasar por la url un id del empleado pongo en el navegador
	 * http://localhost:8090/WebservicesRESTFul/rest/sala/1 y me devuelve ok
	 */

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public String getMsg(@PathParam("id") String id) 
   	{
	
		EmployeeService emp= new EmployeeService();
		
		int id_emp= Integer.parseInt(id);
	
		Employee nuevo_id = emp.obtenerEmpleado(id_emp);
		Gson gson = new Gson();
		String json = gson.toJson(nuevo_id);
		
		return json;   
    }
	
	@POST
	@Produces("application/json")
	public Response creaPersona(Employee e)
	{
		
//		EmployeeService emp2= new EmployeeService();
//		int id_emp2= Integer.parseInt(id);
//		Employee nuevo_id2 = emp2.obtenerEmpleado(id_emp2);
		
		System.out.println("desde put json");
 		System.out.println(e.toString());
        
		String result = "Ha ido bien, chaval ;)";
		return Response.status(201).entity(result).build();
	
//		Gson gson2 = new Gson();
//		
//		String json2 = gson2.toJson(nuevo_id2);
//		
//		return json2;
//	}
	

	
	}	
}
