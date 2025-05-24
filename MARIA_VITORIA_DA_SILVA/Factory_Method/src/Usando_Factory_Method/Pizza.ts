import type { Food } from './Food'

export class Pizza implements Food {
    prepare(){
        return 'preparando uma pizza com queijo e pepperoni'
    }
}
