// Target Interface
interface PaymentProcessor {
    void processPayment(double amount);
}

// Adaptee Classes (third-party gateways)
class PayPalGateway {
    public void makePayment(double money) {
        System.out.println("Processing PayPal payment of $" + money);
    }
}

class StripeGateway {
    public void pay(double cash) {
        System.out.println("Processing Stripe payment of $" + cash);
    }
}

// Adapter Class for PayPal
class PayPalAdapter implements PaymentProcessor {
    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway gateway) {
        this.payPalGateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        payPalGateway.makePayment(amount);
    }
}

// Adapter Class for Stripe
class StripeAdapter implements PaymentProcessor {
    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway gateway) {
        this.stripeGateway = gateway;
    }

    @Override
    public void processPayment(double amount) {
        stripeGateway.pay(amount);
    }
}

// Test Class
public class AdapterPatternExample {
    public static void main(String[] args) {

        PaymentProcessor paypalProcessor =
                new PayPalAdapter(new PayPalGateway());
        paypalProcessor.processPayment(100.0);

        PaymentProcessor stripeProcessor =
                new StripeAdapter(new StripeGateway());
        stripeProcessor.processPayment(250.0);
    }
}