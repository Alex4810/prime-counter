import java.util.Scanner;

public class Main {
    public static void main(String args[])  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number:\n");
        int input = scan.nextInt();
        System.out.println(isPrime(input));
    }

    public static boolean isPrime(int num)  {
        if(num == 2 )   {
            return true;
        }
        else if (num==1||num==0)    {
            return false;
        }
        else for (int i = 2; i < Math.sqrt(num) + 1; i++)   {
            if(num%i == 0)  {
                return false;
            }
        }
        return true;
    }



}
