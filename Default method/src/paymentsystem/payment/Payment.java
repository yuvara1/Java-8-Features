package paymentsystem.payment;

public interface Payment {
    boolean pay(double amount);

    /**
     * Default methods
     *
     */
    default boolean refund(double amount) {
        System.out.println("Refund is supported for this payment");
        return false;
    }
}
