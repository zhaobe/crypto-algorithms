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