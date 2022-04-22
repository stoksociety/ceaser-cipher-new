public class DecodingCipher {
    String decode(String inputString, int cipherKey) {
        String decodedCipher = "";
        for (int i = 0; i < inputString.length(); i++) {
            char singleChar = inputString.charAt(i);

            //used if statement to check whether character is letter which will check variable singlechar.
              if (Character.isLetter(singleChar)) {

                  // checks whether variable Singlechar is a letter and sets it to lowercase.
                  if (Character.isLowerCase(singleChar)) {
                      //created variable character which will take var singlechar and add it with cipherKey.
                    char character = (char) (singleChar - cipherKey);
                      // variable encoded cipher will be added to character which already is a key
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



