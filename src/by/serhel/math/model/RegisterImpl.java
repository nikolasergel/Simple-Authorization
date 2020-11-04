package by.serhel.math.model;

import by.serhel.math.view.Printer;

import java.io.IOException;

public class RegisterImpl implements Register{


    @Override
    public boolean registration(String login, String pass) throws IOException{
        DataReader dr = new DataReader();
        if(dr.findLogin(login)){
            Printer.println("User is already exists!");
            return false;
        }

        DataWriter dw = new DataWriter();
        dw.write(login);
        dw.write(pass);
        Printer.println("Successful registration");
        return true;
    }
}
