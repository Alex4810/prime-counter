import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number:\n");
        int input = scan.nextInt();
        countPrimes(input);
        System.out.println("\nThere are " + count + " prime numbers under " + input + ".");

    }

    public static boolean isPrime(int num)
        {
        if(num == 2 )
        {
            return true;
        }
        else if (num==1||num==0)
        {
            return false;
        }
        else for (int i = 2; i < Math.sqrt(num) + 1; i++)
        {
            if(num%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    public static int count = 0;

    public static void countPrimes(int num) {
        for(int i = 2; i < num; i ++)
        {
            if(isPrime(i))
            {
                count++;
                System.out.println(count + ". " + i);
            }
        }
    }

}
