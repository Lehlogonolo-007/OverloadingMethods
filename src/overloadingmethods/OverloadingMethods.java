/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloadingmethods;

/**
 *
 * @author lehlo
 */
public class OverloadingMethods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int month=6, day=24, year=2023;
         displayDate(day);
         displayDate(day,month);
       displayDate(day,month,year);
            
    }
    static void displayDate(int dy)
    {
        System.out.println("The day is "+ dy);
    }
    static void displayDate(int dy, int mm)
        {
            System.out.println("The day is "+dy+" and the month is "+mm );
        }
   static void displayDate(int dy, int mm, int yr)
            {
                System.out.println("The day is "+dy+" and the month is "+mm+" in the year of "+yr);
            }
}
