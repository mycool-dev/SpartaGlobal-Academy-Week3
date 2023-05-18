package com.sparta.me.jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
//write the json object to a json file and also do the same but to a xml file

public class Main {
    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        XmlMapper xmlMapper = new XmlMapper();

        try {
            ArrayList<Boolean> flags = new ArrayList<Boolean>(Arrays.asList(true, false, false, true, true));
            Spartan michael = new Spartan("Michael", "Java", flags);

            String xmlOutput = xmlMapper.writeValueAsString(michael);
            String output = mapper.writeValueAsString(michael);

            FileWriter fw = new FileWriter("src/main/java/com/sparta/me/output/output.json");//key value pairs
            FileWriter fw1 = new FileWriter("src/main/java/com/sparta/me/output/output.xml");

            fw.write(output);
            fw1.write(xmlOutput);
            fw.close();
            fw1.close();
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //System.out.println(output);
    }
}
