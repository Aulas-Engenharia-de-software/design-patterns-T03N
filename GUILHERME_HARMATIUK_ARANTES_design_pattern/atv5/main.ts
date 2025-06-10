import { Carro } from "./concrete-classes";
import { CarroFactory, MotoFactory } from "./concrete-factories";

const carFactory = new CarroFactory();
const car: Carro = carFactory.criarVeiculo();

const motoFactory = new MotoFactory();
motoFactory.testDrive();

console.log("\n")

car.dirigir(120);

car.dirigir(180);