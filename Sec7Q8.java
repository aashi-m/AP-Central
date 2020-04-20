import java.util.*;
/**
 * Missed questions from Section 7 (Question 8), (Score: 16/18)
 * Topic: Traversing ArrayLists
 * @Aashi 
 * @04/17/2020
 */
public class Sec7Q8
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("mat");
        words.add("new");
        words.add("open");
        words.add("pet");
        int i = 0;
        while (i < words.size())
        {
            words.remove(i);
            i++;
        }
        System.out.println(words.toString());

    }
}
