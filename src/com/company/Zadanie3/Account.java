package com.company.Zadanie3;

public class Account {
    private String owner;
    private int balance,accountNumber;

    public Account(String owner, int balance, int accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void przelew(int ilosc)
    {
        try
        {
            if(ilosc>balance) throw new NotEnoughMoneyException();
        }
        catch (NotEnoughMoneyException e)
        {
            System.out.println(e);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Zostało: "+balance);
        }
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
}

class NotEnoughMoneyException extends Exception{
    @Override
    public String toString(){
        return "Nie masz wystarczających środków na kącie";
    }

}
