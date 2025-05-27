"use strict";
// SINGLETON DE MODO RUIM //
// cria uma classe chamada contadorDeCliques
class ContadorDeCliques {
    // declara uma variavel privada do tipo number iniciando em 0
    contador = 0;
    // cria um metodo de acrescentar no contador
    acrescentar() {
        // pega a variavel declarada dentro da classe e adiciona mais 1
        this.contador++;
    }
    // cria um metodo de retornar a variavel contador
    getContador() {
        return this.contador;
    }
}
// cria uma variavel e instancia a classe atraves do new contadorDeCliques();
const contadorUm = new ContadorDeCliques();
// chama a variavel contadorUm com o metodo acrescentar
contadorUm.acrescentar();
contadorUm.acrescentar();
// mostra no console a quantidade de vezes que foi chamado o metodo acrescentar ja que ele adiciona 1 a mais no contador
console.log(contadorUm.getContador()); // 2
// cria novamente uma variavel e instancia a classe atraves do new contadorDeCliques();
const contadorDois = new ContadorDeCliques();
// chama apenas uma vez o metodo acrescentar
contadorDois.acrescentar();
// mostra novamente no console a quantidade de vezes quue foi chamado o metodo acrescentar
console.log(contadorDois.getContador()); // 1
// SINGLETON DE MODO BOM //
// cria uma funcao com o nome de contadorDeClickSingleton
class ContadorDeClickSingleton {
    // cria uma variavel instancia que eh do tipo contadorDeClickSingleton
    static instancia;
    // cria uma variavel do tipo number que comeca com 0
    contador = 0;
    // construtor vazio
    constructor() { }
    // cria um metodo do tipo contadorDeClickSingleton
    static getInstancia() {
        // se nao existir uma instancia do contadorDeClickSingleton
        if (!ContadorDeClickSingleton.instancia) {
            // entao o contadorDeClickSingleton.instancia recebe uma nova instancia do contadorDeClickSingleton
            ContadorDeClickSingleton.instancia = new ContadorDeClickSingleton();
        }
        // retorna essa instancia do contadorDeClickSingleton
        return ContadorDeClickSingleton.instancia;
    }
    // metodo que acrescenta no contador
    acrescentar() {
        this.contador++;
    }
    // metodo que mostra o contador
    getContador() {
        return this.contador;
    }
}
// cria uma variavel que recebe o metodo getInstancia do contadorDeClickSingleton
const contadorTres = ContadorDeClickSingleton.getInstancia();
// contadorTres chama o metodo acrescentar duas vezes
contadorTres.acrescentar();
contadorTres.acrescentar();
// mostra no console a quantidade de vezes que foi chamado o metodo acrescentar ja que ele adiciona 1 a mais no contador
console.log(contadorTres.getContador()); // 2
// cria novamenter uma variavel que recebe o metodo getInstancia do contadorDeClickSingleton
const contadorQuatro = ContadorDeClickSingleton.getInstancia();
// contadorTres chama o metodo acrescentar duas vezes
contadorQuatro.acrescentar();
// mostra novamente no console a quantidade de vezes que foi chamado o metodo acrescentar
console.log(contadorQuatro.getContador()); // 3
