/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package characterstream3;

import java.io.FileWriter;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class CharacterStream3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            FileWriter  file = new FileWriter("data.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("hello World");
            output.write("Welcome to java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(CharacterStream3.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            FileReader file = new FileReader("data.txt");
            BufferedReader input = new  BufferedReader(file);
            String s;
            while((s=input.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CharacterStream3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
