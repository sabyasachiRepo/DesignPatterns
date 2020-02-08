package observerdesignpattern;

public class DataSeeker implements Observer {


     Observable observable;

     public DataSeeker(Observable observable){
         this.observable=observable;
         observable.register(this);
     }

    @Override
    public void update(Observable observable) {
        if(observable instanceof DataProvider){
            DataProvider dataProvider = (DataProvider) observable;
            System.out.println("The current news is: "+ dataProvider.getData());
        }
    }
}
