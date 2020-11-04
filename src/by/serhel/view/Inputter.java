package by.serhel.view;

import java.util.Scanner;

public class Inputter {
    private Scanner sc;

    public Inputter(){
        sc = new Scanner(System.in);
    }

    public String readLine(){
        return sc.nextLine();
    }
}
