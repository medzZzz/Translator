/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author medvedev
 */
public class Reader { 

    void startReader(LinkedList<TransLanguage> t_list, Dictionary dict) { // метод читает файл, парсит полученные строки по словам,
        //по слову ищет в мапе з нчение и заносит оба слова (рус\англ) в объекты tlang, а затем добавляет эти объекты в LinkedList t_list.
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    
        try { 
            System.out.print("Введите имя файла с расширением: ");  

            Scanner input = new Scanner(System.in); //создаем экземпляр класса Scanner и ждем пользовательский ввод

            File file = new File(input.nextLine()); //создаем объект экземпляра File со значением введеным пользователем (имя файла с расширением)
            input = new Scanner(file);  // в ссылочную переменную заносим объкт Scanner, готовый обработать наш файл
            
            while (input.hasNextLine()) { //запускаем цикл, в котором Scanner выбираем строки из файла поочереди
                String line = input.nextLine(); //заносим полученную строку в переменную line
            
                for (String s : line.split(" ")) { // перебираем строку, разбивая блоки пробелами, то есть разбиваем строку по словам
                    String res = (String) dict.trans.get(s); // в переменную res заносим значение из мапы(словаря) используя поиск по слову-ключу "s"
                    
                    TransLanguage tlang = new TransLanguage(s,res); // создаем экземпляр класса, который будет хранить в одном поле русское значение, в другом английское.
                    
                    t_list.addLast(tlang); // наполняем LinkedList новыми объектами tlang, которые содержат пары значений
                }
            }
            System.out.println(); 
    
            input.close(); //закрываем работу с файлом
        }catch (Exception ex) { //открывается обработка исключения, если с выбором файла что-то пошло не так
            //ex.printStackTrace();
            System.out.println();
            System.out.println("'Некорректное открытие файла!'");
            System.exit(0); // принудительное завершение работы программы
            System.out.println(); 
        }
    }

    int userinput() { // метод принимает введенное значение (выбор вывода языка) от пользователя, преобразует выбор в Int и передает его в main для обработки.
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        Scanner user_input = new Scanner(System.in); //создание объекта Scanner и присвоение ссылки на него переменной user_input
            System.out.print("Пожалуйста, введите номер операции: 1 - вывод на русском, 2 - вывод на английском:  - ");
            int user_choice = user_input.nextInt(); // преобразуем ввод от пользователя в Int
            return user_choice; //возвращаем пользовательский выбор языка
    }
}