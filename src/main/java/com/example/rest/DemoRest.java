package com.example.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.example.model.PersonModel;

@Path("/demo")
public class DemoRest {

	@GET
	@Path("/helloworld")
	@Produces(MediaType.TEXT_PLAIN)
	public Response helloWorld() {
		return Response.status(200).entity("Hello World!").build();
	}
	
	@GET
	@Path("/getPerson")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getPerson() {
		try {
			PersonModel personModel = new PersonModel(1, "James", "Gosling");
			GenericEntity<PersonModel> entity = new GenericEntity<PersonModel>(personModel){};
			return Response.status(200).entity(entity).build();
		}
		catch(Exception e) {
			return Response.status(500).build();
		}
	}
	
	@POST
	@Path("/updatePerson/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_PLAIN)
	public Response updatePerson(final PersonModel person) {
		try {
			System.out.println("Person Model received - ");
			System.out.println("ID: "+person.getId());
			System.out.println("Name: "+person.getFirstName()+" "+person.getLastName());
			return Response.status(200).entity("Person updated successfully").build();
		}
		catch(Exception e) {
			return Response.status(500).build();
		}
	}
}
