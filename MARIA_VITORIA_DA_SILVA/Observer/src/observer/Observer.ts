export interface EstadoClima{
    temperatura: number
    umidade: number
}

export interface Observer{
    atualizar(estado: EstadoClima): void
}