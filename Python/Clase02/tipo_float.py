# Profundizando en el tipo de dato float
a = 3.0
print(f"El valor de a es: {a:.2f}")

# Constructor de tipo float -> puede recibir un valor entero o un valor de tipo string
a = float(10) # Ke pasamos un tipo entero
a = float("10") # Le pasamos un tipo string
print(f"El valor de a es: {a:.2f}")

# Notación exponencial (Valores positivos o negativos)
a = 3e5 #
print(f"El valor de a es: {a:.2f}")

a = 3e-5
print(f"El valor de a es: {a:.5f}")

# Cualquier calculo que involucre un valor float, el resultado será float

a = 4.0 + 5
print(f"El valor de a es: {a}")
print(type(a))