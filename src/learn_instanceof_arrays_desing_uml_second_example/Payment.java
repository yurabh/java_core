package learn_instanceof_arrays_desing_uml_second_example;

import java.time.LocalDate;

public class Payment {
    private int cardNumber;
    private LocalDate paymentDate;

    public Payment() {
        this.cardNumber = 345678;
        this.paymentDate = LocalDate.now();
    }

    public Payment(int cardNumber, LocalDate paymentDate) {
        this.cardNumber = cardNumber;
        this.paymentDate = paymentDate;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }
}
