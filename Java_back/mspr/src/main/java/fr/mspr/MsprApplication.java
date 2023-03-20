package fr.mspr;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MsprApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(MsprApplication.class, args);
		System.out.println("\n************************");
		System.out.println("Compilation projet => OK");
		System.out.println("************************\n");
		
	}

	@Override
	public void run(String... args) throws Exception {
		

	}
}
