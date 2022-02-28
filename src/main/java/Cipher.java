//This is where the getter and setter method starts
public class Cipher {
//these private modifier is accessible within the class that i declared.
    private String inputString;
    //string will be text

    private int cipherKey;
    //key will be a number

    public String getInputString() {
// i used get method to specified variable name.
        return inputString;
    }

    public void setInputString(String inputString) {

        this.inputString = inputString;
    }


    public int getCipherKey() {

        return cipherKey;
    }


    public void setCipherKey(int cipherKey) {

        this.cipherKey = cipherKey;
    }


}