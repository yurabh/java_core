package learn_instanceof_arrays_desing_uml_second_example;

import java.time.LocalDate;

public class Operator extends Employee {
    private TaxiOrder[] taxiOrders;
    private int countOrder;
    private LocalDate dateOfOrder;
    private int workPlaceNumber;

    public Operator() {
        this.taxiOrders = null;
        this.countOrder = 0;
        this.dateOfOrder = LocalDate.now();
        this.workPlaceNumber = 6;
    }

    public Operator(String name, String surname, int id, double salary, LocalDate hireDate, String phoneNumber,
                    TaxiOrder[] taxiOrders, int countOrder, LocalDate dateOfOrder, int workPlaceNumber) {
        super(name, surname, id, salary, hireDate, phoneNumber);
        this.taxiOrders = taxiOrders;
        this.countOrder = countOrder;
        this.dateOfOrder = dateOfOrder;
        this.workPlaceNumber = workPlaceNumber;
    }

    public TaxiOrder[] getTaxiOrders() {
        return taxiOrders;
    }

    public int getCountOrder() {
        return countOrder;
    }

    public LocalDate getDateOfOrder() {
        return dateOfOrder;
    }

    public int getWorkPlaceNumber() {
        return workPlaceNumber;
    }

    public void setTaxiOrders(TaxiOrder[] taxiOrders) {
        this.taxiOrders = taxiOrders;
    }

    public void setCountOrder(int countOrder) {
        this.countOrder = countOrder;
    }

    public void setDateOfOrder(LocalDate dateOfOrder) {
        this.dateOfOrder = dateOfOrder;
    }

    public void setWorkPlaceNumber(int workPlaceNumber) {
        this.workPlaceNumber = workPlaceNumber;
    }
}
