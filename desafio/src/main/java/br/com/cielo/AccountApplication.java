package br.com.cielo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ImportResource;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * 
 * @author Marcos Alves
 *
 */
@SpringBootApplication
@ImportResource({ "classpath*:application-context.xml" })
@EnableSwagger2
public class AccountApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(AccountApplication.class).run(args);
	}
}
