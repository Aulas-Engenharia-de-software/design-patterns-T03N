import type { Observer } from "./Observer"

export interface Subject{
    adicionarObservador(observer: Observer): void
    removerObservador(observer: Observer): void
    notificarObservadores(): void
}