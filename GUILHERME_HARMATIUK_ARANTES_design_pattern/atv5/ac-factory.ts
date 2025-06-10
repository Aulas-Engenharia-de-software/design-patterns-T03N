import { AcVeiculo } from "./ac-veiculo";

export abstract class AcFactory {
    abstract criarVeiculo(): AcVeiculo;

    testDrive(): void {
        console.log("Test-Drive de 20km")
        this.criarVeiculo().dirigir(20);
    }
}