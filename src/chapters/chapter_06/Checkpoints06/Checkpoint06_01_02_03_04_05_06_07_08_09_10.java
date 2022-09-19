package Checkpoints06;

public class Checkpoint06_01_02_03_04_05_06_07_08_09_10 {
    public static void main(String[] args) {

//Checkpoint06_01
/**
 * Methods can be used to define
 * reusable code and organize and simplify coding. Defining method:
 * public(modifier) static(modifier) int(return type)
 * max(method name)(int num1, int num2(format parameters))
 * {method body
 * return value}
 * Invoking method:
 * int z = max(a, b)  return (num1 > num2) ? num1 : num2 ;  True: a call to a method with a void return type is always a statement itself.
 * False: a call to a value-returning method is always a component of an expression. Note that a value-returning
 * method can also be invoked as a statement in Java. In this case, the caller simply ignores the return value.  Void  A syntax error occurs if a return statement is not used to return a value in a value-returning method.
 * You can have a return statement in a void method, which simply exits the method.
 * But a return statement cannot return a value such as return x + y in a void method. Parameter : A parameter is like a placeholder,
 * when you invoke a method you pass a value to the parameter.
 * Argument : The value that you passed to parameter referred as an argument (or actual parameter).
 * Method signature :
 * <p>
 * <p>
 * <p>
 * <p>
 * }
 * <p>
 * <p>
 * //Checkpoint06_02
 * /** Defining method:
 * public(modifier) static(modifier) int(return type)
 * max(method name)(int num1, int num2(format parameters))
 * {method body
 * return value}
 * Invoking method:
 * int z = max(a, b)  return (num1 > num2) ? num1 : num2 ;  True: a call to a method with a void return type is always a statement itself.
 * False: a call to a value-returning method is always a component of an expression. Note that a value-returning
 * method can also be invoked as a statement in Java. In this case, the caller simply ignores the return value.  Void  A syntax error occurs if a return statement is not used to return a value in a value-returning method.
 * You can have a return statement in a void method, which simply exits the method.
 * But a return statement cannot return a value such as return x + y in a void method. Parameter : A parameter is like a placeholder,
 * when you invoke a method you pass a value to the parameter.
 * Argument : The value that you passed to parameter referred as an argument (or actual parameter).
 * Method signature : The method name and the parameter list together constitute the method signature. A.  public static double salesCommission(double salesAmount, commissionRate)
 * B.
 * C.
 * /
 * <p>
 * <p>
 * <p>
 * <p>
 * }


 //Checkpoint06_03
 /** return (num1 > num2) ? num1 : num2 ; */


// Checkpoint06_04
/** True: a call to a method with a void return type is always a statement itself.
 False: a call to a value-returning method is always a component of an expression. Note that a value-returning
 method can also be invoked as a statement in Java. In this case, the caller simply ignores the return value. */


//Checkpoint06_05
/** Void */


//Checkpoint06_06
/** A syntax error occurs if a return statement is not used to return a value in a value-returning method.
 *  You can have a return statement in a void method, which simply exits the method.
 * But a return statement cannot return a value such as return x + y in a void method.*/


//Checkpoint06_07
/** Parameter : A parameter is like a placeholder,
 when you invoke a method you pass a value to the parameter.
 Argument : The value that you passed to parameter referred as an argument (or actual parameter).
 Method signature : The method name and the parameter list together constitute the method signature.*/


//Checkpoint06_08
/** A.  public static double getCommission(double salesAmount, commissionRate)
 * B.   public static void  printMonth(int year, int month)
 * C.   public static double sqrt(int number)
 * D.   public static boolean isEven(int number)
 * E.   public static void printMessage(int n)
 * F.   public static double monthlyPayment(double loanAmount, int numberOfYears, double annualInterestRate)
 * G.   public static char toUpperCase(char letter)
 */

    }

    //Checkpoint06_09
    public static int method1(int n, int m) {
        n += m;
        return method2(3, 4);
    }

    public static int method2(int n, int m) {
        if (n > 0)
            return 1;
        else if (n == 0)
            return 0;
        else
            return -1;
    }


    //Checkpoint06_10
    public  static double method(double i, double j){
        while (i < j){
            j--;
        }

        return j;
    }
}
