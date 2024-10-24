package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import static com.example.demo1.Model.board;

public class HelloController implements IView{

    @FXML
    private Button button00;

    @FXML
    private Button button10;

    @FXML
    private Button button20;

    @FXML
    private Button button01;

    @FXML
    private Button button11;

    @FXML
    private Button button21;

    @FXML
    private Button button02;

    @FXML
    private Button button12;

    @FXML
    private Button button22;

    @FXML
    private Label welcomeText;


    private Presenter presenter;


    public HelloController() {
        presenter = new Presenter(this);
    }

    public void clicked00(ActionEvent actionEvent) {

        System.out.println("clicked 00");
        presenter.userClick(0,0);
    }

    public void clicked10(ActionEvent actionEvent) {
        System.out.println("clicked 10");
        presenter.userClick(1,0);

    }
    public void clicked20(ActionEvent actionEvent) {
        System.out.println("clicked 20");
        presenter.userClick(2,0);

    }
    public void clicked01(ActionEvent actionEvent) {
        System.out.println("clicked 01");
        presenter.userClick(0,1);

    }
    public void clicked11(ActionEvent actionEvent) {
        System.out.println("clicked 11");
        presenter.userClick(1,1);

    }
    public void clicked21(ActionEvent actionEvent) {
        System.out.println("clicked 21");
        presenter.userClick(2,1);

    }
    public void clicked02(ActionEvent actionEvent) {
        System.out.println("clicked 02");
        presenter.userClick(0,2);

    }
    public void clicked12(ActionEvent actionEvent) {
        System.out.println("clicked 12");
        presenter.userClick(1,2);

    }
    public void clicked22(ActionEvent actionEvent) {
        System.out.println("clicked 22");
        presenter.userClick(2,2);

    }
    @Override
    public void displayMessage(String message) {
            welcomeText.setText(message);
    }
    @Override
    public void updateBoard(int row, int col, char c) {
        board[row][col] = c;
        switch (row) {
            case 0:
                switch (col) {
                    case 0:
                        button00.setText(String.valueOf(c));
                        break;
                    case 1:
                        button01.setText(String.valueOf(c));
                        break;
                    case 2:
                        button02.setText(String.valueOf(c));
                        break;
                }
                break;
            case 1:
                switch (col) {
                    case 0:
                        button10.setText(String.valueOf(c));
                        break;
                    case 1:
                        button11.setText(String.valueOf(c));
                        break;
                    case 2:
                        button12.setText(String.valueOf(c));
                        break;
                }
                break;
            case 2:
                switch (col) {
                    case 0:
                        button20.setText(String.valueOf(c));
                        break;
                    case 1:
                        button21.setText(String.valueOf(c));
                        break;
                    case 2:
                        button22.setText(String.valueOf(c));
                        break;
                }
                break;
        }
    }
}