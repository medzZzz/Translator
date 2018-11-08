/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package translator;

/**
 *
 * @author medvedev
 */
//класс, экземпляры которого будут в своих полях хранить пару значений "рус и англ"
public class TransLanguage {
    protected String l_native;
    protected String l_alternative;
    public TransLanguage(String nat, String alternat) { //конструктор, в котором сразу заполняются поля полученными аргументами
        this.l_native=nat;
        this.l_alternative=alternat;
    }
    
    public String getNative() { //геттер, выдающий содержимое поля с русскими занчениями
      return this.l_native;
   }
    public String getAlternative() { //геттер, выдающий содержимое поля с английскими занчениями
      return this.l_alternative;
   }
}

