package com.sparta.me.fileio;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(
                    "src/main/resources/database.properties"));
            String line = reader.readLine();
            while(line!= null){
                System.out.println(line);
                line= reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
/*         try (BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/employees.csv"))) {
        reader.readLine();
        String line = reader.readLine();
        while(line != null) {
            System.out.println(Arrays.toString(line.split(",")));
            line = reader.readLine();
        }
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}*/
}
