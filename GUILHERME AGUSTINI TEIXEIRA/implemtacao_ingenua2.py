def calculate_fee(method, amount):
    if method == "credit":
        return amount * 0.03
    elif method == "boleto":
        return amount * 0.02
    elif method == "pix":
        return 0
    else:
        raise ValueError("Unknown method")

method = input("Choose payment method (credit/boleto/pix): ")
amount = float(input("Enter amount: "))

fee = calculate_fee(method, amount)
print(f"Payment fee: {fee}")
print(f"Total: {amount + fee}")
