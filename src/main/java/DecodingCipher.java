
public class DecodingCipher {


    public String decode(String inputString, int cipherKey) {

        //Conv string to  array of characters

        int i;

        // is an index and should be a number.
        String decodedCipher = "";
        for (i = 0; i < inputString.length(); i++) {
            char singleChar = inputString.charAt(i);


            if (Character.isLetter(singleChar)) {


                if (Character.isLowerCase(singleChar)) {
                    char character = (char) (singleChar - cipherKey);

                    decodedCipher = decodedCipher + character;


                } else {
                    decodedCipher = decodedCipher + singleChar;
                }
            }


            return decodedCipher;


        }
        return decodedCipher;
    }
}