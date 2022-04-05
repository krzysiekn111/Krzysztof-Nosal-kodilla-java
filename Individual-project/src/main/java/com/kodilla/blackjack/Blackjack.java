package com.kodilla.blackjack;

//private Image imageback = new Image("table.png");
//private Image card = new Image("karta.jpeg");
//ImageView img = new ImageView(card);
//        cards.getChildren().add(img);
//BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
//        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Blackjack extends Application {

    private Image imageback = new Image("table.png");
    private Image card = new Image("karta.jpeg");
    private FlowPane cards = new FlowPane(Orientation.HORIZONTAL);

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BackgroundSize backgroundSize = new BackgroundSize(100, 100, true, true, true, false);
        BackgroundImage backgroundImage = new BackgroundImage(imageback, BackgroundRepeat.REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, backgroundSize);
        Background background = new Background(backgroundImage);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.BOTTOM_CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        grid.setHgap(5.5);
        grid.setVgap(5.5);
        grid.setBackground(background);

        ImageView img = new ImageView(card);
        cards.getChildren().add(img);

        grid.add(cards, 0, 0, 3, 1);
        Button button = new Button("Przycisk");
        grid.getChildren().add(button);

        Scene scene = new Scene(grid, 1000, 500, Color.BLACK);

        primaryStage.setX(100);
        primaryStage.setY(60);
        primaryStage.getIcons().add(card);
        primaryStage.setTitle("BlackJack");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}