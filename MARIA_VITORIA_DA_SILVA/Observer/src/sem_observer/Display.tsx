interface Props{
    nome: string;
    temperatura: number
    umidade: number
}

function Display({ nome, temperatura, umidade }: Props){
    return(
        <div className="bg-white rounded-xl shadow-lg p-6 border border-gray-200">
            <h3 className="text-xl font-semibold text-gray-800 mb-2">{nome}</h3>
            <p className="text-gray-700 font-medium">Temperatura: {temperatura.toFixed(1)}°C</p>
            <p className="text-gray-700 font-medium">Umidade: {umidade.toFixed(1)}%</p>
        </div>
    )
}
export default Display