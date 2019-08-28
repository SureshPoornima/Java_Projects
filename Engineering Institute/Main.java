import java.util.*;
import java.io.*;
class Faculty
{
  public void salary(int basesalary)
  {
    System.out.println("Base Salary: "+(basesalary));
  }
}
class CSE extends Faculty
{
  public void salary(int basesalary)
  {
	    System.out.println("CSE Faculty: "+(basesalary + 3000));
  }
}
class IT extends Faculty
{
  public void salary(int basesalary)
  {
	    System.out.println("IT Faculty: "+(basesalary + 5000));
  }
}
class ECE extends Faculty
{
  public void salary(int basesalary)
  {
	    System.out.println("ECE Faculty: "+(basesalary + 4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
	  Scanner obj = new Scanner(System.in);
	  int basesalary = obj.nextInt();
	  if (basesalary>0) 
	  {
      Faculty obj4 = new Faculty();
       obj4.salary(basesalary);
	  CSE obj1 = new CSE();
	  obj1.salary(basesalary);
	  IT obj2 = new IT();
	  obj2.salary(basesalary);
      ECE obj3 = new ECE();
      obj3.salary(basesalary);
      }
	  else
		  System.out.println("null");
  
  }
}