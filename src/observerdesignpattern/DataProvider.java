package observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class DataProvider implements Observable {

    List<Observer> observerList;

    public String getData() {
        return data;
    }

    public void setNewData(String data) {
        this.data = data;
        notifyObservers();
    }

    String data;

    public DataProvider() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int index = observerList.indexOf(observer);
        if (index >= 0) {
            observerList.remove(index);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }

    }

}
