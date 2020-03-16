
/**
 * Model class for Section 5, Question 4
 */
public class Student
{
    private String firstName;
    private String lastName;
    private int age;
    public Student(String firstName, String lastName, int age)
    {
        firstName = firstName;
        lastName = lastName;
        age = age;
        //firstName, lastName and age will not initialize properly because they refer to the local variables inside the constructor;
    }
    public String toString()
    {
        return firstName + " " + lastName;
    }
}
