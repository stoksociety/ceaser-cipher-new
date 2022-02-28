
import java.util.Scanner;

public class CaesarCipher {


    public static void main(String[] args) {

        //Instantiating the relevant object classes;

        Scanner scanner = new Scanner(System.in);

        Cipher cipher = new Cipher();
        EncodingCipher encode = new EncodingCipher();
        DecodingCipher decode = new DecodingCipher();

        //Getting the Input String from the user
        System.out.println("please enter The Text To Be Encoded");

        cipher.setInputString(scanner.nextLine());

        //Getting the cipher Key from the User
        System.out.println("Enter The Cipher Key or number (not less than 0 and not more than 26)");
        cipher.setCipherKey(Integer.parseInt(scanner.nextLine()));


        //getting variable data through getter methods;
        String inputString = cipher.getInputString();

        int cipherKey = cipher.getCipherKey();


        //Checking if the User Inputs the correct data
        if (inputString == "") {

            System.out.println("Enter valid details");

        } else {

            if (cipherKey > 0 && cipherKey < 26) {

                String encodedCipher = encode.encode(inputString, cipherKey);
                String decodedCipher = decode.decode(encodedCipher, cipherKey);


                //Printing the encoded and decoded cipher
                System.out.println(inputString);
                System.out.println(encodedCipher);
                System.out.println(decodedCipher);


            } else {
                System.out.println("Enter the Correct details");
            }

        }


    }
}