package com.company.Zadanie1;

public class Pom {

    String a;

    public void err()
    {
        try
        {
            if (a.equals("aaa"))
                System.out.print("Takie same");
            else
                System.out.print("Nie takie same");
        }
        catch(NullPointerException e)
        {
            System.out.print("Wyjątek złapany");
            toString();
            e.printStackTrace();
        }
    }
}
