package decoratorpattern;

public class EightGBMemory implements Specification {

     SmartPhone smartPhone;

     public EightGBMemory(SmartPhone smartPhone){
         this.smartPhone=smartPhone;
     }

    @Override
    public String getDesc() {
        return smartPhone.getDesc()+" with 8 gb ram";
    }
}
