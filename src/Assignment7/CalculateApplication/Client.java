package Assignment7.CalculateApplication;

public class Client {

    public static void main(String[] args) {
        CalculateAppImpl daoImpl = new CalculateAppImpl();
        daoImpl.add(100,200);
        daoImpl.sub(500,200);
        daoImpl.mul(2,10);
    }
}
