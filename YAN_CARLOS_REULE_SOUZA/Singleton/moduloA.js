const singleton = require('./loggerSingleton');
const loggerNormal = require('./loggerNormal');
const plainA = new loggerNormal();

module.exports = () => {
  singleton.log('Módulo A usando Singleton');
  plainA.log('Módulo A sem');
};
