/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author medvedev
 */
public class Dictionary {
    Map trans;
    public Dictionary() { //constructor
        //Создаем и заполняем мапу парами рус-англ (это наш словарь)
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
        
        this.trans=maptrans; // после наполнения мапы, заносим ее в поле создаваемого объекта
    }
}
