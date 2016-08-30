package com.vogella.jersey.first;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.ws.Response;

import com.airbus.rest.model.Fahrer;

// Plain old Java Object it does not extend as class or implements 
// an interface

// The class registers its methods for the HTTP GET request using the @GET annotation. 
// Using the @Produces annotation, it defines that it can deliver several MIME types,
// text, XML and HTML. 

// The browser requests per default the HTML MIME type.

//Sets the path to base URL + /hello
@Path("/hello")
public class Hello {

	public Hello() {
		new Fahrer();
	}

	// This method is called if JSON is request
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Fahrer> toJson() {
		List<Fahrer> output = new ArrayList<>();
		output.addAll(Storage.getInstance().getFahrerListe());
		return output;
	}
	
	// retuns the number of todos
	// Use http://localhost:8080/com.vogella.jersey.todo/rest/todos/count
	// to get the total number of records
	@GET
	@Path("count")
	@Produces(MediaType.TEXT_PLAIN)
	public String getCount() {
		int count = Storage.getInstance().getFahrerListe().size();
		return String.valueOf(count);
	}
	
//	@GET
//	@Path("calcPi")
//	@Produces(MediaType.TEXT_PLAIN)
//	public Response calcPi() {
//		int count = Storage.getInstance().getFahrerListe().size();
//	}

}