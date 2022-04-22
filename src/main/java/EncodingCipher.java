public class EncodingCipher {


    String encode(String inputString, int cipherKey) {

        String encodedCipher = "";
//used for loops.
//created variable which checks the inputstring if it is a letter,and whether it is less than 0 if it is then i increases.
        for (int i = 0; i < inputString.length(); i++) {
  // created variable singlechar which checks inputstring whether it is a letter of variable i.
            char singleChar = inputString.charAt(i);
//used if statement to check whether character is letter which will check variable singlechar.
            if (Character.isLetter(singleChar)) {
 // checks whether variable Singlechar is a letter and sets it to lowercase.
                if (Character.isLowerCase(singleChar)) {

                    var character = (char) (singleChar + cipherKey);
                    encodedCipher += character;

                    // checks whether variable Singlechar is a letter and sets it to uppercase.
                } else if (Character.isUpperCase(singleChar)) {
  //created variable character which will take var singlechar and add it with cipherKey.
                    char character = (char) (singleChar + cipherKey);
// variable encoded cipher will be added to character which already is a key
                    encodedCipher += character;

                }

            } else {
 //variable encoded cipher will be added to variable singlechar which is an inputString
                encodedCipher += singleChar;
            }
        }

//the output will be InputString + cipher Key which will bring out to encode.
        return encodedCipher;
    }
}



