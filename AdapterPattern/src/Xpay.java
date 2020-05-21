public interface Xpay {
    public String getCreditCardNumber();
    public String getCustomerName();
    public String getCardExpiryMonth();

    public String getCardExpiryYear();

    public Short getCardCVVNumber();
    public Double getAmount();

    public void setCreditCardNumber(String creditCardNumber);
    public void setCustomerName(String customerName);
    public void setCardExpiryMonth(String cardExpiryMonth);
    public void setCardExpiryYear(String cardExpiryYear);
    public void setCardCVVNumber(short cardCVVNumber);
    public void setAmount(Double amount);
}
