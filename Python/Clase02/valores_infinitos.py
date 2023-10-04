import math
from decimal import Decimal

# manejo de valores infinitos
infinito_positivo = float("inf")
print(f"El valor infinito positivo es: {infinito_positivo}")
print(f"El valor infinito es positivo?: {math.isinf(infinito_positivo)}")

infinito_negativo = float("-inf")
print(f"El valor infinito negativo es: {infinito_negativo}")
print(f"El valor infinito es negativo?: {math.isinf(infinito_negativo)}")

# Modulo math
infinito_positivo = math.inf
print(f"El valor infinito positivo es: {infinito_positivo}")
print(f"El valor infinito es positivo?: {math.isinf(infinito_positivo)}")

infinito_negativo = -math.inf
print(f"El valor infinito negativo es: {infinito_negativo}")
print(f"El valor infinito es negativo?: {math.isinf(infinito_negativo)}")

# Modulo decimal
infinito_positivo = Decimal("Infinity")
print(f"El valor infinito positivo es: {infinito_positivo}")
print(f"El valor infinito es positivo?: {math.isinf(infinito_positivo)}")

infinito_negativo = Decimal("-Infinity")
print(f"El valor infinito negativo es: {infinito_negativo}")
print(f"El valor infinito es negativo?: {math.isinf(infinito_negativo)}")