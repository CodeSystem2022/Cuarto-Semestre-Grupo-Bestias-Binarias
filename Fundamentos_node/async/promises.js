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
function adios(nombre, otroCallback) {
    setTimeout( function() {
        console.log('Adios ' + nombre);
        otroCallback();
    }, 1500);
}
hola ('Ariel')
.then((nombre) =>{
    console.log('Terminando el proceso');
})
