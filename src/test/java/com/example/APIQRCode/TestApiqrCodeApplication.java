package com.example.APIQRCode;

import org.springframework.boot.SpringApplication;

public class TestApiqrCodeApplication {

	public static void main(String[] args) {
		SpringApplication.from(ApiqrCodeApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
