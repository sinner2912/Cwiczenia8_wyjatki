package com.company.Zadanie2;

public class Pom {


    public void err(int a)
    {
        int table[] = {0};
        int wynik;
        try
        {
            if(a == 0) table[3] = 1;
            else wynik = a/0;
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Wyjątek: ArrayIndexOutOfBoundsException");
        }
        catch (ArithmeticException e)
        {
            System.out.println("Wyjątek: ArithmeticException");
        }
        finally {
            System.out.println("finally zostało wykonane");
        }
    }
}
