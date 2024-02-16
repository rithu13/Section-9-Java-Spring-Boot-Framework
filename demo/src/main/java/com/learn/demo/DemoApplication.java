package com.learn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.learn.demo.enterprise.example.web.webcontroller;
import com.learn.demo.game.Game;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
	Game runner=context.getBean(Game.class);

   // Mario game=new Mario();	
	//supercontra game1=new supercontra();
	//Game runner=new Game(game1);
	runner.run();
	
	webcontroller control=context.getBean(webcontroller.class);
	System.out.println(control.retrunvalfrombusiness());
	}

}
