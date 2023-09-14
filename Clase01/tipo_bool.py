
# Bool contiene los valores de True y False
# Los tipos numericos, es false para el 0 y true para cualquier otro valor

valor = 0
resultado = bool(valor)
print(f"El valor : {valor}, Resultado: {resultado}")

valor = -1
resultado = bool(valor)
print(f"El valor : {valor}, Resultado: {resultado}")

# El tipo string, es false para el string vacio y true para cualquier otro valor

valor = ""
resultado = bool(valor)
print(f"El valor : {valor}, Resultado: {resultado}")

valor = "Hola"
resultado = bool(valor)
print(f"El valor : {valor}, Resultado: {resultado}")
