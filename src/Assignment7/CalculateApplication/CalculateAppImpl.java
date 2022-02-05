package Assignment7.CalculateApplication;

public class CalculateAppImpl implements CalculateApp {
    @Override
    public void add(int x, int y) {
        int addition = x+ y;
        System.out.println("The addition of two number is: " + addition );
    }

    @Override
    public void sub(int x, int y) {
        int subtraction = x - y;
        System.out.println("The subtraction of two number is: " + subtraction );

    }

    @Override
    public void mul(int x, int y) {
        int multiplication = x * y;
        System.out.println("The multiplication of two number is: " + multiplication );

    }
}
