package by.serhel.math.model;

import java.io.IOException;

public interface Register {
    boolean registration(String login, String pass) throws IOException;
}
