import math
from decimal import Decimal
# NaN (Not a Number)
a = float('nan')
print(f"El valor de a es: {a}")

# Modulo math
a = float('nan')
print(f"Es de tipo Nan(Not a Number): {math.isnan(a)}")


# Modulo decimal
a = Decimal("NaN")
print(f"Es de tipo Nan(Not a Number): {math.isnan(a)}")

