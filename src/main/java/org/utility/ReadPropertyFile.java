package org.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFile {

    static Properties prop=null;
    static final String filePath="src/test/resources/config.properties";
    public static void readFile(){
        try{
            FileInputStream stream=new FileInputStream(filePath);
            prop=new Properties();
            prop.load(stream);
            stream.close();
        }catch(FileNotFoundException fe){
         fe.printStackTrace();
        }
        catch(IOException io){
            io.printStackTrace();
        }
    }
    public static String getProperty(String name){
        readFile();
        return prop.getProperty(name);
    }
}
