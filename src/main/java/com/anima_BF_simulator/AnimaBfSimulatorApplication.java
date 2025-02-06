package com.anima_BF_simulator;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class AnimaBfSimulatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnimaBfSimulatorApplication.class, args);
	}

}
