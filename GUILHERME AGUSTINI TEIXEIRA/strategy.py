from abc import ABC, abstractmethod

# Interface da estratégia
class FeeStrategy(ABC):
    @abstractmethod
    def calculate(self, amount: float) -> float:
        pass

# Estratégias concretas
class CreditCardFee(FeeStrategy):
    def calculate(self, amount):
        return amount * 0.03

class BoletoFee(FeeStrategy):
    def calculate(self, amount):
        return amount * 0.02

class PixFee(FeeStrategy):
    def calculate(self, amount):
        return 0

# Contexto
class PaymentProcessor:
    def __init__(self, strategy: FeeStrategy):
        self.strategy = strategy

    def process(self, amount: float):
        fee = self.strategy.calculate(amount)
        total = amount + fee
        print(f"Payment fee: {fee}")
        print(f"Total amount: {total}")

# Cliente escolhe a estratégia
def get_strategy(method: str) -> FeeStrategy:
    if method == "credit":
        return CreditCardFee()
    elif method == "boleto":
        return BoletoFee()
    elif method == "pix":
        return PixFee()
    else:
        raise ValueError("Unknown method")

method = input("Choose payment method (credit/boleto/pix): ")
amount = float(input("Enter amount: "))

strategy = get_strategy(method)
processor = PaymentProcessor(strategy)
processor.process(amount)
