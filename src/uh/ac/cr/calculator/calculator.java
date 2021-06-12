package uh.ac.cr.calculator;
import java.util.Scanner;

public class calculator {
    Scanner scanner;
    float firtOperator;
    float secondOperator;
    float result;

    //Constructor: define los valores
    public calculator(){
    firtOperator = 0;
    secondOperator = 0;
    result = 0;
    scanner = new Scanner(System.in);
    }
    //Solicitud de valores al usuario que se muestran en pantalla
    public void askValuesToUse(){
        System.out.println("Enter the value of the first operator");
        firtOperator = scanner.nextFloat();

        System.out.println("enter the value of the second operator");
        secondOperator = scanner.nextFloat();
    }

    //Operaciones
    public float add(){
        return firtOperator + secondOperator;
    }
    public float subtract(){
        return  firtOperator - secondOperator;
    }
    public float multiply(){
        return  firtOperator * secondOperator;
    }
    public float divide() {
        if (secondOperator == 0){
            System.out.println("Error: can't divide by 0");
            return 0;
        }
        return firtOperator/secondOperator;
    }

}


