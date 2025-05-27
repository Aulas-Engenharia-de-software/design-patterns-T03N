const runA = require('./moduloA');
const runB = require('./moduloB');

console.log('\n=== RODADA 1 ===');
runA();
runB();

console.log(require.cache[require.resolve('./loggerSingleton.js')].exports);

console.log('\n=== RODADA 2 ===');
runA();
runB();
