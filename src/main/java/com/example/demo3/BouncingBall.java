package com.example.demo3;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class BouncingBall extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Circle ball = new Circle(20, Color.BLUE);
        ball.relocate(100, 100);

        Group root = new Group(ball);

        Scene scene = new Scene(root, 400, 400, Color.WHITE);

        Timeline timeline = new Timeline(
                new KeyFrame(Duration.millis(20), event -> {
                    double x = ball.getLayoutX();
                    double y = ball.getLayoutY();
                    double xDirection = 1;
                    double yDirection = 1;

                    if (x >= scene.getWidth() - ball.getRadius() || x <= ball.getRadius()) {
                        xDirection *= -1;
                    }
                    if (y >= scene.getHeight() - ball.getRadius() || y <= ball.getRadius()) {
                        yDirection *= -1;
                    }

                    double newX = x + xDirection;
                    double newY = y + yDirection;

                    ball.relocate(newX, newY);
                })
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();

        primaryStage.setTitle("Bouncing Ball");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
