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
        
        Map maptrans = new LinkedHashMap();
        maptrans.put("от", "from");
        maptrans.put("факапа", "fuckup");
        maptrans.put("до", "to");
        maptrans.put("можно", "you can");
        maptrans.put("успеть", "manage");
        maptrans.put("сделать", "make");
        maptrans.put("очень", "very");
        maptrans.put("много", "mutch");
        maptrans.put("столько", "so much");
        maptrans.put("всего", "just");
        maptrans.put("отбабахать", "do");
        maptrans.put("изменить", "change");
        maptrans.put("русло", "channel");
        maptrans.put("реки", "of river");
        maptrans.put("или", "or");
        maptrans.put("свернуть", "roll");
        maptrans.put("гору", "a mountain"); 
        maptrans.put("спрятать", "to hide");
        maptrans.put("угодно", "anything");
        maptrans.put("швы", "stitches");
        maptrans.put("и", "and");
        maptrans.put("налепить", "to stick");
        maptrans.put("заплаток", "patch");
        maptrans.put("никто", "nobody");
        maptrans.put("не", "not");
        maptrans.put("заметит", "notice");
        maptrans.put("подвоха", "trick");
        maptrans.put("взять", "take");
        maptrans.put("забить", "score");
        maptrans.put("гол", "a goal");
        maptrans.put("сменить", "change");
        maptrans.put("пол", "the gender");
        maptrans.put("организовать", "organize");
        maptrans.put("новый", "a new"); 
        maptrans.put("фестиваль", "festival");
        maptrans.put("но", "but");
        maptrans.put("нельзя", "you can't");
        maptrans.put("отодвинуть", "move");
        maptrans.put("дедлайн", "deadline");
        maptrans.put("что", "that");
        maptrans.put("дедлайн", "deadline");
        maptrans.put("fuckup", "факап");
        
        //System.out.println(map1);
        //System.out.println(map1.get("красный"));        
        try {
            System.out.print("Enter the file name with extension : ");

            Scanner input = new Scanner(System.in);

            File file = new File(input.nextLine());
            input = new Scanner(file);
            
            System.out.println();    
            
            String word = null;   
            while (input.hasNextLine()) {
                String line = input.nextLine();
                //System.out.println(line);
                
                for (String s : line.split(" ")) {
                    String res = (String) maptrans.get(s);
                    
                    //System.out.println(s);
                    word=res+" ";
                    System.out.print(word);
                }    
                System.out.println();
            }
            input.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
    }
    
}
