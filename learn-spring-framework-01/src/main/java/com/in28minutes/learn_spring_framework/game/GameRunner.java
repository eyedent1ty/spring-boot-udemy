package com.in28minutes.learn_spring_framework.game;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
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
