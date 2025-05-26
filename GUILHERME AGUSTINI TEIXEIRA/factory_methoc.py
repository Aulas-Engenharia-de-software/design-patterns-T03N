from abc import ABC, abstractmethod

# Produto
class Payment(ABC):
    @abstractmethod
    def pay(self, amount):
        pass

# Produtos concretos
class CreditCardPayment(Payment):
    def pay(self, amount):
        print(f"Paying {amount} using Credit Card.")

class BoletoPayment(Payment):
    def pay(self, amount):
        print(f"Paying {amount} using Boleto.")

class PixPayment(Payment):
    def pay(self, amount):
        print(f"Paying {amount} using Pix.")

# Fábricas
class PaymentFactory(ABC):
    @abstractmethod
    def create_payment(self) -> Payment:
        pass

class CreditCardFactory(PaymentFactory):
    def create_payment(self):
        return CreditCardPayment()

class BoletoFactory(PaymentFactory):
    def create_payment(self):
        return BoletoPayment()

class PixFactory(PaymentFactory):
    def create_payment(self):
        return PixPayment()

# Cliente
def get_factory(method: str) -> PaymentFactory:
    if method == "credit":
        return CreditCardFactory()
    elif method == "boleto":
        return BoletoFactory()
    elif method == "pix":
        return PixFactory()
    else:
        raise ValueError("Unknown payment method")

method = input("Choose payment method (credit/boleto/pix): ")
amount = float(input("Enter amount: "))

factory = get_factory(method)
payment = factory.create_payment()
payment.pay(amount)
