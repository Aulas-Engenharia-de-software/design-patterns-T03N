import { AcFactory } from './ac-factory';
import { AcVeiculo } from './ac-veiculo';
import { Carro, Moto, Onibus } from './concrete-classes';

export class CarroFactory extends AcFactory {
    criarVeiculo(): AcVeiculo {
        return new Carro();
    }
}
export class MotoFactory extends AcFactory {
    criarVeiculo(): AcVeiculo {
        return new Moto();
    }
}
export class OnibusFactory extends AcFactory {
    criarVeiculo(): AcVeiculo {
        return new Onibus();
    }
}