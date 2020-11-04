package by.serhel.math.controller;

import by.serhel.math.model.Login;
import by.serhel.math.model.LoginImpl;
import by.serhel.math.model.Register;
import by.serhel.math.model.RegisterImpl;
import by.serhel.math.view.Inputter;
import by.serhel.math.view.Printer;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Register register = new RegisterImpl();
        Login login = new LoginImpl();
        Inputter inputter = new Inputter();

        boolean isAuthorized = false;
        while(!isAuthorized){
            Printer.println("\nChoose an operation: ");
            Printer.println("1 - login");
            Printer.print("2 - registration: ");
            String buff = inputter.readLine();
            if(!buff.equals("2") && !buff.equals("1")){
                continue;
            }

            Printer.print("Enter your login: ");
            String log = inputter.readLine();
            Printer.print("Enter your password: ");
            String pass = inputter.readLine();
            try {
                switch (buff) {
                    case "1": {
                        isAuthorized = login.login(log, pass);
                        break;
                    }
                    case "2":{
                        register.registration(log, pass);
                        break;
                    }
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
