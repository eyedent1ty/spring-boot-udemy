package com.in28minutes.learn_spring_framework.game;

public class Pacman implements GamingConsole{
    public void up() {
        System.out.println("Going up");
    }

    public void down() {
        System.out.println("Going down");
    }

    public void right() {
        System.out.println("Going right");
    }

    public void left() {
        System.out.println("Going left");
    }
}
