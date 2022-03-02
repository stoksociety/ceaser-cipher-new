public class DecodingCipher {


    public String decode(String inputString, int cipherKey) {
        String decodedCipher = "";

        for (int i = 0; i < inputString.length(); i++) {
            char singleChar = inputString.charAt(i);

            if (Character.isLetter(singleChar)) {


                if (Character.isLowerCase(singleChar)) {
                    char character = (char) (singleChar - cipherKey);

                    decodedCipher += character;


                } else if (Character.isUpperCase(singleChar)) {
                    char character = (char) (singleChar - cipherKey);

                    decodedCipher += character;
                }


            } else {
                decodedCipher += singleChar;
            }
        }


        return decodedCipher;


    }
}



