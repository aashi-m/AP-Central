
/**
 * Required review for commonly missed questions (Section 1, Question 1)
 * Topic: Expressions and Assignment Statements
 * @Aashi
 * @03/10/2020
 */
public class CommonlyMissedS1Q1
{
    public static void main(String[] args)
    {
        int a = 2/5%3; 
        int b = 2/(5%3); 
        int c = 2/5+1; 
        
        System.out.println("Expression I evaluates to " + a); 
        System.out.println("Expression II evaluates to " + b);
        System.out.println("Expression III evaluates to " + c); 
    }
}
