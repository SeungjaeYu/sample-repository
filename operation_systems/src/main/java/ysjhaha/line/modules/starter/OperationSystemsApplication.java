package ysjhaha.line.modules.starter;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ysjhaha.line.modules.module.BusinessContext;

@SpringBootApplication
public class OperationSystemsApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder()
				.sources(OperationSystemsApplication.class)
				.child(BusinessContext.class)
				.web(WebApplicationType.SERVLET)
				.run(args);

	}

}
