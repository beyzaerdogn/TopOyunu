package com.example.demo3;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.shape.Circle;

public class BouncingBallController {
    private static final double BALL_RADIUS = 20.0;
    private static final double SCENE_WIDTH = 400.0;
    private static final double SCENE_HEIGHT = 400.0;
    private static final double MAX_SPEED = 5.0;
    private static final double FRICTION = 0.02;

    private double ballSpeedX = 2.0;
    private double ballSpeedY = 2.0;

    @FXML
    private Circle ball;

    @FXML
    private Button upButton;

    @FXML
    private Button downButton;

    @FXML
    private Button leftButton;

    @FXML
    private Button rightButton;

    @FXML
    public void initialize() {
        upButton.setOnAction(event -> moveUp());
        downButton.setOnAction(event -> moveDown());
        leftButton.setOnAction(event -> moveLeft());
        rightButton.setOnAction(event -> moveRight());
    }

    public void moveUp() {
        ball.setCenterY(ball.getCenterY() - 10);
    }

    public void moveDown() {
        ball.setCenterY(ball.getCenterY() + 10);
    }

    public void moveLeft() {
        ball.setCenterX(ball.getCenterX() - 10);
    }

    public void moveRight() {
        ball.setCenterX(ball.getCenterX() + 10);
    }
}

