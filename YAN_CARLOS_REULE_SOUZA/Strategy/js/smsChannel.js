// js/smsChannel.js
import ChannelStrategy from './channelStrategy.js';

export default class SmsChannel extends ChannelStrategy {
  async send(message, to) {
    console.log(`📲 (Fake SMS) Para: ${to}\n${message}`);
  }
}
