public class ControlFlow
{
    public static void main(String[] args)
    {
        int age = 17;

        if (age >= 18)
        {
            System.out.println("You can vote.");
            System.out.println("Please put an X in the ballot.");
        } else
        {
            if (18 - age == 1)
            {
                System.out.println("You can't vote; \nPlease come back in " + (18 - age) + " year.");
            }
            System.out.println("You can't vote; \nPlease come back in " + (18 - age) + " years.");
        }

        int year = 2022;

        if (year != 2019)
        {
            System.out.println("The year is = " + year);
        }
        else if (year == 2020)
        {
            System.out.println("The year is = " + year);
        }
        else if (year == 2022)
        {
            System.out.println("The year is = " + year);
        }
        else
        {
            System.out.println("All conditions failed.");
        }

        boolean isActive = true;
        int myNumber = 20;

        if (!isActive)
        {
            System.out.println("The user is active.");
        }
        else
        {
            System.out.println("The user is not active.");
        }

        if (!(myNumber >= 10))
        {
            System.out.println("The user is active.");
        }
        else
        {
            System.out.println("The user is not active.");
        }
    }
}
