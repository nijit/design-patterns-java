The **Strategy Design Pattern** is a behavioral design pattern that defines a family of algorithms, encapsulates each one, and makes them interchangeable. This allows the algorithm to vary independently from clients that use it. It's commonly used when you have multiple ways of performing a task, and you want to choose the behavior dynamically at runtime.

### Key Components of the Strategy Pattern
1. **Strategy Interface**: Defines a common interface for all supported algorithms.
2. **Concrete Strategy Classes**: Implements the different algorithms defined in the strategy interface.
3. **Context Class**: Maintains a reference to a `Strategy` object and allows the algorithm to be switched dynamically.

---

### Example: Payment Processing System

Let's implement the Strategy Design Pattern for a scenario where we want to process payments using different payment methods (Credit Card, PayPal, or UPI).

---

#### Step 1: Define the Strategy Interface
```java
public interface PaymentStrategy {
    void pay(int amount);
}
```

---

#### Step 2: Implement Concrete Strategy Classes
```java
// Credit Card Payment Strategy
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
}

// PayPal Payment Strategy
public class PayPalPayment implements PaymentStrategy {
    private String email;

    public PayPalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal account: " + email);
    }
}

// UPI Payment Strategy
public class UpiPayment implements PaymentStrategy {
    private String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI ID: " + upiId);
    }
}
```

---

#### Step 3: Create the Context Class
```java
public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    // Allow the strategy to be set dynamically
    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void payAmount(int amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment method selected.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
```

---

#### Step 4: Demonstrate Usage
```java
public class StrategyPatternExample {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234567812345678"));
        context.payAmount(1000);

        // Pay using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(1500);

        // Pay using UPI
        context.setPaymentStrategy(new UpiPayment("user@upi"));
        context.payAmount(500);
    }
}
```

---

### Output
```
Paid 1000 using Credit Card ending with 5678
Paid 1500 using PayPal account: user@example.com
Paid 500 using UPI ID: user@upi
```

---

### Benefits of the Strategy Pattern
1. **Flexibility**: You can easily add new strategies without changing the context or other strategies.
2. **Open/Closed Principle**: The code is open for extension but closed for modification.
3. **Code Reusability**: Encapsulation of algorithms promotes reusability.

### Use Cases
1. Payment processing systems.
2. Sorting algorithms where different strategies (e.g., Bubble Sort, Merge Sort) can be applied dynamically.
3. Validation frameworks to handle different types of input validations.

The Strategy Pattern is ideal for scenarios where behavior needs to be chosen dynamically at runtime!
