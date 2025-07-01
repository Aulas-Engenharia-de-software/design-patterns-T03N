// js/emailChannel.js
import ChannelStrategy from './channelStrategy.js';

export default class EmailChannel extends ChannelStrategy {
  async send(message, to) {
    console.log(`📧 (Fake e-mail) Para: ${to}\n${message}`);
  }
}
