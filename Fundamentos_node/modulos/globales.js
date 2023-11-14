// this === global = true

// mostrar algo en consola
//console.log(); // es un módulo

// mostrar un mensaje en forma de error
//console.error();

// ejecutar un código despues de un intervalo de tiempo
//setTimeout(()=>{});

// ejecutar un código cada intervalo de tiempo
//setInterval(()=>{});

// da prioridad de ejecución a una función asíncrona
//setImmdiate();

//console.log(global);
//console.log(setInterval); // función


let i = 0;
let intervalo = setInterval(() => {
    console.log('Hola');
    if (i ===3) { 
    clearInterval(intervalo); //detenemos la funcion
    }
    i++;
}, 1000);

setImmediate(() => {
    console.log(`Saludo inmediato`);
});

//require();

console.log(__filename);
// variables globales
global.miVariable = `mi variable global`;
console.log(miVariable);
