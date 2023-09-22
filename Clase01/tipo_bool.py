
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


#MCDavid
# Tipo colecciones -> False para colecciones vacias
# Tipo colecciones -> True para las demas
valor =[]
resultado = bool(valor)
print(f'valor de una lista vacia: {valor}, Resultado: {resultado}')

valor = [2, 3, 4]
resultado = bool(valor)
print(f'valor de una lista con elementos: {valor}, Resultado: {resultado}')

#Tupla
valor = ()
resultado = bool(valor)
print(f'valor de un tupla vacia: {valor}, Resultado: {resultado}')

valor = (5, )
resultado = bool(valor)
print(f'valor de una tupla con elementos: {valor}, Resultado: {resultado}')

#Diccionario
valor = {}
resultado = bool(valor)
print(f'valor de un diccionario vacio: {valor}, Resultado: {resultado}')

valor = {'Nombre': 'Juan', 'Apellido': 'Perez'}
resultado = bool(valor)
print(f'valor de un diccionario con elementos: {valor}, Resultado: {resultado}')

# Sentencia de control con booleano
if (1,):
    print('Regresa verdadero')
else:
    print('Regresa falso')

#  uso de  Ciclos
variable = 17
while variable:
    print('Regresa verdadero')
    break
else:
    print('Regresa falso')
