import chn.util.*; 
/**
 * Required review for commonly missed questions (Section 2, Question 2)
 * Topic: Using the Math Class
 * @Aashi
 * @03/14/2020
 */
public class CommonlyMissedS2Q5
{
    public static void main(String[] args)
    {
        System.out.println("Which code segment will print 2, 4, 6, or 8, with = probability?"); 
        System.out.println("Answer A: [int val not compiled]"); 
        System.out.println("Answer B : [int val not compiled]"); 
        
        int valC = (int) (Math.random() * 4); 
        valC *=2; 
        System.out.println("Answer C: " + valC); 
        
        int valD = (int) (Math.random() * 4 + 1); 
        valD *=2; 
        System.out.println("Answer D: " + valD); 
        
        int valE = (int) (Math.random() * 8 + 1); 
        valE *=2; 
        System.out.println("Answer E: " + valE); 
        
    }
}
