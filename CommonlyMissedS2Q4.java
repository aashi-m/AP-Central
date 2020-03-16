
/**
 * Required review for commonly missed questions (Section 2, Question 1)
 * Topic: Creating and Storing Objects (Instantiation) 
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS2Q4
{
    public static void main(String[] args)
    {
        System.out.println("Question: "); 
        System.out.println("Which of the following code segments creates a reference of type Thing with a value of null?"); 
        System.out.println("A. Thing someThing = new Thing(\"Green\");");
        System.out.println("B. Thing someThing = new Thing(\"\");"); 
        System.out.println("C. Thing someThing = new Thing()"); 
        System.out.println("D. Thing someThing"); 
        System.out.println("E. Thing(\"Green\");"); 
        
        System.out.println("\nAnswer: ");
        Thing someThing1 = new Thing("Green");
        Thing someThing2 = new Thing(""); 
        Thing someThing3 = new Thing(); 
        Thing someThing4= null; 
        
        
        System.out.println("The value of A is: " + someThing1); 
        System.out.println("The value of B is: " + someThing2); 
        System.out.println("The value of C is: " + someThing3); 
        System.out.println("The value of D is: " + someThing4); 
        System.out.println("The value of E is: [compilation error]"); 
    }
}
