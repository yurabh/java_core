package homeWork9;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Operator extends Employee {
    private ArrayList<TaxiOrder> taxiOrders;
    private int countOrder;
    private LocalDate dateOfOrder;
    private int workPlaceNumber;

    public Operator() {
        this.taxiOrders = new ArrayList<>();
        this.countOrder = 0;
        this.dateOfOrder = LocalDate.now();
        this.workPlaceNumber = 6;
    }

    public Operator(String name, String surname, int id, double salary, LocalDate hireDate, String phoneNumber,
                    ArrayList<TaxiOrder> taxiOrders, int countOrder, LocalDate dateOfOrder, int workPlaceNumber) {
        super(name, surname, id, salary, hireDate, phoneNumber);
        this.taxiOrders = new ArrayList<>(taxiOrders);
        this.countOrder = countOrder;
        this.dateOfOrder = dateOfOrder;
        this.workPlaceNumber = workPlaceNumber;
    }


    public ArrayList<TaxiOrder> getTaxiOrders() {
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

    public void setTaxiOrders(ArrayList<TaxiOrder> taxiOrders) {
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

    public void increaseSalary(int percent) {
        double tmpSalary = getSalary() + getSalary() * percent * 1.5;
        setSalary(tmpSalary);
    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Кількість замовлень рівна: " + countOrder);
        System.out.println("Дата замвлення: " + dateOfOrder);
        System.out.println("Номер робочого місця:" + workPlaceNumber);
        System.out.println();
    }

    @Override
    public String toString() {
        return super.toString() + "Operator{" + "taxiOrders=" + taxiOrders + ", countOrder=" + countOrder +
                ", dateOfOrder=" + dateOfOrder + ", workPlaceNumber=" + workPlaceNumber + '}';
    }

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Operator operator = (Operator) o;
        return countOrder == operator.countOrder &&
                workPlaceNumber == operator.workPlaceNumber &&
                Objects.equals(taxiOrders, operator.taxiOrders) &&
                Objects.equals(dateOfOrder, operator.dateOfOrder);
    }
    */

    public boolean equals(Object o) {
        // if(this  ==  o){return true;}
        Operator op = (Operator) o;
        // if(!super.equals(o)){return false;}
        if (this.taxiOrders == op.taxiOrders && this.countOrder == op.countOrder
                && this.workPlaceNumber == op.workPlaceNumber && this.dateOfOrder == op.dateOfOrder
                && this.getId() == op.getId() && this.getSalary() == op.getSalary() && this.getHireDate() == op.getHireDate()
                && this.getPhoneNumber() == op.getPhoneNumber() && this.getName() == op.getName() && this.getSurName() == op.getSurName()) {
            return true;
        }

        if (this.taxiOrders != op.taxiOrders || this.countOrder != op.countOrder || this.workPlaceNumber != op.workPlaceNumber
                || this.dateOfOrder != op.dateOfOrder || this.getId() != op.getId() || this.getSalary() != op.getSalary()
                || this.getHireDate() != op.getHireDate()) {
            return false;
        } else {
            return false;
        }
    }


    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), taxiOrders, countOrder, dateOfOrder, workPlaceNumber);
    }
}
