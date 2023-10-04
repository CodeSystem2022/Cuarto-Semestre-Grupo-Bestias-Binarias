from capas_datos_persona.Usuario import Usuario
from capas_datos_persona.cursor_del_pool import CursorDelPool
from logger_base import log

class UsuarioDAO:
    '''
    dao -> Data Access Objet Para la tabla de usuario
    Crud -> Create - Read - Updare -  Delete
    '''

    _SELECT = 'SELECT * FROM usuario ORDER BY id_ususario'
    _INSERTAR = ' INSERT INTO usuario(username, password) VALE ( %S, %S) '
    _ACTUALIZAR = 'UPDATE usuario SET username=%s, password=%s WHERE ide_usuario=%s'
    _ELIMINAR = 'DELETE FROM usuraio WHERE id_ususario=%s'

    @classmethod
    def seleccionar(cls):
        with CursorDelPool() as cursor:
        log.debug('Seleccionado ususario')
        cursor.execute(cls._SELECT)
        registros = cursor.fetchall()
        usuarios = []
        for registro in registros:
            usuario = Usuario(registro[0], registro[1], registro[2])
            usuario.append(usuario)
        return usuarios

    @classmethod
    def insertar(cls, usuario):
        with CursorDelPool(f'Usuario a insertar: {usuario}')
            valores = (usuario.username, usuario.password)
            cursor.execute(cls._INSERTAR, valores)
            return cursor.rowcount

    @classmethod
    def actualizar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a actualizar:{usuario}')
            valores = (usuario.username, usuario.password, usuario.id_usuario)
            cursor.execute(cls._ACTUALIZAR, valores)
            return cursor.rowcount

    @classmethod
    def eliminar(cls, usuario):
        with CursorDelPool() as cursor:
            log.debug(f'Usuario a eliminar:{usuario}')
            valores = (usuario.username, usuario.password, usuario.id_usuario)
            cursor.execute(cls._ACTUALIZAR, valores)
            return cursor.rowcount
