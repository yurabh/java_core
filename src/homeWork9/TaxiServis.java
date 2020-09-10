package homeWork9;

import java.util.ArrayList;

public class TaxiServis {
    private ArrayList<Driver> drivers;
    private ArrayList<Operator> operators;
    private int countDriver;
    private int countOperator;

    public TaxiServis() {
        this.drivers = new ArrayList<>();
        this.operators = new ArrayList<>();
        this.countDriver = 0;
        this.countOperator = 0;
    }

    public TaxiServis(ArrayList<Driver> drivers, ArrayList<Operator> operators, int countDriver, int countOperator) {
        this.drivers = new ArrayList<>(drivers);
        this.operators = new ArrayList<>(operators);
        this.countDriver = countDriver;
        this.countOperator = countOperator;
    }


    public ArrayList<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(ArrayList<Driver> drivers) {
        this.drivers = drivers;
    }

    public ArrayList<Operator> getOperators() {
        return operators;
    }

    public void setOperators(ArrayList<Operator> operators) {
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

    public void showInfo() {
        System.out.println("Drivers : " + drivers);
        System.out.println("Operators : " + operators);
        System.out.println("count drivers: " + countDriver);
        System.out.println("countoperatoriv" + countOperator);
    }
}
