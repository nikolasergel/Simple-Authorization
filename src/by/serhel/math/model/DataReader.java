package by.serhel.math.model;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DataReader {
    private Scanner sc;
    private String password;

    public DataReader() throws IOException {
        File file = new File(DataWriter.filePath);
        file.createNewFile();
        sc = new Scanner(new FileReader(file));
    }

    public boolean findLogin(String login){
        String foundLogin = "";
        while (sc.hasNextLine() && !foundLogin.equals(login)){
            foundLogin = sc.nextLine();
            if(sc.hasNextLine()){
                password = sc.nextLine();
            }
        }
        return foundLogin.equals(login);
    }

    public boolean checkPass(String pass){
        return password.equals(pass);
    }
}
