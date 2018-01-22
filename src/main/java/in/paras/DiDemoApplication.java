package in.paras;

import in.paras.controller.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController object=(MyController) ctx.getBean("myController");
		object.hello();
	}
}
