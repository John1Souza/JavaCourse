package Exception.personalizedB;


public class NumberOutOfRangeException extends Exception{

    private String atrributeName;
    public NumberOutOfRangeException(String atrributeName){
        this.atrributeName = atrributeName;
    }

    public String getMessage(){
        return String.format("The attribute '%s' is out of range", atrributeName);
    }
}
