
#help(str.split)

cursos = "Java Python JavaScript Node Diseño"
lista_cursos = cursos.split()
print(f'Lista de cursos: {lista_cursos}')

cursos_separados_coma = "Java,Python,JavaScript,Node,Diseño"
lista_cursos_separados_coma = cursos_separados_coma.split(',', 2)
print(f'Lista de cursos separados por coma: {lista_cursos_separados_coma}')
print(len(lista_cursos_separados_coma))