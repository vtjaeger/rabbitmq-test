package br.com.vtjaeger.demo_rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmqApplication.class, args);
		System.out.println("rodando api");
	}

}
