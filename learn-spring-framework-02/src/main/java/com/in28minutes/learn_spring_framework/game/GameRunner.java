package com.in28minutes.learn_spring_framework.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;

    public GameRunner(@Qualifier("MarioGameQualifier") GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game: " + game);
        this.game.up();
        this.game.down();
        this.game.left();
        this.game.right();
    }
}
