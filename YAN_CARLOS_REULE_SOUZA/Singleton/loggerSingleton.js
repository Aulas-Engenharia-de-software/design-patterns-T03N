class LoggerSingleton {
    constructor() {
      if (LoggerSingleton._instance) return LoggerSingleton._instance; // evita 2ª criação
      this.count = 0;
      LoggerSingleton._instance = this; // guarda referência global
    }
    log(msg) {
      this.count += 1;
      console.log(`[SINGLETON #${this.count}] ${msg}`);
    }
  }
  module.exports = new LoggerSingleton(); // exporta *instância*, não a classe
  