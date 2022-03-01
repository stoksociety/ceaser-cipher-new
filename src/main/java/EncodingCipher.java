

public class EncodingCipher {


    public String encode(String inputString, int cipherKey) {

        // conv string to  array of characters


        int i;

        String encodedCipher = "";
        for (i = 0; i < inputString.length(); i++) {
            // is an index and should be a number.

            char singleChar = inputString.charAt(i);

            //Check if the Character is a symbol or a letter
            if (Character.isLetter(singleChar)) {


                if (Character.isLowerCase(singleChar)) {
                    char character = (char) (singleChar + cipherKey);
                    encodedCipher = encodedCipher + character;


                } else {
                    encodedCipher = encodedCipher + singleChar;
                }
            }


            return encodedCipher;


        }


        return encodedCipher;
    }
}
