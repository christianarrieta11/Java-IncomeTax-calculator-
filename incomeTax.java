import java.util.Scanner;

class Incometax{

         public static void main(String args []){
         
         Scanner income = new Scanner (System.in);
         double  wife,husband,expensives,incomeTax;
         double kids = 2.00;
         
         
         System.out.println("hunsabnd income");
          husband = income.nextDouble();
          
          System.out.println("wife income");
          wife = income.nextDouble();
       
          
          System.out.println("Enter mout of kids you have");
          kids = income.nextDouble();
          
          incomeTax = husband + wife / kids;
          
          
          if(incomeTax > 50000){
           System.out.println("you pay" + incomeTax  );
            
            }  else{
            System.out.println("you get" + incomeTax);
            }
            
            


          
          
         
       

         


         
         }
   }