public class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
    public static String myException() throws MyException{
        throw new MyException("Error,try again");
    }


}

