const fs = require('fs');

function leer (ruta, cb){
    fs.readFile(ruta, (err, data) =>{
        console.log(data);
    })
}

leer('${__dirname}/archivo.txt', console.log); //Sintaxis ES6

//Segundo escribios el archivo1.txt creandolo
function escribir(ruta, contenido, cb){
    fs.writeFile(ruta, contenido, function(err){
        
if (err) {
    console.log('No se ha podido escribir', err);
} else{
    console.log('Se ha escrito correctamente');
}
    })
}
//Tercero eliminamos el archivo1.txt
function borrar(ruta, cb){
    fs.unlink(ruta,cb); //Elimina de manera asincrona
}

borrar('${_dirname}/archivo1.txt',console.log);
//escribir('${_dirname}/archivo1.txt', 'Soy un nuevo archivo', console.log);
//leer('${_dirname}/archivo1.txt', console.log);