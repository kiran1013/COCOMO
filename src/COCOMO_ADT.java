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
public abstract class COCOMO_ADT {
    
    //see the COCOMO_ADT comment to understand why these are commented out -ke
    /*
    protected double SLOCLow;
    protected double SLOCHigh;
    */
    
    
    /**********************
    * This constructor is commented out because originally
    * I was storing the value of the SLOC in the class, 
    * but after Dr. Sheta said he wanted an upper and lower bound
    * I figured it would be better to just leave the SLOC variables in the GUI
    * and pass them as parameters to the MM_Nom and MM_Estimate functions.
    * I didn't delete this constructor completely because we might change
    * our minds and store the variables in the class later on. -ke
    *********************/
    
    /*
    COCOMO_ADT(int low, int high) {
        
        //divide by 1000 to convert to kilo of code
        //for example 5000 SLOC is 5K SLOC -ke
        SLOCLow = low / 1000;
        SLOCHigh = high / 1000;
        
    }*/

    
    
    /* Abstract functions 
     * Each mode and COCOMO model
     * have seperate ways of defining these -ke
     */
    
    //Man-month estimate
    abstract double MM_Estimate(int KSLOC);
    
    //Development time estimate
    abstract double TDEV(int KSLOC);
    
    //Will return the type of mode in string format
    //Returns "Organic", "Semi-Detached", or "Embedded" -ke
    abstract String getType();
}
