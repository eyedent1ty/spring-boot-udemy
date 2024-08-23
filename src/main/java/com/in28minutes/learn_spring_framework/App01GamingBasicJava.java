package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.MarioGame;
import com.in28minutes.learn_spring_framework.game.SuperContraGame;
import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.Pacman;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // MarioGame marioGame = new MarioGame();
        // SuperContraGame superContraGame = new SuperContraGame();
        Pacman pacman = new Pacman();
        GameRunner gameRunner = new GameRunner(pacman);
        gameRunner.run();
    }
}
