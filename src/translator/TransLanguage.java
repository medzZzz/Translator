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
public class TransLanguage {
    protected String l_native;
    protected String l_alternative;
    public TransLanguage(String nat, String alternat) {
        this.l_native=nat;
        this.l_alternative=alternat;
        //System.out.println(nat+" | "+alternat);
    }
    
    public String getNative() { //геттер
      return this.l_native;
   }
    public String getAlternative() { //геттер
      return this.l_alternative;
   }
}

