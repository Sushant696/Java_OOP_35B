package week10;

public class Abstraction {
    public static void main(String[] args) {
        System.out.println("i`m in Abstraction class");
        Apple iphone15 = new Apple();
        iphone15.call("9387387437");
    }
}

// to amke abstract class keyworld abstract before c alss
// if you make abstaract calss cannot make object of it

abstract class SmartPhone {
    // abstract class may or may not contain abstrac functions
    // to make abstract function use abstract before making function

    // abstract calss do not have a body

    abstract void sms();

    abstract public boolean call(String number);
    // abstract calss cna have normal function

    void imei() {
        System.out.println("imei number");
    }
}

// abstract calss can only be use in sub/child class
class Samsung extends SmartPhone {
    // when extending bastract calss we have to implement overirde
    // all the abstract function of abstract class

    @Override
    void sms() {
        System.out.println("samsung way of sending sms");
    }

    @Override
    public boolean call(String number) {
        System.out.println("samsung calling to" + number);
        return true;
    }
}

class Apple extends SmartPhone {
    @Override
    void sms() {
        System.out.println("apple way of sending sms");
    }

    @Override
    public boolean call(String number) {
        System.out.println("Apple caling to " + number);
        return true;
    }
}