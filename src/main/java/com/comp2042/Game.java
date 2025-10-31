// package com.comp2042;

// import javafx.animation.KeyFrame;
// import javafx.animation.Timeline;
// import javafx.util.Duration;

// public class Game {
//     private Timeline t;
//     private GameController controller;

//     public Game(GameController c) {
//         this.controller = c;
//         t = new Timeline(new KeyFrame(
//             Duration.millis(400),
//             e -> c.update()
//         ));
//         t.setCycleCount(Timeline.INDEFINITE);
//         t.play();
//     }

//     public void start() { t.play(); }
//     public void stop() { t.stop(); }

// }
