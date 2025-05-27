// js/notifier.js
export default class Notifier {
    constructor(channel) {
      this.channel = channel;
    }
    setChannel(channel) { this.channel = channel; }
    async notify(message, recipient) {
      return this.channel.send(message, recipient);
    }
  }
  