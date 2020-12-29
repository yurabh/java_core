package learn_instanceOf_arrays_desing_uml_second_example;

public class Office {

    private String addressOffice;
    private Operator[] operators;
    private int countOperator;


    public Office(String addressOffice) {
        this.addressOffice = "Trulovskoho";
        this.operators = null;
        this.countOperator = 0;
    }

    public Office(String addressOffice, Operator[] operators, int countOperator) {
        this.addressOffice = addressOffice;
        this.operators = operators;
        this.countOperator = countOperator;
    }

    public String getAddressOffice() {
        return addressOffice;
    }

    public void setAddressOffice(String addressOffice) {
        this.addressOffice = addressOffice;
    }

    public Operator[] getOperators() {
        return operators;
    }

    public void setOperators(Operator[] operators) {
        this.operators = operators;
    }

    public int getCountOperator() {
        return countOperator;
    }

    public void setCountOperator(int countOperator) {
        this.countOperator = countOperator;
    }
}
