import java.util.*;

class CaesarCipher {
  public static StringBuffer encrypt(String text, int shift) {
    StringBuffer output = new StringBuffer();
    
    for (int i = 0; i < text.length(); i++) {
      // handle uppercase, 65 is A
      if (Character.isUpperCase(text.charAt(i))) {
        char c = (char) (((int)text.charAt(i) + shift - 65) % 26 + 65);
        output.append(c);
      }
      else {
        // lowercase, 97 is a
        char c = (char) (((int)text.charAt(i) + shift - 97) % 26 + 97);
        output.append(c);
      }
    }
    return output;
  }
  
  public static StringBuffer decrypt(String text, int shift) {
    StringBuffer output = new StringBuffer();
    
    for (int i = 0; i < text.length(); i++) {
      if (Character.isUpperCase(text.charAt(i))) {
        char c = (char) (((int)text.charAt(i) - shift - 65) % 26 + 65);
        output.append(c);
      } 
      else {
        char c = (char) (((int)text.charAt(i) - shift - 97) % 26 + 97);
        output.append(c);
      }
    }
    return output;
  }
  
  public static void main(String[] args) {
    System.out.print("Do you want to encode or decode? \n(Press 'e' for encode and 'd' for decode): ");
    Scanner console = new Scanner(System.in);
    char userChoice = console.next().charAt(0);
    
    if (userChoice == 'e') {
      System.out.print("Enter plaintext\t: ");
      Scanner encryptChoice = new Scanner(System.in);
      String text = encryptChoice.nextLine();
      
      System.out.print("Enter shift\t: ");
      Scanner consoleInt = new Scanner(System.in);
      int shift = consoleInt.nextInt();
      System.out.println("Ciphertext\t: " + encrypt(text, shift));
    }
    else if (userChoice == 'd') {
      System.out.print("Enter ciphertxt\t: ");
      Scanner decryptChoice = new Scanner(System.in);
      String text = decryptChoice.nextLine();

      System.out.print("Enter shift\t: ");
      Scanner consoleInt = new Scanner(System.in);
      int shift = consoleInt.nextInt();
      System.out.println("Plaintext\t: " + decrypt(text, shift));
    }
    else {
      System.out.print("You have entered an invalid input.\n");
    }
  }
}