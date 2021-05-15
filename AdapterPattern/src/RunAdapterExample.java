import implementations.XpayImplementation;
import implementations.XpayToPayDAdapter;
import interfaces.PayD;
import interfaces.Xpay;

public class RunAdapterExample {

    public static void main(String[] args) {

        Xpay xpay = new XpayImplementation();
        xpay.setCreditCardNumber("4789565874102365");
        xpay.setCustomerName("Muhammad Shoaib Murtaza");
        xpay.setCardExpiryMonth("07");
        xpay.setCardExpiryYear("2020");
        xpay.setCardCVVNumber((short) 235);
        xpay.setAmount(2565.23);

        PayD payD = new XpayToPayDAdapter(xpay);
        testPayD(payD);
    }

    private static void testPayD(PayD payD) {

        System.out.println("Credit Card Owner name = " + payD.getCardOwnerName());
        System.out.println("Customer card Number = " + payD.getCustomerCardNumber());
        System.out.println("Card Expiry Month date = " + payD.getCardExpMonthDate());
        System.out.println("CVV Number = " + payD.getCVVNumber());
        System.out.println("Total Amount = " + payD.getTotalAmount());
    }
}
