package de.lustin.aufgabe.b;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class MultiplyResource {

	/**
	 * 
	 * @param limit
	 *            - request parameter for upper limit.
	 * @return
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response multiply(
			@DefaultValue("1000") @QueryParam(value = "limit") Long limit) {
		long sum = 0;
		Result result = new Result();
		int i = 0;
		while ((i * 3) < limit) {
			sum = sum + i * 3;

			if (i * 5 < limit) {
				sum = sum + i * 5;
			}
			i++;
		}
		result.setSum(sum);
		return Response.ok().entity(result).build();
	}
}
