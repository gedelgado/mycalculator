package uh.ac.cr;

import uh.ac.cr.calculator.calculator;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner;
        int option = 0;
        scanner = new Scanner(System.in);
        do {
            System.out.println("Which operation do you want to perform");
            System.out.println("1-sum" +"\n"+"2-subtraction"+"\n"+"3-multiplication"+"\n"+"4-division"+"\n"+"5-finish");
            option = scanner.nextInt();
            calculator calculator = new calculator();

//menu
            if (option == 1) {
                calculator.askValuesToUse();
                float result = calculator.add();
                System.out.println("The result of the sum is " + result);
            } else if (option== 2){
                calculator.askValuesToUse();
                float subtractResult = calculator.subtract();
                System.out.println("The result of the subtraction is " + subtractResult);
            } else if (option== 3) {
                calculator.askValuesToUse();
                float multiplyresult = calculator.multiply();
                System.out.println("The result of the multiplication is " + multiplyresult);
            } else if (option== 4){
                calculator.askValuesToUse();
                float divideResult = calculator.divide();
                System.out.println("The result of the division is " + divideResult);
            }
            else if (option==5){
                System.out.println("End program");
            }
        } while (option==1 || option==2 || option==3 || option==4);
    }
}
