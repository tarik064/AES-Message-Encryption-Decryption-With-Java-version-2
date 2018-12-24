import java.util.Scanner; 
public class Test{
/**
 * @param args the command line arguments
 */
  public static void main(String[] args) throws Exception{
    Encryption en=new Encryption();
    
    System.out.println("Enter your Messege: ");
	Scanner scanner = new Scanner(System.in);
    String text = scanner.nextLine();
    System.out.println("Your Messege is " + text );
    String encryptedWord=en.encrypt(text); 
    System.out.println("Encrypted Message is : " + encryptedWord);
    Decription de =new Decription();
    System.out.println("Decrypted Message is : " +    de.decrypt(encryptedWord));
  }
}