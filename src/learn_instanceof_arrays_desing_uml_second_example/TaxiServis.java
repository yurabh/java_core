package learn_instanceof_arrays_desing_uml_second_example;

public class TaxiServis {

    private Driver[] drivers;

    private Operator[] operators;

    private int countDriver;

    private int countOperator;

    public TaxiServis() {
        this.drivers = null;
        this.operators = null;
        this.countDriver = 0;
        this.countOperator = 0;
    }

    public TaxiServis(Driver[] drivers, Operator[] operators, int countDriver, int countOperator) {
        this.drivers = drivers;
        this.operators = operators;
        this.countDriver = countDriver;
        this.countOperator = countOperator;
    }

    public Driver[] getDrivers() {
        return drivers;
    }

    public void setDrivers(Driver[] drivers) {
        this.drivers = drivers;
    }

    public Operator[] getOperators() {
        return operators;
    }

    public void setOperators(Operator[] operators) {
        this.operators = operators;
    }

    public int getCountDriver() {
        return countDriver;
    }

    public void setCountDriver(int countDriver) {
        this.countDriver = countDriver;
    }

    public int getCountOperator() {
        return countOperator;
    }

    public void setCountOperator(int countOperator) {
        this.countOperator = countOperator;
    }
}
