package com.learn.demo.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Game {
	@Autowired
   private gamingconsole game;
	public Game(gamingconsole game) {
		this.game=game;
		// TODO Auto-generated constructor stub
	}
	public void run() {
		game.up();
		game.down();
		game.left();
		game.right();
		// TODO Auto-generated method stub
		
	}

}
