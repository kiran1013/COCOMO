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
public abstract class Intermediate_ADT extends COCOMO_ADT {
    private double[] driver;    //array of drivers
    
    
    /*
     * Constructors
     */
    Intermediate_ADT() {
        driver = new double[15];
    }
    
    
    /**************************************************************
     * See COCOMO_ADT to understand why this is commented out -ke *
     **************************************************************/
    /*
    Intermediate_ADT(int low, int high) {
        super(low, high);       //calls the parent constructor with
                                //the two passed values
        driver = new double[15];
    }
    */

    
    //Nominal Man-Month estimate
    //parameter 'bound' holds either the upper or lower SLOC 
    //bound -ke
    abstract double MM_Nom(int KSLOC);
    
    
    //This function copies the values from the GUI sliders into the
    //driver array, paramenter 'double []d' is the array of converted values from
    //of the sliders from the GUI .js file -ke
    public void setDrivers(double[] d) {
        
        driver = d.clone();     
        
    }
    
    
    //Nominal Man-Month estimate multiplied by the driver ratings
    //parameter 'bound' is the uppoer or lower SLOC bound -ke
    public double MM_Estimate(int KSLOC) {
        
        return MM_Nom(KSLOC) * (driver[0] * driver[1] * driver[2] * driver[3] * driver[4]
                * driver[5] * driver[6] * driver[7] * driver[8] * driver[9] 
                * driver[10] * driver[11] * driver[12] * driver[13] 
                * driver[14]);
    }

    
}
