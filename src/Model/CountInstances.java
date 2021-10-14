/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Marcelo
 */
public class CountInstances {
    private static int count = 0;
    
    public static void increaseCount(){
        count++;
    }
    
    public static int getCount(){
        return count;
    }
}
