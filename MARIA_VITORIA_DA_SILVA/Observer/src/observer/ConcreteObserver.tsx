import { useEffect, useState } from "react";
import type { Observer, EstadoClima } from "./Observer";
import type { Subject } from "./Suject";

interface Props{
    subject: Subject
    nome: string
}

function ConcreteObserver({subject, nome}: Props) {
    const [estado, setEstado] = useState<EstadoClima>({ temperatura: 0, umidade: 0})

    const obsever: Observer = {
        atualizar(novoEstado: EstadoClima){
            setEstado(novoEstado)
        }
    }

    useEffect(() => {
        subject.adicionarObservador(obsever)
        return () => {
            subject.removerObservador(obsever)
        }
    }, [subject])

    return(
        <div className="bg-white rounded-xl shadow-lg p-6 border border-gray-200">
            <h3 className="text-xl font-semibold text-gray-800 mb-2">{nome}</h3>
            <p className="text-gray-700 font-medium">Temperatura: {estado.temperatura.toFixed(1)}°C</p>
            <p className="text-gray-700 font-medium">Umidade: {estado.umidade.toFixed(1)}%</p>
        </div>
    )
}
export default ConcreteObserver