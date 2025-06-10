import { AcVeiculo } from "./ac-veiculo";

export class Carro extends AcVeiculo {
    kmPorHora: number = 90;
    declare(): void {
        console.log("Estou dirigindo um carro.");
    }
}

export class Moto extends AcVeiculo {
    kmPorHora: number = 110;
    declare(): void {
        console.log("Estou dirigindo uma moto.");
    }
}

export class Onibus extends AcVeiculo {
    kmPorHora: number = 60;
    declare(): void {
        console.log("Estou dirigindo um onibus.");
    }
}
