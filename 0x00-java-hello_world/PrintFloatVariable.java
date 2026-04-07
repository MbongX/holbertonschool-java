import java.math.*;

public class PrintFloatVariable{
  public static void main(String[] args){
    float pi = (float) 3.141592; 
    BigDecimal value = new BigDecimal(Float.toString(pi)).setScale(3, RoundingMode.DOWN);
    System.out.println("Pi Value: " + value);
  }
}
