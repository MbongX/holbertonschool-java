public class EvenNumbers{
 final int divisor = 2;
 public void printEvenNumbers(){
   int remainder;

   for(int i = 0; i < 100; i++){
     remainder = (i % divisor);
     if(remainder == 0 && i == 98){
       System.out.println(i);
     }
     
     if(remainder == 0 && i < 98){
       // print the even number || Should be seperated by a comma then space
       System.out.print(i + ", ");
     }
   }
 }

 public static void main(String[] args){
   EvenNumbers evenNumbers = new EvenNumbers();
   evenNumbers.printEvenNumbers();
 }

}
