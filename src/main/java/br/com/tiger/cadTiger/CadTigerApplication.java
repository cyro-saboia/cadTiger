package br.com.tiger.cadTiger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication(scanBasePackages="controller")
@SpringBootApplication
@ComponentScan("br.com.tiger.cadTiger")
public class CadTigerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CadTigerApplication.class, args);
	}

}
