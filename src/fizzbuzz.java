public class fizzbuzz
{
    public static void main(String[] args) throws Exception
    {
        for (int count = 1; count < 100; count++)
        {
            if (count % 3 == 0)
                System.out.print("fizz");
            if (count % 5 == 0)
                System.out.print("buzz");
            if (count % 3 != 0 && count % 5 != 0)
                System.out.print(count);

            System.out.println();
        }
    }
}