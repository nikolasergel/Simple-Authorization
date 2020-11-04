package by.serhel.model;

import java.io.IOException;

public class LoginImpl implements Login {
    @Override
    public boolean login(String login, String pass) throws IOException {
        DataReader dataReader = new DataReader();
        if(dataReader.findLogin(login)){
            boolean isAuthorized = dataReader.checkPass(pass);
            System.out.println(isAuthorized ? "Successful authorization!" : "Invalid password!");
            return isAuthorized;
        }
        else{
            System.out.println("User isn't exists!");
        }
        return false;
    }
}
