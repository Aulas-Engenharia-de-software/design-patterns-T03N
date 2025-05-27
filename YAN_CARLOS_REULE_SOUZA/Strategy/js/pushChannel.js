// js/pushChannel.js
import ChannelStrategy from './channelStrategy.js';

export default class PushChannel extends ChannelStrategy {
  async send(message) {
    if (Notification.permission !== 'granted') {
      await Notification.requestPermission();
    }
    if (Notification.permission === 'granted') {
      new Notification('🔔 Notificação', { body: message });
    } else {
      console.warn('Permissão de push negada; simulando no console');
      console.log('🔔', message);
    }
  }
}
