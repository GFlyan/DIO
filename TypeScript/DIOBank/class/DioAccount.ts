export abstract class DioAccount {
  private readonly name: string
  private readonly accountNumber: number
  protected balance: number = 0
  private status: boolean = true

  constructor(name: string, accountNumber: number){
    this.name = name
    this.accountNumber = accountNumber
  }

  public getName = (): string => {
    return this.name
  }

  public getAccountNumber = (): number => {
    return this.accountNumber
  }

  public getBalance = (): number => {
    return this.balance
  }

  public setStatus = (value: boolean): void => {
    this.status = value
  }

  protected validateStatus = (): boolean => {
    if (this.status) {
      return this.status
    }

    throw new Error('Conta Inativa!')
  }

  public deposit = (value: number): void => {
    if(this.validateStatus()){
      if(value > 0) {
        this.balance += value
      } else {
        throw new Error("Valor Inválido!")
      }
    }
  }

  public withdraw = (value: number): void => {
    if(this.validateStatus()){
      if(this.balance >= value) {
        this.balance -= value
      } else {
        throw new Error("Valor Inválido!")
      }
    }
  }
}
