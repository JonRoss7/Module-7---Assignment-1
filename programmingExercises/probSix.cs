using System;

class Program {
    static int a = 5;

    static int fun() {
        a = 17;
        return 3;
    }

    static void Main() {
        int b = a + fun();
        Console.WriteLine("Result: " + b);
    }
}