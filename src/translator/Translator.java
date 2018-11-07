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
        
        //Заполняем мапу парами рус-англ (это наш словарь)
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
        
        LinkedList<TransLanguage> t_list = new LinkedList<TransLanguage>();
        
        //System.out.println(map1);
        //System.out.println(map1.get("красный"));        
        try { 
            System.out.print("Enter the file name with extension : ");  

            Scanner input = new Scanner(System.in); //создаем экземпляр класса Scanner и ждем пользовательский ввод

            File file = new File(input.nextLine()); //создаем объект экземпляра File со значением введеным пользователем (имя файла с расширением)
            input = new Scanner(file);  // в ссылочную переменную заносим объкт Scanner, готовый обработать наш файл
            
            System.out.println();    
            
            
            
            String word = null;   
            while (input.hasNextLine()) { //запускаем цикл, в котором Scanner выбираем строки из файла поочереди
                String line = input.nextLine(); //заносим полученную строку в переменную line
                //System.out.println(line);
                
                for (String s : line.split(" ")) { // перебираем строку, разбивая блоки пробелами, то есть разбиваем строку по словам
                    String res = (String) maptrans.get(s); // в переменную res заносим значение из мапы(словаря) используя поиск по слову-ключу "s"
                    
                    TransLanguage tlang = new TransLanguage(s,res); // создаем экземпляр класса, который будет хранить в одном поле русское значение, в другом английское.
                    
                    t_list.addLast(tlang);
                    
                    //System.out.println(s);
                   // word=res+" ";
                    //System.out.print(word);
                }    
                System.out.println(); 
            }
            //System.out.println(t_list);
            input.close(); //закрываем работу с файлом

            
        } catch (Exception ex) { //открывается обработка исключения, если с выбором файла что-то пошло не так
            ex.printStackTrace();
        }
        
        Scanner user_input = new Scanner(System.in); //создание объекта Scanner и присвоение ссылки на него переменной user_input
        System.out.println("Пожалуйста, введите номер операции: 1 - вывод на русском, 2 - вывод на английском, 0 - завершение работы");
        
        //организуем выбор пользователя
        //int user_choice=0;
        int user_choice = user_input.nextInt();
       // switch(choice){ 
       //                             case 1 : user_choice=1; break;
       //                             case 2 : user_choice=2; break;
       // }
            // перебираем линкед лист
            ListIterator<TransLanguage> listIter = t_list.listIterator();
            while (listIter.hasNext()){
                
                
               TransLanguage tlang = listIter.next();
               if (user_choice==1){
               System.out.println(tlang.getNative());    
               } else if (user_choice==2) {
               System.out.println(tlang.getAlternative());
               }
            }
        
    }
    
}
