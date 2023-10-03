console.log('Inicio del Programa');
setTimeout(()=>{
    console.log('Primer Timeout')
}, 3000);



setTimeout(()=>{
    console.log('Segundo Timeout')
}, 0);



setTimeout(()=>{
    console.log('Tercero Timeout')
}, 0);

console.log('Fin de Programa')
