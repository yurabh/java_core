package learn_static_field_and_uml;

import java.time.LocalDate;

public class Payment {

    private int numberCard;
    private LocalDate paymentDate;
    private String paymentCurrency;
    private String country;

    public Payment(int numberCard, LocalDate paymentDate, String paymentCurrency, String country) {
        this.numberCard = numberCard;
        this.paymentDate = paymentDate;
        this.paymentCurrency = paymentCurrency;
        this.country = country;
    }

    public int getNumberCard() {
        return numberCard;
    }

    public void setNumberCard(int numberCard) {
        this.numberCard = numberCard;
    }

    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
