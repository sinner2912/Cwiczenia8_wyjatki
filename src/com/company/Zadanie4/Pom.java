package com.company.Zadanie4;

public class Pom {

    public void except(int a, String b)
    {
        try{
            if(a == 0) throw new Exception1();

            if(b == "") throw new Exception2();

            if(a==5 && b=="g") throw new Exception3();

        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally został wykonany");
            System.out.println();
        }
    }

}

class Exception1 extends Exception
{
    @Override
    public String toString(){
        return "Int jest równy 0";
    }
}

class Exception2 extends Exception
{
    @Override
    public String toString(){
        return "String jest pusty";
    }
}

class Exception3 extends Exception
{
    @Override
    public String toString(){
        return "Int nie może być równy 5 gdy string jest równy 'g'";
    }
}
