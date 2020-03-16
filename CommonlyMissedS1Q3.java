
/**
 * Required review for commonly missed questions (Section 1, Question 3)
 * Topic: Casting and Ranges of Variables
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS1Q3
{
    public static void main(String[] args)
    {
        System.out.println("The following code should print '6.0':"); 
        System.out.println("double fact1 = 1/2; \n double fact2 = 3*4; \n double product = fact1 * fact2; System.out.print(product)"); 
        double fact1 = 1/2; 
        double fact2 = 3*4; 
        double product = fact1 * fact2; 
        System.out.println("Instead it prints " + product); 
        System.out.println("What is the error?"); 
        System.out.println(); 
        System.out.println("Since it is printing 0.0, the error is that either the 1 or 2 in variable fact1 should be cast to double");
        System.out.println("Rather, what it is doing is dividing them as integers first, then storing the result as a double"); 
    }
}
