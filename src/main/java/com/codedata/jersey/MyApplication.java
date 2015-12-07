package com.codedata.jersey;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;

/**
 * @author 	Administrator
 * @date	2015年12月7日 下午2:41:58
 * @desc	
 */
@ApplicationPath("rest")
public class MyApplication extends ResourceConfig{
	public MyApplication() {
		packages("com.codedata.jersey");
	}
}
