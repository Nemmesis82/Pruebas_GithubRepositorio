package wrf;

import javax.xml.bind.annotation.XmlRootElement;

import wrf.Persona;
import wrf2.Employee;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;

import com.sun.jersey.api.client.WebResource;



public class ClienteRs {

	
	public static void main(String[] args) {
		 
		//Get Empleados
		
//		Client cl =Client.create();
//		
//		WebResource wR=cl.resource("http://localhost:8090/WebservicesRESTFul/rest/sala/102");
//		
//		String s = wR.get(String.class);
//		
//		System.out.println(s);
		
		//Post
		
		Client client1 = Client.create();
		//WebResource webResource1 = client1.resource("http://localhost:8081/WebServiceRest/rest/equipo/");
		WebResource webResource1 = client1.resource("http://localhost:8090/WebservicesRESTFul/rest/sala/");
		Employee e = new Employee(888, 100, "Ruth", "Llaneza", 35000);

		ClientResponse response1 = webResource1.type("application/json").entity(e).post(ClientResponse.class);
		
		if (response1.getStatus() != 201) 
		{
			throw new RuntimeException("Failed : HTTP error code : " + response1.getStatus());
			
		}

		System.out.println("Respuesta del servidor .... \n");
		String output1 = response1.getEntity(String.class);
		System.out.println(output1);
		
	}
	
	
}
