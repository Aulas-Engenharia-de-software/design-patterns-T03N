using System;
using System.Collections.Generic;

public class Logger
{
    private static Logger _instance;
    private static readonly object _lock = new object();
    private List<string> _log;

    private Logger()
    {
        _log = new List<string>();
    }

    public static Logger Instance
    {
        get
        {
            if (_instance == null)
            {
                lock (_lock)
                {
                    if (_instance == null)
                        _instance = new Logger();
                }
            }
            return _instance;
        }
    }

    public void Log(string message)
    {
        _log.Add(message);
        Console.WriteLine($"LOG: {message}");
    }
}

class Program
{
    static void Main(string[] args)
    {
        var logger1 = Logger.Instance;
        var logger2 = Logger.Instance;

        logger1.Log("Mensagem 1");
        logger2.Log("Mensagem 2");

        Console.WriteLine(object.ReferenceEquals(logger1, logger2)); // True

        Console.ReadLine();
    }
}
