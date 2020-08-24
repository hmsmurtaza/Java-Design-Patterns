public class XpayToPayDAdapter implements PayD {

    private String customerCardNumber;
    private String cardOwnerName;
    private String cardExpireMonthDate;
    private Integer cVVNumber;
    private Double totalAmount;

    private final Xpay xpay;

    public XpayToPayDAdapter(Xpay xpay) {
        this.xpay = xpay;
        setProperty();
    }

    private void setProperty() {
        setCardOwnerName(this.xpay.getCustomerName());
        setCustomerCardNumber(this.xpay.getCreditCardNumber());
        setCardExpMonthDate(this.xpay.getCardExpiryMonth() + "/" + this.xpay.
                getCardExpiryYear());
        setCVVNumber(this.xpay.getCardCVVNumber().intValue());
        setTotalAmount(this.xpay.getAmount());
    }

    @Override
    public String getCustomerCardNumber() {
        return customerCardNumber;
    }

    @Override
    public String getCardOwnerName() {
        return cardOwnerName;
    }

    @Override
    public String getCardExpMonthDate() {
        return cardExpireMonthDate;
    }

    @Override
    public Integer getCVVNumber() {
        return cVVNumber;
    }

    @Override
    public Double getTotalAmount() {
        return totalAmount;
    }

    @Override
    public void setCustomerCardNumber(String customerCardNumber) {
        this.customerCardNumber = customerCardNumber;
    }

    @Override
    public void setCardOwnerName(String cardOwnerName) {
        this.cardOwnerName = cardOwnerName;
    }

    @Override
    public void setCardExpMonthDate(String cardExpMonthDate) {
        this.cardExpireMonthDate = cardExpMonthDate;
    }

    @Override
    public void setCVVNumber(Integer cvvNumber) {
        this.cVVNumber = cvvNumber;
    }

    @Override
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
