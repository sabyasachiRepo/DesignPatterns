package decoratorpattern;

public class DragonTailGlass implements Specification {

     SmartPhone smartPhone;

     public DragonTailGlass(SmartPhone smartPhone){
         this.smartPhone=smartPhone;
     }

    @Override
    public String getDesc() {
        return smartPhone.getDesc()+" with dragon tail glass";
    }
}
