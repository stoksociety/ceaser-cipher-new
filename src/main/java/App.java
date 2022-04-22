
import java.util.Scanner;

public class App {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        Ciph ciph = new Ciph();
        EncodingCipher encode = new EncodingCipher();
        DecodingCipher decode = new DecodingCipher();


        System.out.println("what is to be encoded");

        ciph.setInputString(scanner.nextLine());


        System.out.println("Enter The Cipher Key or number ");
        ciph.setCipherKey(Integer.parseInt(scanner.nextLine()));



        String inputString = ciph.getInputString();

        int cipherKey = ciph.getCipherKey();



        if (inputString == "") {

            System.out.println("Enter valid details");

        } else {

            if (cipherKey > 0 && cipherKey < 26) {

                String encodedCipher;
                encodedCipher = encode.encode(inputString, cipherKey);

                String decodedCipher;
                decodedCipher = decode.decode(encodedCipher, cipherKey);


                System.out.println(inputString);
                System.out.println(encodedCipher);
                System.out.println(decodedCipher);


            } else {
                System.out.println("input valid details");
            }

        }
//ceaser-cipher

    }
}

