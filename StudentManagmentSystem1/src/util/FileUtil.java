/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import javax.management.RuntimeErrorException;

/**
 *
 * @author Hp
 */
public class FileUtil {
    public static void writeObjectToFile(Object object, String fileName) throws RuntimeException {
        try (
                FileOutputStream fout = new FileOutputStream(fileName);
                ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(object);
        }catch(Exception ex){
        
           throw  new RuntimeException(ex);
                }
        
    }
     public static Object readFileDeserialize(String fileName) {
        Object obj = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            obj = in.readObject();
        } finally {
            return obj;
        }
    }
    
}
