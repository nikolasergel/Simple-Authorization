package by.serhel.model;

import java.io.IOException;

public interface Login{
    boolean login(String login, String pass) throws IOException;
}
