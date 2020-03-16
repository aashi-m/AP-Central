
/**
 * Model class for Section 5, Question 1
 */
public class BoolTest
{
    private int one;
    public BoolTest(int newOne)
    {
        one = newOne;
    }
    public int getOne()
    {
        return one;
    }
    public boolean isGreater(BoolTest other)
    {
        return one > other.one;
    }
    public boolean isGreater2(BoolTest other)
    {
        return one > other.getOne();
    }
    public boolean isGreater3(BoolTest other)
    {
        return getOne() > other.one;
    }
}
