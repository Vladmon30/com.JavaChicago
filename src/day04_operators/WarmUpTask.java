package day04_operators;

public class WarmUpTask {
   public static void main(String[] args) {
	   //Pancakes: eggs - 2, flour - 1 cup, milk - 0.5 cup
	   // sugar - 2 spoons, oil - 2 table spoons
	   
	   int eggs = 2;
	   int cupOfFlour = 1;
	   double cupOfMilk = 0.5;
	   byte spoonsOfSugar =2;
	   short spoonsOfOil =2;
	   
	   System.out.println("You need "+ eggs +" eggs");
	   System.out.println("and " + cupOfFlour + " cupOfFlour ");
	   System.out.println("and " + cupOfMilk + " cupOfMilk ");
	   System.out.println("and " + spoonsOfSugar + " spoonsOfSugar");
	   System.out.println("and " + spoonsOfOil +" spoonsOfOil");
	   
	   System.out.println ("You need "+ eggs 
			   				+" eggs"+" and " + cupOfFlour + " cupOfFlour "
			   				+"and " + cupOfMilk + " cupOfMilk "
			   				+"and " + spoonsOfSugar + " spoonsOfSugar"
			   				+"and " + spoonsOfOil +" spoonsOfOil");
	   System.out.println("Hello!");
	   System.out.print("Dear Friends");
	   
	   
	   double apples = 10.5;
	   double carrots = 3.8;
	   double tomatoes = 6.2;
	   
	   double totalBeforeTax = apples + carrots + tomatoes;
	   System.out.println("total Before Tax: " + totalBeforeTax);
	   
	   double tax = totalBeforeTax *0.06;
	   System.out.println("Total tax:" +tax);
	   
	   double grandTotal = totalBeforeTax + tax;
	   System.out.println ("Your total is $" + grandTotal);
	   
   }
}
