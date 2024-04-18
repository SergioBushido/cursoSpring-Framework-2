package com.example.tarea2cursospring;

import com.example.tarea2cursospring.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class Tarea2CursoSpringApplicationTests {

	@Autowired//inyeccion del contexto
	ApplicationContext applicationContext;

	@Autowired//inyeccion del controlador
	MyController myController;
	@Test
	void testGetControllerFromCtx() {
		MyController controller =  applicationContext.getBean(MyController.class);
		System.out.println(controller.diHola());
	}

	@Test
	void testAotowireOfController() {
		System.out.println(myController.diHola());
	}

	@Test
	void contextLoads() {
	}

}
