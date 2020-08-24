public interface Xpay {

    String getCreditCardNumber();
    String getCustomerName();
    String getCardExpiryMonth();

    String getCardExpiryYear();

    Short getCardCVVNumber();
    Double getAmount();

    void setCreditCardNumber(String creditCardNumber);
    void setCustomerName(String customerName);
    void setCardExpiryMonth(String cardExpiryMonth);
    void setCardExpiryYear(String cardExpiryYear);
    void setCardCVVNumber(short cardCVVNumber);
    void setAmount(Double amount);
}
