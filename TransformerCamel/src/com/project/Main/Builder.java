package com.project.Main;

import org.apache.camel.builder.RouteBuilder;

public class Builder extends RouteBuilder{

	@Override
	public void configure() throws Exception {
      
		
		from("direct:start")
		.to("src/main/java/com/project/Main/student.xml")
		  .to("direct:end");
	}

}
