package collectionFramework.studentChallenge;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable{
	String accno;
    String name;
    double balance;
    
    Account(){}
    
    Account(String a,String n,double b)
    {
        accno=a;
        name=n;
        balance=b;
    }
    
    public String toString()
    {
        return "Account No:"+accno+"\nName :"+name+"\nBalance :"+balance+"\n";
    }
}
