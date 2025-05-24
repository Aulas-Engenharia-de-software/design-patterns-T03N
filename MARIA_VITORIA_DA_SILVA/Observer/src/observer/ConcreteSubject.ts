import type { Subject } from "./Suject";
import type { Observer, EstadoClima } from "./Observer";

export class ConcreteSubject implements Subject {
    private observers: Observer[] = []
    private estado: EstadoClima = { temperatura: 0, umidade: 0 }

    adicionarObservador(observer: Observer): void {
        this.observers.push(observer);
    }

    removerObservador(observer: Observer): void {
        this.observers = this.observers.filter(o => o !== observer )
    }

    notificarObservadores(): void {
        this.observers.forEach(observer => observer.atualizar(this.estado))
    }

    definirEstado(novoEstado: EstadoClima): void{
        this.estado = novoEstado;
        this.notificarObservadores()
    }
}