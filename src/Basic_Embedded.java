/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cocomo;

/***************************************************************
 * Leave your initials after each significant comment please   *
 *                                                             *
 * -ke for Kiran Eastman                                       *
 * -nj for Noel James                                          *
 * -wk for William Kelly                                       *
 ***************************************************************/
public class Basic_Embedded extends COCOMO_ADT {
    
    
    /**************************************************************
     * See COCOMO_ADT to understand why this is commented out -ke *
     **************************************************************/
    /*
    Basic_Embedded() {
        super();   //send sloc to COCOMO_ADT constructor
    }   
    
    
    //constructor called with sloc
    Basic_Embedded(int low, int high) {
        super(low, high);   //send sloc to COCOMO_ADT constructor
    }   
    */
    
    
    /****************************
    * formulas for Basic COCOMO
    *****************************/
    
    public double MM_Estimate(int KSLOC) {
        return 3.6 * Math.pow(KSLOC, 1.2);
    }
            
    public double TDEV(int KSLOC) {
        return 2.5 * Math.pow(MM_Estimate(KSLOC), 0.32);
    }
    
    public String getType() {
        return "Embedded";
    }    
}
