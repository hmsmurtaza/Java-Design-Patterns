package implementations;

import interfaces.Xpay;

public class XpayImplementation implements Xpay {

    private String creditCardNumber;
    private String customerName;
    private String cardExpiryMonth;
    private String cardExpiryYear;
    private short cardCVVNumber;
    private Double amount;

    @Override
    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String getCardExpiryMonth() {
        return cardExpiryMonth;
    }

    @Override
    public String getCardExpiryYear() {
        return cardExpiryYear;
    }

    @Override
    public Short getCardCVVNumber() {
        return cardCVVNumber;
    }

    @Override
    public Double getAmount() {
        return amount;
    }

    @Override
    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void setCardExpiryMonth(String cardExpiryMonth) {
        this.cardExpiryMonth = cardExpiryMonth;
    }

    @Override
    public void setCardExpiryYear(String cardExpiryYear) {
        this.cardExpiryYear = cardExpiryYear;
    }

    @Override
    public void setCardCVVNumber(short cardCVVNumber) {
        this.cardCVVNumber = cardCVVNumber;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
