import java.util.Scanner;

public class AddTwoInt{
    //add function
    public static int addTwoInt(int a, int b)
    {
        return a + b;
    }

    //driver
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(addTwoInt(a,b));
    }
}