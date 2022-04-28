public class DecodingCipher {

    String decode(String inputString, int cipherKey) {

        String decodedCipher = "";

        for (int i = 0; i < inputString.length(); i++) {

            char singleChar = inputString.charAt(i);

            //used if statement to check whether character is letter which will check variable singlechar.
              if (Character.isLetter(singleChar)) {

                  if (Character.isLowerCase(singleChar)) {

                    char character = (char) (singleChar - cipherKey);

                    decodedCipher += character;
                  }
                else if (Character.isUpperCase(singleChar)) {
                    char character = (char) (singleChar - cipherKey);
                    decodedCipher = decodedCipher + character;
                }
              }
            else {
                decodedCipher += singleChar;
            }
        }
        //the output will be InputString + cipher Key which will bring out to decode.
        return decodedCipher;
    }
}



