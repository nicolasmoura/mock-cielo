package br.com.finnet.mock.cielo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.finnet.mock.cielo")
public class MockCieloApplication {

	public static void main(String[] args) {
		SpringApplication.run(MockCieloApplication.class, args);
	}
}
