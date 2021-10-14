/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package launch;


import Model.CountInstances;
import Model.Single;

/**
 *
 * @author Marcelo
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Count instances: "+CountInstances.getCount());
        Single aux = Single.getInstance();
        System.out.println("Count instances: "+CountInstances.getCount());
        Single aux2 = Single.getInstance();
        System.out.println("Count instances: "+CountInstances.getCount());
        
       
    }
}
