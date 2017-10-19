import java.util.*;

class CaesarCipher {
  public static StringBuffer encrypt(String text, int shift) {
    StringBuffer result = new StringBuffer();
    
    return result;
  }
  
  public static void main(String[] args) {
    System.out.print("Enter plaintext\t: ");
    Scanner console = new Scanner(System.in);
    String text = console.nextLine();
    
    System.out.print("Enter shift\t: ");
    Scanner consoleInt = new Scanner(System.in);
    int shift = consoleInt.nextInt();
    
    System.out.println("Ciphertext\t: " + encrypt(text, shift));
  }
}