import { useState } from "react"
import { ConcreteSubject } from "./ConcreteSubject"
import ConcreteObserver from "./ConcreteObserver"
import type { EstadoClima } from "./Observer"

function App() {
  const [estacao] = useState(new ConcreteSubject())

  const simularClima = () => {
    const novoEstado: EstadoClima = {
      temperatura: parseFloat((Math.random() * 35).toFixed(1)),
      umidade: parseFloat((Math.random() * 100).toFixed(1))
    }
    estacao.definirEstado(novoEstado)
  }

  return (
    <div className="min-h-screen bg-gradient-to-br from-blue-100 to-white p-6">
      <div className="max-w-4xl mx-auto text-center">
        <h1 className="text-4xl font-bold text-blue-800 mb-4">Padrão Observer com React + TypeScript</h1>
        <button onClick={simularClima} className="px-6 py-2 bg-blue-600 text-white rounded-lg shadow-md hover:bg-blue-700 transition">Simular Clima</button>
        <div className="mt-8 grid grid-cols-1 md:grid-cols-2 gap-6">
          <ConcreteObserver subject={estacao} nome="Display 1" />
          <ConcreteObserver subject={estacao} nome="Display 2" />
        </div>
      </div>
    </div>
  )
}

export default App
