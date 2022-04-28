public class EncodingCipher {
    String encode(String inputString, int cipherKey) {

        String encodedCipher = "";

        for (int i = 0; i < inputString.length(); i++) {

            char singleChar = inputString.charAt(i);

            if (Character.isLetter(singleChar)) {

                if (Character.isLowerCase(singleChar)) {

                    var character = (char) (singleChar + cipherKey);
                    encodedCipher += character;

                    // checks whether variable Singlechar is a letter and sets it to uppercase.

                } else if (Character.isUpperCase(singleChar)) {

                    char character = (char) (singleChar + cipherKey);
                    encodedCipher += character;

                }
            } else {
                encodedCipher += singleChar;
            }
        }

        return encodedCipher;
    }
}



