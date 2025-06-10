interface Botao {
    renderizar(): string;
}
abstract class BotaoFactory {
    abstract criarBotao(): Botao
}

class BotaoEspadaFactory extends BotaoFactory {
    criarBotao(): Botao {
        return new BotaoEspada();
    }
}
class BotaoEspada implements Botao {
    renderizar(): string {
        return `
            <Botao 
                icone="espada"
                click="atacar(range=1, damage=3)
            ></Botao>
        `;
    }
}

class BotaoMagiaFactory extends BotaoFactory {
    criarBotao(): Botao {
        return new BotaoMagia();
    }
}
class BotaoMagia implements Botao {
    renderizar(): string {
        return `
            <Botao
                icone="bola-de-fogo"
                click="atacar(range=2, damage=2)
            ></Botao>
        `;
    }
}

class BotaoArcoFactory extends BotaoFactory {
    criarBotao(): Botao {
        return new BotaoArco();
    }
}
class BotaoArco implements Botao {
    renderizar(): string {
        return `
            <Botao
                icone="arco-e-flecha"
                click="atacar(range=3, damage=1)
            ></Botao>
        `;
    }
}

console.log(new BotaoMagiaFactory().criarBotao().renderizar())