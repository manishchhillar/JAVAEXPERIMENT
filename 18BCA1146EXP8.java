import java.util.Scanner; 
class help 
{ 
int a,b; 
Scanner sc= new Scanner(System.in); 
void setdata() 
{ 
int a,b; 
System.out.print("Enter the value of a:") 
a=Integer.parseInt(sc.nextLine()); 
System.out.print("Enter the value of b:") 
b=Integer.parseInt(sc.nextLine()); 
  this.a=a; 
  this.b=b; 
} 
 
void showresult() 
 { 
System.out.println("division of two number is:"+(a/b)); 
  } 
} 
public class done 
{ 
public static void main(String[], num) 
{ 
help e= new help(); 
 try{ 
   d.setdata(); 
   d.showresult(); 
   } 
 catch(ArithmeticExcepetion h) 
{ 
System.out.println(" an Arithmetic Exception ") 
} 
 catch(NumberformateException h) 
 { 
  System.out.println("This is a Number format Exception!.."); 
} 
} 
} 