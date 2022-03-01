//Encapsulation, is to make sure that "sensitive" data is hidden from users

//This is where the getter and setter method starts
public class Ciph{
//these private modifier is accessible within the class that i declared.
    private String inputString;
    //string will be text

    private int cipherKey;
    //key will be a number

    public String getInputString() {
// i used get method to the specified variable name.
        return inputString;
    }

    public void setInputString(String inputString) {

        this.inputString = inputString;
        // set method takes a parameter (inputString) and assigns it to the inputString variable
        
    }


    public int getCipherKey() {

        return cipherKey;
    }


    public void setCipherKey(int cipherKey) {

        this.cipherKey = cipherKey;
    }


}