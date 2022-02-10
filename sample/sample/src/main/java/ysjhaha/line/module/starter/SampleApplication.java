package ysjhaha.line.module.starter;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ysjhaha.line.module.modules.BusinessContext;


@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SampleApplication.class, args);


		new SpringApplicationBuilder()
				.sources(SampleApplication.class)
				.child(BusinessContext.class)
				.web(WebApplicationType.SERVLET)
				.run(args);
	}

}