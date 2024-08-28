import java.util.Scanner;

public class MyNewProject
{
    public static void main (String [] args)
    {
        Scanner myScan = new Scanner(System.in);
        System.out.print("What is your name? : ");
        String name = myScan.nextLine();
        System.out.println(name + ", nice to meet you");
        myScan.close();
    } 
}