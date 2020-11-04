package by.serhel.model;

import java.io.*;

public class DataWriter {
    public static String filePath = "data.txt";

    public DataWriter(){

    }

    public DataWriter(String path){
        filePath = path;
    }

    public void write(String str) throws IOException {
        File file = new File(filePath);
        if(!file.exists()){
            file.createNewFile();
        }
        BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
        bw.append(str).append("\n");
        bw.close();
    }
}
