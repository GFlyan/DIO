import { DioAccount } from "./DioAccount"; 

export class NewAccount extends DioAccount {
    constructor(name: string, accountNumber: number) {
        super(name, accountNumber)
    }

    public deposit = (value: number): void => {
        if(this.validateStatus()) {
            if(value > 0) {
                this.balance += value + 10
            } else {
                throw new Error("Valor Inválido!")
            }
        }
    }
}