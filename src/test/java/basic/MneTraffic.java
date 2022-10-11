package basic;

public class MneTraffic implements CentralTraffic,EuropeTraffic{

    @Override
    public void redLight() {
        System.out.println("Stop");
    }

    @Override
    public void yellowLight() {
        System.out.println("Wait");
    }

    @Override
    public void greenLight() {
        System.out.println("Go");
    }

    @Override
    public void trainSymbol() {
        System.out.println("Train is coming");
    }

    @Override
    public void exclamationSymbol() {
        System.out.println("Alert symbol");
    }

    public static void main(String[] args) {
    CentralTraffic ct = new MneTraffic();
    ct.redLight();
    ct.greenLight();
    ct.redLight();
    EuropeTraffic et = new MneTraffic();
    et.trainSymbol();
    et.exclamationSymbol();
    System.out.println("Max speed is " + MAX_SPEED);
    }
}
