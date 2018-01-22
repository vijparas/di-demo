package in.paras;

import in.paras.controller.ConstructorInjectedController;
import in.paras.controller.MyController;
import in.paras.controller.PropertyInjectedController;
import in.paras.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {

		ApplicationContext ctx=SpringApplication.run(DiDemoApplication.class, args);
		MyController object=(MyController) ctx.getBean("myController");
		object.hello();

		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}
}
