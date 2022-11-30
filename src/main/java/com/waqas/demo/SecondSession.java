package com.waqas.demo;

public class SecondSession {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Name 1";
        names[1] = "Name 2";
        names[2] = "Name 3";
        names[3] = "Name 4";
        names[4] = "Name 5";

        String[][] multi = new String[5][5];
        multi[0] = new String[4];
        multi[1] = new String[6];

        // Loops: for, while, do-while, foreach
        for (int i = 0; i < 5; i++) {
            System.out.println(names[i]);
        }

        //foreach loop
        for (String name : names){
            System.out.println(name);
        }
    }
}
