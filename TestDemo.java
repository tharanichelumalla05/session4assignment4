package assignment4;
//Package is a grouping of related types providing access protection and name 
//created as package assignment4
import java.util.Scanner;
//import keyword is used to import built-in and user defined package into our java source file. So that our class can refer a class that is in another package by directly 
//using it's name. It aLLows you to specify classes from other packages that can be referenced without qualify them with their package.
//java.util contains the collection of framework,legacy collection classes event model,data and time facilities,internationalization and miscellaneous utility classes
//Scanner is a simple text scanner which can parse primitive types ans string using regular expressions

public class TestDemo {
	//created class as TestDemo
	//classes are the basics of opps
			
		public static void main(String[] args) {
			//Here public is a access modifier which defines who can access this method
			//Here static a keyword which identifies class related thing
			//void is used to define return type of the method,void means method wont return any value
			//main is name of method,and to display
			//declares method String[]
			//String[]args means arguments will be passed into main method and says that main() as a parameter


		 //System.out.println(Integer.parseInt(args[0]));
	//we are checking whether we gave zero or not 
		//int n1=Integer.parseInt(args[0]);
		int n1 = 0;
      if(n1==0){
 //using if loop checking that if it is equal to zero it shows that we have entered zero
    	  System.out.println("you have entered zero");//system is used to return code
          //out is a static number
          //println is used to print text and gives output

      String char1=null;
      //taking ASCII value ha null it prints as null
      System.out.println("ASCII value of n is"+(char1));
 //prints the ASCII value
      }
	else if(n1<0)
//if we pass negative arguments it will show negative value
	{
		System.out.println("you have entered negative values");
	}else
	{
		//positive arguments
		System.out.println("you have entered positive values");
	}
   Scanner in=new Scanner(System.in);
   //we are using scanner to initialize the input values 
   System.out.print("Enter the marks of Physics");
   //it print the values
   int num1=in.nextInt();
   
   System.out.print("Enter the marks of Chemistry");//system is used to return code
   //out is a static member
   //println is used to print text and gives output

   int num2=in.nextInt();
   
   System.out.print("Enter the marks of Maths");//system is used to return code
   //out is a static member
   //println is used to print text and gives output

   int num3=in.nextInt();
    
   int physics=num1,chemistry=num2,maths=num3,average;
   //after intializing the marks it calculate the average value
   
   average=(physics+chemistry+maths)/3;
    if(average>=70)//if average grater than or equal to 70
    {
    	//if the value is equal to input then it show the grade
    	System.out.println("Grade A");//system is used to return code
        //out is a static number
        //println is used to print text and gives output

    }
    if((average>=61) && (average<70))
    {
    	System.out.println("Grade B");//system is used to return code
        //out is a static member
        //println is used to print text and gives output

    }
    if(average<61)//if average grater than or equal to 61
    {
    	System.out.println("Grade C");//system is used to return code
        //out is a static member
        //println is used to print text and gives output

    }
		}    
    
}