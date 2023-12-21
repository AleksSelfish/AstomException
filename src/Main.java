import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws MyException {


        //Exception
        //ex 1
        String string = null;
        try {
            string.toLowerCase();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }

        //ex 2
        int[] arrayNums = new int[1];
        try {
            for (int i = 0; i <= arrayNums.length; i++) {
                System.out.println(arrayNums[i]);
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        //ex 3
        try {
            MyException.myException();
        } catch (MyException ex) {
            ex.printStackTrace();
        }

        //ex 4
        try {
            for (int i = 0; i <= arrayNums.length; i++) {
                System.out.println(arrayNums[i]);
            }
        } catch (Exception ex) {
            try {
                MyException.myException();
            } catch (MyException e) {
                System.out.println(e.getMessage());;
            }
        }


        //ex 5
        randomException();


    }
    public static void randomException(){
        Random rnd = new Random();
        int rndNum = rnd.nextInt(3);
        switch (rndNum){
            case 0:
                try {
                    System.out.println(2/0);
                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            case 1:
                try {
                    int[] test = {1,3,4};
                    test[4] = 4;

                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
            case 2:
                try {
                    String s = null;
                    System.out.println(s.toLowerCase());

                }catch (Exception ex){
                    System.out.println(ex.getMessage());
                }
        }
    }
}
