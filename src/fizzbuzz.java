public class fizzbuzz
{
    public static void main(String[] args) throws Exception
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i % 3 == 0)
                System.out.print("Fizz");
            if (i % 5 == 0)
                System.out.print("Buzz");
            if (i % 3 != 0 && i % 5 != 0)
                System.out.print(i);

            System.out.println();
        }

        System.out.println();
        System.out.println("Second method: ");
        fizzbuzz2();
    }

    public static void fizzbuzz2()
    {
        String fb;

        for (int i = 1; i <= 100; i++)
        {
            fb = (i % 3 == 0) ? "Fizz" : "";
            fb += (i % 5 == 0) ? "Buzz" : "";
            fb += ((i % 3 > 0) && (i % 5 > 0)) ? i : "";

            System.out.println(fb);
        }
    }
}