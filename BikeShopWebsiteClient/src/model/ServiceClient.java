package model;

import hibernate.classes.views.BikeView;

import java.util.List;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Client object, communicates with the server via RESTful web services.
 * @author Charlie
 * Apr 7, 2015 8:13:03 PM
 */
public class ServiceClient {
	private Client client;
	private WebTarget target;
	
	public ServiceClient() {
		client = ClientBuilder.newClient();
		target = client.target("http://localhost:8080/BikeShopWebsite/webapi");
	}
	
	public List<BikeView> getBikes() {
		Response response = target.path("views/getbikeviews").request(MediaType.APPLICATION_JSON)
				.get(Response.class);
		
		List<BikeView> bikes = response.readEntity(new GenericType<List<BikeView>>() {});
		
		return bikes;
	}
}
