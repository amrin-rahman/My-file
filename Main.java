import java.io.*;
class Account {
     String name;
     int id,balance;
     Account(String n, int i, int b){
        name = n;
        id = i;
        balance = b;
     }
     Account(){

     }
  void setValue(String n, int i, int b){
        name = n;
        id = i;
        balance = b;
  }
    void deposite (int amount){
        balance = balance + amount;
    }
     void withdraw (int amount){ 
        balance = balance - amount;
     }
     void PrintInfo(){
        System.out.println("Name :" +name);
        System.out.println("ID :" +id);
        System.out.println("Balance :" +balance); 
     }
  }

  public class Main{
    public static void main(String[] args){
      Account rahim = new Account();
      rahim. setValue("rahim", 244296220, 100000);
      rahim.PrintInfo();

    }
  }