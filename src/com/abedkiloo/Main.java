package com.abedkiloo;

import com.abedkiloo.momento.Editor;
import com.abedkiloo.momento.History;

public class Main {

    public static void main(String[] args) {

        var account = new Account();
        account.deposit(100);

        //memento pattern in place
        var editor = new Editor();
        var history = new History();

        editor.setContent(String.valueOf(account.getBalance()));
        history.push(editor.createState());
        System.out.println(editor.getContent());


        account.withdraw(10);
        editor.setContent(String.valueOf(account.getBalance()));
        history.push(editor.createState());
        System.out.println(editor.getContent());




        editor.setContent(String.valueOf(200));
        System.out.println(editor.getContent());
        editor.restore(history.pop());
        System.out.println(editor.getContent());


    }

    public static void drawUI(UIControl uiControl) {
        uiControl.draw();
    }
}
