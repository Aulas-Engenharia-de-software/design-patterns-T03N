using System;
using System.Collections.Generic;

public class Logger
{
    private List<string> _log;

    public Logger()
    {
        _log = new List<string>();
    }

    public void Log(string message)
    {
        _log.Add(message);
        Console.WriteLine($"LOG: {message}");
    }
}

class Program
{
    static void Main()
    {
        var logger1 = new Logger();
        var logger2 = new Logger();

        logger1.Log("Mensagem 1");
        logger2.Log("Mensagem 2");

        Console.WriteLine(object.ReferenceEquals(logger1, logger2)); // False → Instâncias diferentes

        Console.ReadLine();
    }
}

