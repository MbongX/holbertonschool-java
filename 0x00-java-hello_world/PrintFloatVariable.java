import java.math.BigDecimal;
import java.math.RoundingMode;

public class PrintFloatVariable{
  float pi = (float)3.141592;

  public static void main(String[] args){
    PrintFloatVariable fl = new PrintFloatVariable();
    BigDecimal value = new BigDecimal(Float.toString(fl.pi)).setScale(3, RoundingMode.DOWN);
  
    System.out.println("Pi Value: " + value);
  }
}
