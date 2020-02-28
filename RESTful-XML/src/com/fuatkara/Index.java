package com.fuatkara;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//http://localhost:8080/RESTful-Annotation/rest/main
@Path(value = "/main")
public class Index {
	
	//http://localhost:8080/RESTful-XML/rest/main/customer/1
	@GET
	@Path(value = "/customer/{id}")
	@Produces(MediaType.APPLICATION_XML)      //Uygulamamiz XML projesi oldugu icin 
	public Customer getCustomerInfo(@PathParam("id") int id) {
		
		Customer custObj = new Customer();
		custObj.setCustomerId(id);
		custObj.setCustomerName("Furkan");
		custObj.setCustomerSurname("KARA");
		return custObj;
	}
	
}













