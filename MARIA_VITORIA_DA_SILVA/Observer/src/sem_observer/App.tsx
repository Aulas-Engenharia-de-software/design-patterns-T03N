import { useState } from "react";
import Display from "./Display";

function App() {
  const [temperatura, setTemperatura] = useState(0);
  const [umidade, setUmidade] = useState(0);

  const simularClima = () => {
    const novaTemperatura = parseFloat((Math.random() * 35).toFixed(1));
    const novaUmidade = parseFloat((Math.random() * 100).toFixed(1));
    setTemperatura(novaTemperatura);
    setUmidade(novaUmidade);
  };

  return (
    <div className="min-h-screen bg-gradient-to-br from-blue-100 to-white p-6">
      <div className="max-w-4xl mx-auto text-center">
        <h1 className="text-4xl font-bold text-blue-800 mb-4">
          Estação Meteorológica (Implementação Ingênua)
        </h1>
        <button
          onClick={simularClima}
          className="px-6 py-2 bg-blue-600 text-white rounded-lg shadow-md hover:bg-blue-700 transition"
        >
          Simular Clima
        </button>
        <div className="mt-8 grid grid-cols-1 md:grid-cols-2 gap-6">
          <Display nome="Display 1" temperatura={temperatura} umidade={umidade} />
          <Display nome="Display 2" temperatura={temperatura} umidade={umidade} />
        </div>
      </div>
    </div>
  );
}

export default App;