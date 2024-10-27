package com.example.demo1;

public class Presenter {

    private Model model;
    private IView view;
    private char ch;



    public Presenter(IView controller)
    {
        this.model = new Model();
        this.view = controller;
        this.ch = 'X';
    }

    public char getCh() {
        return ch;
    }

    public void setCh(char ch) {
        this.ch = ch;
    }

    //
    public void userClick(int row, int col)
    {
        // send event to model
        // 1 is legal
        // 2  win?? tie??

        if(!model.isLegal(row,col))
        {
            this.view.displayMessage("NOT LEGAL");
            // let the GUI show a message - ILLEGAL
            return;
        }
        // LEGAL MOVE - GUI - update board

        this.view.updateBoard(row,col,getCh());fffff
        char winner = model.checkWin(row,col);
        if(winner != ' ')
            this.view.displayMessage("THE WINNER IS: " + winner);
        else if(model.isBoardFull())
            this.view.displayMessage("IT'S A TIE!");
        if(getCh() == 'X') {
            setCh('O');
        }
        else{
            setCh('X');
        }
    }


}
