package fr.mspr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;


@SpringBootApplication
public class MsprApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsprApplication.class, args);
		System.out.println("toto");
	}

}
