package chapters.chapter_12.Checkpoints12;

public class Checkpoint12_09_10_11_12_13 {

    // Checkpoint12_09
    /*
    Purpose of declaring exceptions is to tell Java run system what can go wrong.
    You declare an exception by using throws keyword in method declaration(at the end)
    You can declare multiple exceptions b separating with commas.
     */


    // Checkpoint12_10
    /*
    Checked exceptions must be declared in the method declaration and must be caught by try - catch block.
    Unchecked exception doesn't need to be declared or caught int Java. RuntimeException and Errors are unchecked exceptions.
     */


    // Checkpoint12_11
    /*
    By using throw keyword we throw exception. Cannot throw multiple exceptions in one statement.
     */


    // Checkpoint12_12
    /*
    Throw: is using for throwing exception.
    Throws: is using for declaring that the method can throw an exception.
     */


    // Checkpoint12_13
    /*
       (statement2 causes an exception)
        try {
            statement1;
            statement2;
            statement3;
        }
        catch (Exception1 ex1) {
        }
        catch (Exception2 ex2) {
        }
        statement4;
        Will statement3 be executed?---------------------------------------------------> NO
        If the exception is not caught, will statement4 be executed?-------------------> NO
        If the exception is caught in the catch block, will statement4 be executed?----> YES
     */
}
