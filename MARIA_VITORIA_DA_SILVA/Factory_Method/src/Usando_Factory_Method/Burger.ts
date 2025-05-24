import type { Food } from './Food'

export class Burger implements Food {
    prepare(){
        return 'Preparando um hambúrguer com carne e bacon.'
    }
}