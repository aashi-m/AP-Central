
/**
 * Review for questions that I missed (Question 1)
 * Topic: Comparing Objects 
 * @Aashi
 * @03/14/2020
 */
public class Sec3Q1
{
    public static void main(String[] args)
    {
        String myString = new String("my string"); 
        String yourString = new String(); 
        yourString = "my string"; 
        
        boolean dotEquals = myString.equals(yourString); 
        boolean equalsEquals = (myString == yourString); 
        
        System.out.print(dotEquals + " " + equalsEquals); 
    }
}
