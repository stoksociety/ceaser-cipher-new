
import java.util.Scanner;

public class App {


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);

        Ciph ciph = new Ciph();
        EncodingCipher encode = new EncodingCipher();
        DecodingCipher decode = new DecodingCipher();

        System.out.println(" ____________________________________________________________________________");
        System.out.println("|                                                                            |");
        System.out.println("|                                                                            |");
        System.out.println("+              HELLO THERE ( ͡° ͜ʖ ͡°).WELCOME TO CEASER CIPHER                 +");
        System.out.println("|                                                                            |");
        System.out.println("|_____________________________________________________ VERSION 1.0 __________|");
        System.out.println("|                                                                            |");
        System.out.println("|                           HOW TO PLAY:                                     |");
        System.out.println("*                            ---------                                       *");
        System.out.println("|                     1: Don't hit enter or the system will overrun itself.                          |");
        System.out.println("|                     2: Exit ( enter quit )                                 |");
        System.out.println("+                                                                            +");
        System.out.println("|                              RULES                                         |");
        System.out.println("|                              ------                                        |");
        System.out.println("*   i: VALID WORDS: [ Any word without a symbol/Character or punctuation ]   *");
        System.out.println("|  ii: VALID SHIFT FACTOR : [ Any number within Range ( 1 - 26 ) ]           |");
        System.out.println("|                                                                            |");
        System.out.println("|_______________________________ENJOY________________________________________|");
        System.out.println();


        System.out.println("what is to be encoded" +
                " my friend. ");

        ciph.setInputString(scanner.nextLine());


        System.out.println("Enter The Cipher Key or number " );
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
                System.out.println("input valid details" +
                        "BYE!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            }

        }
//ceaser-cipher

    }
}

