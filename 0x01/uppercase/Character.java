public class Character{
  // the function for checking if a character is Uppercase or not
  public static boolean IsUpper(char c){
    // I need to identify if a character is uppercase or not without using the .isLowerCase charcater function
    // so basically let me convert the character into it's ASCII value then logically evaulat if it fits in a specific range 
    // For uppercase(A-Z) character the ASCII range is from 65-90
    // For Lowercase character (a-z) character the ASCII range is from 97-122
    // For Digits(0-9) the ASCII range is from 48-57
    
    // Convert input from char to int
    final int asciiValue = (int) c;
    
    // Check if it's Uppercase:
    if(asciiValue >= 65 && asciiValue <= 90){
      // case: Uppercase
      // return true
      return true;
    }
    else if(asciiValue >= 97 && asciiValue <= 122){
      // case: Lowercase
      // return false
      return false;
    }
    else if(asciiValue >= 48 && asciiValue <= 57){
      // case: Digit
      // return false
      return false;
    }
    else{
      // if outside the validation criteria range - return false
      return false;
    }
  }
}
