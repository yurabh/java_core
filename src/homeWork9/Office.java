package homeWork9;

import java.util.ArrayList;

public class Office {
    private String addressOffice;
    private ArrayList<Operator> operators;
    private int countOperator;


    public Office() {
        this.addressOffice = "Trulovskoho";
        this.operators = new ArrayList<>();
        this.countOperator = 0;
    }

    public Office(String addressOffice, ArrayList<Operator> operators, int countOperator) {
        this.addressOffice = addressOffice;
        this.operators = new ArrayList<>(operators);
        this.countOperator = countOperator;
    }

    public String getAddressOffice() {
        return addressOffice;
    }

    public void setAddressOffice(String addressOffice) {
        this.addressOffice = addressOffice;
    }

    public ArrayList<Operator> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<Operator> operators) {
        this.operators = operators;
    }

    public int getCountOperator() {
        return countOperator;
    }

    public void setCountOperator(int countOperator) {
        this.countOperator = countOperator;
    }

    public void showInfo() {
        System.out.println("Адрес Офіса: " + addressOffice);
        System.out.println("Operator : " + operators);
        System.out.println("Кількість операторів у офісі: " + countOperator);
    }
}
