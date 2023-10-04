
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

# Tipo collection, es false para el collection vacio y true para cualquier otro valor

valor = []
resultado = bool(valor)
print(f"El valor de una lista vacia : {valor}, Resultado: {resultado}")

valor = [1, 2, 3]
resultado = bool(valor)
print(f"El valor de una lista : {valor}, Resultado: {resultado}")

#Tupla
valor = ()
resultado = bool(valor)
print(f"El valor de una tupla vacia : {valor}, Resultado: {resultado}")

valor = (1, 2, 3)
resultado = bool(valor)
print(f"El valor de una tupla con elementos: {valor}, Resultado: {resultado}")

# Diccionario
valor = {}
resultado = bool(valor)
print(f"El valor de un diccionario vacio : {valor}, Resultado: {resultado}")

valor = {"a": 1, "b": 2}
resultado = bool(valor)
print(f"El valor de un diccionario con elementos: {valor}, Resultado: {resultado}")

# Sentencias de control con bool
if (1,):
    print("Regresa verdadero")
else:
    print("Regresa falso")

#Ciclos
variable = 3
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
