import java.io.IOException;
import java.util.Scanner;

//main file
public class Main
{
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input number:\n");
        int input = scan.nextInt();
        countPrimes(input);

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

    public static void countPrimes(int num) throws IOException {
        WriteFile writeFile = new WriteFile("primeNumbers.txt");
        writeFile.openFile();
        for(int i = 2; i < num; i ++)
        {
            if(isPrime(i))
            {
                count++;
                String primeNumber = count + ". " + i;
                System.out.println(primeNumber);
                writeFile.writeToFile(primeNumber);
            }
        }
        String countMessage = "There are " + count + " prime numbers under " + num + ".";
        System.out.println(countMessage);
        writeFile.writeToFile(countMessage);
        writeFile.closeFile();
    }

}
