function hola(nombre) {
    return new Promise(function(resolve, reject) {
        setTimeout(function() {
            console.log("Hola " +nombre);
            resolve(nombre);
        }, 1000);
    });
}

function hablar(nombre) {
    return new Promise((resolve, reject) => {
        setTimeout(function() {
            console.log("Bla bla bla bla...");
            resolve(nombre);
        }, 1000);
    });
}

function adios(nombre) {
    return new Promise((resolve, reject) => {
        setTimeout(function() {
            console.log("Adios " +nombre);
            //resolve();
            reject("Hay un error");
        }, 1000);
    });
}

// Llama a la funcion hola
console.log("Iniciando proceso...");
hola("Daniel")
    .then(hablar)
    .then(hablar)
    .then(hablar)
    .then(adios)
    .then((nombre) => {
        console.log("Terminando proceso...");
    })
.catch(error => {
        console.log("Ha habido un error: ");
        console.log(error);

    })
   
