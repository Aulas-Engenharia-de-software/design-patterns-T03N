import type { Food } from './Food'

export class Salad implements Food{
    prepare(){
        return 'Preparando uma salada com alface e tomate'
    }
}