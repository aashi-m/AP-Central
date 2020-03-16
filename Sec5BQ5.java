
/**
 * Review for questions that I missed (Question 5)
 * Topic: Accessor Methods, this keyword
 * @Aashi
 * @03/15/2020
 */
public class Sec5BQ5
{
    public static void main(String[] args)
    {
        Contact c = new Contact("Alice", "555-1234");
        c.doSomething();
        c = new Contact("Daryl", "");
        c.doSomething();
    }
}
