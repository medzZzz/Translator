/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;
import java.io.*;
import java.util.*;

/**
 *
 * @author medvedev
 */
public class Translator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Dictionary dict = new Dictionary();
               
        LinkedList<TransLanguage> t_list = new LinkedList<TransLanguage>();
        
        Reader scan = new Reader();
        scan.startReader(t_list,dict);
        int choice = scan.userinput();
        
        OutPut out = new OutPut();
        out.display(t_list,choice);

    }
}