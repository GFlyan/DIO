import { PersonalAccount } from './class/PeopleAccount'
import { CompanyAccount } from './class/CompanyAccount'
import { NewAccount } from './class/NewAccount'

console.log("--------------------\nPersonal Account\n--------------------")

const personalAccount: PersonalAccount = new PersonalAccount(213, 'Personal', 35)
console.log("Nome:", personalAccount.getName())
console.log("ID do Documento:", personalAccount.getDocID())
console.log("Número da Conta:", personalAccount.getAccountNumber())
personalAccount.deposit(123)
console.log("Saldo Após Depósito:", personalAccount.getBalance())
personalAccount.withdraw(10)
console.log("Saldo Após Saque:", personalAccount.getBalance())

console.log("--------------------\nCompany Account\n--------------------")

const companyAccount: CompanyAccount = new CompanyAccount('Company', 20)
console.log("Nome:", companyAccount.getName())
console.log("Número da Conta:", companyAccount.getAccountNumber())
companyAccount.deposit(294)
console.log("Saldo Após Depósito:", companyAccount.getBalance())
companyAccount.withdraw(5)
console.log("Saldo Após Saque:", companyAccount.getBalance())
companyAccount.getLoan(1000)
console.log("Saldo Após Empréstimo:", companyAccount.getBalance())

console.log("--------------------\nNew Account\n--------------------")

const newAccount: NewAccount = new NewAccount("New", 241)
console.log("Nome:", newAccount.getName())
console.log("Número da Conta:", newAccount.getAccountNumber())
newAccount.deposit(984)
console.log("Saldo Após Depósito:", newAccount.getBalance())
newAccount.withdraw(29)
console.log("Saldo Após Saque:", newAccount.getBalance())
