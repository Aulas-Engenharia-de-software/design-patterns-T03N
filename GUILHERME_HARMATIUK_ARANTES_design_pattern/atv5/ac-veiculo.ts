export abstract class AcVeiculo {
    abstract kmPorHora: number; 

    abstract declare(): void;
    
    dirigir(km: number): void {
        this.declare();
        const x = (km / this.kmPorHora).toFixed(2);
        console.log("Levei " + x + " horas para dirigir por " + km + "km.")
    }
}