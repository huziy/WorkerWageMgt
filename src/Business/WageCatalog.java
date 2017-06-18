/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hu.ziy
 */
public class WageCatalog {
        
    private List<Wage> wageCatalog;

    public WageCatalog() {
    wageCatalog = new ArrayList<Wage>();
    }
    
    public List<Wage> getWageCatalog(){
        return wageCatalog;
    }
    
    
    public Wage addWage(){
        Wage w = new Wage();
        wageCatalog.add(w);
        return w;
    }
    
    public void removeWage(Wage w){
        wageCatalog.remove(w);
    }
}
   