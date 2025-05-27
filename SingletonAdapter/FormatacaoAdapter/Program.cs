using System;


public interface ITexto
{
    string Exibir();
}

public class TextoSimples : ITexto
{
    private readonly string _texto;

    public TextoSimples(string texto)
    {
        _texto = texto;
    }

    public string Exibir()
    {
        return _texto;
    }
}

public abstract class TextoDecorator : ITexto
{
    protected ITexto _textoDecorado;

    protected TextoDecorator(ITexto texto)
    {
        _textoDecorado = texto;
    }

    public virtual string Exibir()
    {
        return _textoDecorado.Exibir();
    }
}

public class Negrito : TextoDecorator
{
    public Negrito(ITexto texto) : base(texto) { }

    public override string Exibir()
    {
        return $"<b>{base.Exibir()}</b>";
    }
}

public class Italico : TextoDecorator
{
    public Italico(ITexto texto) : base(texto) { }

    public override string Exibir()
    {
        return $"<i>{base.Exibir()}</i>";
    }
}

public class Sublinhado : TextoDecorator
{
    public Sublinhado(ITexto texto) : base(texto) { }

    public override string Exibir()
    {
        return $"<u>{base.Exibir()}</u>";
    }
}

class Program
{
    static void Main()
    {
        ITexto texto = new TextoSimples("Olá, mundo!");

        texto = new Negrito(texto);

        texto = new Italico(texto);

        texto = new Sublinhado(texto);

        Console.WriteLine(texto.Exibir());

        Console.ReadLine();
    }
}
