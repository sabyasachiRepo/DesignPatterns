package decoratorpattern;

public class SixteenGBMemory implements Specification {

     SmartPhone smartPhone;

     public SixteenGBMemory(SmartPhone smartPhone){
         this.smartPhone=smartPhone;
     }

    @Override
    public String getDesc() {
        return smartPhone.getDesc()+" with 16 gb ram";
    }
}
