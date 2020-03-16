
/**
 * Review for questions that I missed (Question 2)
 * Topic: Static variables and methods 
 * @Aashi
 * @03/15/2020
 */
public class Sec5BQ2
{
    public static void main(String[] args)
    {
        Gadget a = new Gadget();
        System.out.println(Gadget.status); 
        Gadget.setStatus(3); 
        System.out.println(Gadget.status); 
        Gadget b= new Gadget(); 
        System.out.println(Gadget.status); 
    }
}
