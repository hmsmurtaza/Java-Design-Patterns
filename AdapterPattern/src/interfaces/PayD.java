package interfaces;

public interface PayD {

    String getCustomerCardNumber();
    String getCardOwnerName();
    String getCardExpMonthDate();
    Integer getCVVNumber();
    Double getTotalAmount();

    void setCustomerCardNumber(String customerCardNumber);
    void setCardOwnerName(String cardOwnerName);
    void setCardExpMonthDate(String cardExpMonthDate);
    void setCVVNumber(Integer cvvNumber);
    void setTotalAmount(Double totalAmount);
}
