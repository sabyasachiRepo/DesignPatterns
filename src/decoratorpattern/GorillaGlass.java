package decoratorpattern;

public class GorillaGlass implements Specification {

     SmartPhone smartPhone;

     public GorillaGlass(SmartPhone smartPhone){
         this.smartPhone=smartPhone;
     }

    @Override
    public String getDesc() {
        return smartPhone.getDesc()+" with gorilla glass";
    }
}
