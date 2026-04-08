public class Numbers0to99{

  public void NumberCounter(){
    for(int i = 0; i < 100; i++){
      if(i%10 != 0){
        System.out.printf(+i+", ");
      }
      else{
        System.out.print("\n"+i+", ");
      }
      if(i == 99){
        System.out.println("");
      }
    }
  }

  public static void main(String[] args){
    Numbers0to99 counter = new Numbers0to99();
    counter.NumberCounter();
  }
}
