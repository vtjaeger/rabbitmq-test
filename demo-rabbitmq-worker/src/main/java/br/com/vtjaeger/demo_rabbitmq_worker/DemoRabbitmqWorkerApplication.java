package br.com.vtjaeger.demo_rabbitmq_worker;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableRabbit
@SpringBootApplication
public class DemoRabbitmqWorkerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRabbitmqWorkerApplication.class, args);
		System.out.println("rodando worker");
	}

}
