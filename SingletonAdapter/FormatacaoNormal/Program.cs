using System;

public class TextoSimples
{
    private string _texto;

    public TextoSimples(string texto)
    {
        _texto = texto;
    }

    public string Exibir()
    {
        return _texto;
    }

    public string AplicarNegrito()
    {
        return $"<b>{_texto}</b>";
    }

    public string AplicarItalico()
    {
        return $"<i>{_texto}</i>";
    }

    public string AplicarSublinhado()
    {
        return $"<u>{_texto}</u>";
    }

    public string AplicarEstilos(bool negrito, bool italico, bool sublinhado)
    {
        string resultado = _texto;

        if (negrito)
            resultado = $"<b>{resultado}</b>";
        if (italico)
            resultado = $"<i>{resultado}</i>";
        if (sublinhado)
            resultado = $"<u>{resultado}</u>";

        return resultado;
    }
}

class Program
{
    static void Main()
    {
        TextoSimples texto = new TextoSimples("Olá, mundo!");

        Console.WriteLine(texto.AplicarNegrito());
        Console.WriteLine(texto.AplicarItalico());
        Console.WriteLine(texto.AplicarSublinhado());

        string textoFormatado = texto.AplicarEstilos(negrito: true, italico: true, sublinhado: true);
        Console.WriteLine(textoFormatado); 

        Console.ReadLine();
    }
}
