import { useState } from "react"


function App() {
    const [type, setType] = useState('pizza')
    const [result, setResult] = useState('')

    const makeOrder = (type: string): string => {
        if (type === 'pizza') {
            return 'Preparando uma pizza com queijo e pepperoni.';
        } else if (type === 'burger') {
            return 'Preparando um hambúrguer com carne e bacon.';
        } else if (type === 'salad') {
            return 'Preparando uma salada com alface e tomate.';
        } else {
            return 'Tipo de comida desconhecido.';
        }
    }

    return (
        <div className="min-h-screen flex items-center justify-center bg-gray-100">
            <div className="bg-white shadow-2xl rounded-2xl p-8 w-full max-w-md text-center">
                <h1 className="text-2xl font-bold mb-6 text-gray-800">Pedido de Comida</h1>
                <select value={type} onChange={(e) => setType(e.target.value)} className="w-full mb-4 p-2 border border-gray-300 rounded-lg focus:outline-none focus:ring-2 focus:ring-blue-500">
                    <option value="pizza">Pizza</option>
                    <option value="burger">Hambúrguer</option>
                    <option value="salad">Salada</option>
                </select>
                <button onClick={() => setResult(makeOrder(type))} className="w-full bg-blue-600 text-white py-2 rounded-lg hover:bg-blue-700 transition">Fazer Pedido</button>
                {result && (
                    <div className="mt-6 p-4 bg-green-100 text-green-800 rounded-lg border border-green-300">
                        {result}
                    </div>
                )}
            </div>
        </div>
    )
}

export default App