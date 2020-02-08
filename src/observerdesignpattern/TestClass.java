package observerdesignpattern;

public class TestClass {
    public static void main(String[] args) {
        DataProvider dataProvider =new DataProvider();
        DataSeeker dataSeeker =new DataSeeker(dataProvider);
        dataProvider.setNewData("Strike in India");

    }
}
