package com.learn.demo.game;

import org.springframework.stereotype.Component;

@Component
public class Mario implements gamingconsole{
	public void up() {
		System.out.println("up");
	}
	public void down() {
		System.out.println("down");
	}
	public void left() {
		System.out.println("left");
	}
	public void right() {
		System.out.println("right");
	}
}
