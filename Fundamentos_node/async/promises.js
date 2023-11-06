function hola(nombre) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log('Hola ' + nombre);
            resolve(nombre);
        }, 1000);
    });
}

function hablar(nombre) {
    return new Promise(function (resolve, reject) {
        setTimeout(function () {
            console.log('bla bla bla');
            resolve(nombre);
        }, 1000);
    });
}
function adios(nombre) {
    return new Promise(function (resolve, reject) {
    setTimeout( function() {
        console.log('Adios ' + nombre);
        reject('Hay un error');
    }, 1000);
    });
}
//Llamamos a la funcion 
console.log('Iniciando el proceso...');
hola('Ariel')
    .then(hablar)
    .then(hablar)
    .then(hablar)
    .then(adios)
    .then((nombre) => {
        console.log('Terminando el proceso');
    })

    .catch(function (error) {
        console.error('Ha habido un error:', error);
    });

    //Clase 10 completa NODE
    