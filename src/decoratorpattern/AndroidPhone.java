package decoratorpattern;

public class AndroidPhone implements SmartPhone {
    @Override
    public String getDesc() {
        return "This is an Android Smart Phone";
    }
}
