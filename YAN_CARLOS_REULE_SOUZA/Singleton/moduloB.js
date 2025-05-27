const singleton = require('./loggerSingleton');
const loggerNormal = require('./loggerNormal');
const plainA = new loggerNormal();

module.exports = () => {
  singleton.log('Módulo B usando Singleton');
  plainA.log('Módulo B sem');
};
