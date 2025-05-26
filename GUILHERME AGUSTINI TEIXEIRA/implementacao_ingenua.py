class CreditCardPayment:
    def pay(self, amount):
        print(f"Paying {amount} using Credit Card.")

class BoletoPayment:
    def pay(self, amount):
        print(f"Paying {amount} using Boleto.")

class PixPayment:
    def pay(self, amount):
        print(f"Paying {amount} using Pix.")

# Cliente escolhe manualmente
method = input("Choose payment method (credit/boleto/pix): ")
amount = float(input("Enter amount: "))

if method == "credit":
    payment = CreditCardPayment()
elif method == "boleto":
    payment = BoletoPayment()
elif method == "pix":
    payment = PixPayment()
else:
    raise ValueError("Unknown payment method")

payment.pay(amount)
