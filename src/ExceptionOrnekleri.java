import java.io.IOException;
import java.util.ArrayList;

public class ExceptionOrnekleri {

    public static void main(String[] args) {

        ArrayList<Integer> a = null;
        a.clone();

        System.out.println(1.0 / 0);
        try {
            foo();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }

    public static void foo() throws IOException{
        int i = 5;
        if (i < 5)
            throw new IOException();
        else
            throw new MyException();
    }
}

class MyException extends  RuntimeException {

}
