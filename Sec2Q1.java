
/**
 * Review for Questions that I missed (Question 1)
 * Topic: Calling a void method with parameters 
 * @Aashi
 * @03/14/2020
 */
public class Sec2Q1
{
    public static void main(String[] args)
    {
        System.out.println("Question: "); 
        System.out.println("What is printed as a result of the following code segment?:");
        System.out.println("printSomething(1, true); \n printSomething(2, true)\n"); 
        
        System.out.println("Answer: "); 
        printSomething(1, true); 
        printSomething(2, true); 
    }
    
    public static void printSomething(int num, boolean val)
    {
        num--; 
        System.out.print(val); 
        System.out.print(num);
    }
}
