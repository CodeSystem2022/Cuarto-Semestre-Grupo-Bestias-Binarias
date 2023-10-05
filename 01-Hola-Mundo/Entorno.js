let nombre = process.env.NOMBRE ||   'Sin nombre';
let web = process.env.MI_WEB || 'No tengo web';


console.log('Hola'+nombre);
console.log('Mi web es: '+web);

console.log('Ultima ejecucion');

//Importante, para instalar nodemon, se usa el comando :
//npm install -g nodemon
//Si nos tira error, se soluciona en powershield con los comandos
//Get-ExecutionPolicy -List
//Set-ExecutionPolicy RemoteSigned -Scope CurrentUser ​
// para instalar pm2 npm install pm2 -g
