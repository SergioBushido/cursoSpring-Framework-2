package com.example.tarea2cursospring;

import com.example.tarea2cursospring.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Tarea2CursoSpringApplication {
	//est seria otra forma
	// @Autowired
	//    private MyController controller;
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(Tarea2CursoSpringApplication.class, args);
		MyController controller = ctx.getBean(MyController.class);
		System.out.println("metodo main");
		System.out.println(controller.diHola());
	}


	// @PostConstruct
	//    public void init() {
	//        System.out.println("metodo main");
	//        System.out.println(controller.diHola());
	//    }
}
