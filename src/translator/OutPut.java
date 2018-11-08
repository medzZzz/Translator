/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author medvedev
 */
public class OutPut { 
    void display(LinkedList<TransLanguage> t_list, int choice) { // метод создает итератор для LinkedList, чтобы пройти по всем объектам, выводит поля объектов
        // в соответствии с выбранным языком.
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
         ListIterator<TransLanguage> listIter = t_list.listIterator();
        while (listIter.hasNext()){ //пока у него есть следующий элемент
                
            //присваиваем объект ссылочной переменной tlang и используем геттер для этого объекта, с условием вывода на рус или англ языке
            TransLanguage tlang = listIter.next();
            if (choice==1){
                System.out.println(tlang.getNative());    
            } else if (choice==2) {
                System.out.println(tlang.getAlternative());
            }
        }
    }
    
}
