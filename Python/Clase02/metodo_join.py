


#help(str.join)

tupla_str = ('Hola', 'alumnos', 'Tecnicatura', 'Universitaria', 'en', 'Programacion')
mensaje = ' '.join(tupla_str)
print(f'El mensaje es: {mensaje}')

lista_cursos = ['Python', 'Java', 'C#', 'JavaScript', 'Spring']
mensaje = ', '.join(lista_cursos)
print(f'El mensaje es: {mensaje}')

cadena = 'Hola alumnos de Tecnicatura Universitaria en Programacion'
mensaje = '.'.join(cadena)
print(f'El mensaje es: {mensaje}')

diccionario = {'nombre': 'Juan', 'apellido': 'Perez', 'edad': "25"}
llaves = '-'.join(diccionario.keys())
valores = '-'.join(diccionario.values())
print(f'Las llaves son: {llaves}, Type: {type(llaves)}')
print(f'Los valores son: {valores}, Type: {type(valores)}')