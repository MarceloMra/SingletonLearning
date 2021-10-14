package Model;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class Single {
    
    private static Single instance;
    
    private Single(){
        CountInstances.increaseCount();
    }
    
    public static Single getInstance(){
        if(instance == null){          
            if(instance == null){
                instance = new Single();
            }
        }
        
        return instance;
    }
    
   
}
