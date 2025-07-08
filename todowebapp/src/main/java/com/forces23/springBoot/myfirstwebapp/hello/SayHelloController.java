package com.forces23.springBoot.myfirstwebapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
	//"/say-hello" => "Hello! What are you learning today?"
	
	@RequestMapping("/say-hello")
	@ResponseBody
	public String helloWorld() {
		String sayHello = "Hello! What are you learning today?";
		return sayHello;
	}
	
	@RequestMapping("/say-hello-html")
	@ResponseBody
	public String helloWorldHtml() {
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title> My HTML Page</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>Hello! What are you learning today?</h1>");
		sb.append("<h3>This within a h3 tag within java</h3>");
		sb.append("</body>");
		sb.append("</html>");
		
		return sb.toString();
	}
	
	
	//JSP
	//sayHello.jsp
	//"say-hello-jsp"
	// /src/main/resources/META-INF/WEB-INF/jsp/sayHello.jsp
	@RequestMapping("/say-hello-jsp")
	public String helloWorldJsp() {
		return "sayHello";
	}
}
