import type { Food } from './Food'
import { Pizza } from './Pizza'
import { Burger } from './Burger'
import { Salad } from './Salad'

export abstract class FoodFactory{
    abstract createFood(): Food
}

export class PizzaFactory extends FoodFactory{
    createFood(): Food {
        return new Pizza();
    }
}

export class BurgerFactory extends FoodFactory{
    createFood(): Food {
        return new Burger()
    }
}

export class SaladFactory extends FoodFactory{
    createFood(): Food {
        return new Salad()
    }
}