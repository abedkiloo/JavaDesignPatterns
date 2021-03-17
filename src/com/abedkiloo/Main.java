package com.abedkiloo;

public class Main {

    public static void main(String[] args) {

        var account = new Account();
        account.deposit(100);
        account.withdraw(10);
        System.out.println(account.getBalance());

        drawUI(new CheckBox());
        drawUI(new Button());
    }

    public static void drawUI(UIControl uiControl) {
        uiControl.draw();
    }
}
