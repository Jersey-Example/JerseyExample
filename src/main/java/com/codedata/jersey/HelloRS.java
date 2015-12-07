package com.codedata.jersey;

import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * @author 	Administrator
 * @date	2015年12月7日 下午2:46:03
 * @desc	
 */
@Path("/hello")
public class HelloRS {
	@GET
	public String sayHelloWordl() {
		return "Hello World";
	}

	@GET
	@Path("/{name}")
	public String sayhello(
		@PathParam("name") String name,
		@QueryParam("count") @DefaultValue("1") int count) {
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<count; i++) {
			sb.append("Hello, " + name + " \n");
		}
		System.out.println(sb.toString());
		return sb.toString();
	}
}
