using System.IO;
using System;
class AddTwoIntC{
    public static int AddTwoInt(int a, int b){
        return a + b;
    }

    public static void Main(string []args){
        int a = Convert.ToInt32(Console.ReadLine());
        int b = Convert.ToInt32(Console.ReadLine());

        Console.WriteLine(AddTwoInt(a,b));
    }
}