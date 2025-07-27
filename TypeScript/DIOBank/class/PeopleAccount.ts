import { DioAccount } from "./DioAccount"

export class PersonalAccount extends DioAccount {
  private readonly doc_id: number

  constructor(doc_id: number, name: string, accountNumber: number){
    super(name, accountNumber)
    this.doc_id = doc_id
  }

  public getDocID = (): number => {
    return this.doc_id
  }
}