package decoratorpattern;

import observerdesignpattern.DataProvider;
import observerdesignpattern.DataSeeker;

import javax.swing.*;

public class TestClass {
    public static void main(String[] args) {
        SmartPhone smartPhone =new AndroidPhone();
        smartPhone=new EightGBMemory(smartPhone);
        smartPhone=new GorillaGlass(smartPhone);
        System.out.println(smartPhone.getDesc());

    }
}
