/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocomo;

import java.util.Scanner;

/***************************************************************
 * Leave your initials after each significant comment please   *
 *                                                             *
 * -ke for Kiran Eastman                                       *
 * -nj for Noel James                                          *
 * -wk for William Kelly                                       *
 ***************************************************************/
public class Intermediate_SemiDetached extends Intermediate_ADT {
    
    
    //default constructor
    Intermediate_SemiDetached() {
        super(); //call the parent class default constructor
                 //This will initialize the driver array -ke
    }
    
    
    /**************************************************************
     * See COCOMO_ADT to understand why this is commented out -ke *
     **************************************************************/
    /*
    //constructor called with sloc
    Intermediate_SemiDetached(int low, int high) {
        super(low, high);   //send sloc to Intermediate_ADT constructor
    } */
    
    
    /***********************************
     * formulas for Intermediate COCOMO
     **********************************/
    
    public double MM_Nom(int KSLOC) {
        return 3 * Math.pow(KSLOC, 1.12);
    }
            
    public double TDEV(int KSLOC) {
        return 2.5 * Math.pow(MM_Estimate(KSLOC), 0.35);
    }
    
     public String getType() {
        return "Semi-Detached";
    }   

}
