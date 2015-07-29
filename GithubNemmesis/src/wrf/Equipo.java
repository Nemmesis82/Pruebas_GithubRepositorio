package wrf;

import java.net.URI;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.google.gson.Gson;
@Path("/equipo")
public class Equipo {
//	@GET
//	@Path("/info/{team}")
//	@Produces("application/xml")
//	public String getMsg(@PathParam("team") String inicial) {
//		String stateDetails = null;
//		if (inicial.equals("RM")) {
//			stateDetails = "<Equipo><name>REAL</name><nombrecorto>RM</nombrecorto>" +
//					"<copas>10</copas><entrenador>Benitez</entrenador></Equipo>";
//		} else if (inicial.equals("AT")) {
//			stateDetails = "<Equipo><name>ATELETICO</name><nombrecorto>ATM</nombrecorto>" +
//					"<copas>0</copas><entrenador>Cholo</entrenador></Equipo>";
//		} else if (inicial.equals("BCN")) {
//			stateDetails = "<Equipo><name>BARCELONA</name><nombrecorto>FCB</nombrecorto>" +
//					"<copas>5</copas><entrenador>LuisEn</entrenador></Equipo>";
//		} else {
//			stateDetails = "Equipo No encontrado";
//		}
//		return stateDetails;
//	}
	
//	 @GET
//	    @Produces(MediaType.APPLICATION_JSON)
//	    public String getProfe() {
//		    Persona p = new Persona("Vale", 31);
//		    Gson gson = new Gson();
//		    String persona_json = gson.toJson(p);
//	        return persona_json;
//	    }
//	 
//	 @POST
//		@Consumes(MediaType.APPLICATION_JSON)
//		public Response creaPersona(String p) {
//	 
//		 	Gson gson = new Gson();
//		 	Persona person = gson.fromJson(p, Persona.class);
//		 	System.out.println(person.toString());
//		 
//		 System.out.println(p.toString());
//	        
//			String result = "Ha ido bien, chaval ;)";
//			return Response.status(201).entity(result).build();
//	 
//		}
	
	 @GET
	 @Path("/jugador/")
	 @Produces("application/xml")
	    public String getJur() {
		    Jugador j = new Jugador("Ruth", 33);
		    Gson gson = new Gson();
		    String persona_json = gson.toJson(j);
	        return persona_json;
	    }
	 
	 @POST
		@Consumes(MediaType.APPLICATION_JSON)
		public Response creaJugador(String j1) {
	 
		 	Gson gson = new Gson();
		 	Jugador ju = gson.fromJson(j1, Jugador.class);
		 	//Jugador j1 = gson.fromJson(j1, Jugador.class);
		 	System.out.println(ju.toString());
		 
		 	System.out.println(ju.toString());
	        
			String result = "Lo has logrado wapa;)";
			return Response.status(201).entity(result).build();
	 
		}
	 @PUT
	 @Consumes
	 
	 public Response putJugador() 
	 {
		    
			Gson gson = new Gson();
		 	Jugador j = new Jugador("Ruth", 41);
		 	//Jugador j1 = gson.fromJson(j1, Jugador.class);
		 	System.out.println(j.toString());
		 
		 	System.out.println(j.toString());
	        
			String result = "Lo has logrado wapa la actualizacion;)";
			return Response.status(201).entity(result).build();
	 }
}
