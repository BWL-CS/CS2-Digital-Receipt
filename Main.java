import java.util.Scanner;


   

public class Main {

  
  
  
  
  
  public static void main(String [] args) {
     // RECEIPT PRINTOUT SECTION
     int orderNumber = (int) (Math.random() * 100 + 1);
      //int drinksOrdered = (int) (Math.random() * 3);
      //int candiesOrdered = (int) (Math.random() * 3);
      //int hotdogsOrdered = (int) (Math.random() * 3);
      //int hamburgersOrdered = (int) (Math.random() * 3);
      String highSchoolName = "Jack";
      String itemList1 = "Drink";
      String itemList2 = "Candy";
      String itemList3 = "Hot Dog";
      String itemList4 ="Hamburger";
      double drinkPrice = 1.50;
      double candyPrice = 1.25;
      double hotDogPrice = 2.75;
      double hamburgerPrice = 3.50;
      double taxRate = 0.05;
      double subTotal;
      //double totalTax = subTotal*taxRate;
      //double total = subTotal+totalTax;
     // double value = ((int)(total * 100)/100.0);
      Scanner input = new Scanner(System.in);
      System.out.print("How many drinks?");
      String drinksOrderedInput = input.nextLine();
      System.out.print("How many candies?");
      String candiesOrderedInput = input.nextLine();
      System.out.print("How many hotdogs?");
      String hotdogsOrderedInput = input.nextLine();
      System.out.print("How many hamburgers?");
      String hamburgersOrderedInput = input.nextLine();
      System.out.print("Enter your full high school name: ");
      String nameOfSchool = input.nextLine();
      nameOfSchool = nameOfSchool.trim();
      String initials = nameOfSchool.substring(0, 1);
      for (int i = 0; i < nameOfSchool.length() - 1; i++) {
        if (nameOfSchool.substring(i, i + 1).equals(" ")) {
        initials = initials + nameOfSchool.substring(i + 1, i + 2);
        }
      }
      initials = initials.toUpperCase();
      int drinks = Integer.parseInt(drinksOrderedInput);
      int candies =Integer.parseInt(candiesOrderedInput);
      int hotdogs =Integer.parseInt(hotdogsOrderedInput);
      int hamburgers =Integer.parseInt(hamburgersOrderedInput);
      subTotal = hotdogs*hotDogPrice+drinks*drinkPrice+candies*candyPrice+hamburgers*hamburgerPrice;
      double totalTax = subTotal*taxRate;
      double total = subTotal+totalTax;
      double value = ((int)(total * 100)/100.0);

     System.out.println("**************************************");
     System.out.println("*                                    *");
     System.out.println("*          " + initials + " Snack Bar             *");
     System.out.println("*                                    *");
     System.out.println("*     " +drinksOrderedInput + " " + itemList1 + "..........$" + drinkPrice +     "          *");                      
     System.out.println("*     " + candiesOrderedInput +" "+ itemList2 + "..........$" + candyPrice    +    "         *");     
     System.out.println("*     " + hotdogsOrderedInput + " "+ itemList3 + "..........$" + hotDogPrice +       "       *");     
     System.out.println("*     "+ hamburgersOrderedInput +" "+ itemList4 +"..........$" + hamburgerPrice +       "      *");     
     System.out.println("*     Order number: " + orderNumber +            "               *"); 
    System.out.println("*     Total Cost: $"   + value+                            "             *");   
     System.out.println("*                                    *");
     System.out.println("*                                    *");    
     System.out.println("**************************************");
   } 
}
