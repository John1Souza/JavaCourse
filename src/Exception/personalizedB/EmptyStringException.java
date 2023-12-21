package Exception.personalizedB;


public class EmptyStringException extends Exception{

    private String atrributeName;
    public EmptyStringException(String atrributeName){
        this.atrributeName = atrributeName;
    }

    public String getMessage(){
        return String.format("The attribute '%s' is empty", atrributeName);
    }
}
