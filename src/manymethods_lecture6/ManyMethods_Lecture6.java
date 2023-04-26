/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package manymethods_lecture6;
import javax.swing.JOptionPane;

/**
 *
 * @author lab_services_student
 */
public class ManyMethods_Lecture6 {

    // Global variables
    public static final double dblVat = 0.14;     
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        //User data entries
        String strProduct = JOptionPane.showInputDialog(null,"Please enter product name");
        double dblPrice = Double.parseDouble(JOptionPane.showInputDialog(null,"Please enter in the price for " + strProduct));
        int intAmt = Integer.parseInt(JOptionPane.showInputDialog(null,"Please enter in the amount of products"));
        
        double dblTotal = (dblPrice + intAmt);
        double dblVat_Amt = calculate_Vat(dblTotal,dblVat);
        double dblGrandTotal = calculate_Grand_Total(dblTotal, dblVat_Amt);
        print_Invoice(strProduct, dblGrandTotal, dblVat_Amt, dblTotal);
    }

    private static double calculate_Vat(double dblTotal, double dblVat) {
        
        double dblVat_Amt = (dblTotal * dblVat);
        return dblVat_Amt;
    }
    
    private static double calculate_Grand_Total(double dblTotal, double dblVat_Amt){
        
        double dblGrandTotal = (dblTotal + dblVat_Amt);
        return dblGrandTotal;
        
    }

    private static void print_Invoice(String strProduct, double dblGrandTotal, double dblTax, double dblBeforeTax) {
        System.out.println("");
        
         //Display receipt to the user
        JOptionPane.showMessageDialog(null,"PRODUCT: " + strProduct + "\n" +
                                                        "EX VAT: " + dblBeforeTax + "\n" + 
                                                        "VAT AMOUNT: " + dblTax+ "\n" +
                                                        "TOTAL: R " + dblGrandTotal);
    }
    
}
