class loggerNormal {
    constructor() { this.count = 0; }
    log(msg) {
      this.count += 1;
      console.log(`[PLAIN #${this.count}] ${msg}`);
    }
  }
  module.exports = loggerNormal;
  