package entity;

import enums.AccountType;

public class Account {

    

    private String clientName;
    private AccountType accountType;
    private Integer accountNumber;
    private Double accountBalance;

    public Account(String clientName, AccountType accountType, Integer accountNumber, Double currentBalance) {
        this.clientName = clientName;
        this.accountType = accountType;
        this.accountNumber = accountNumber;
        this.accountBalance = currentBalance;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public AccountType getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(Double currentBalance) {
        this.accountBalance = currentBalance;
    }

    @Override
    public String toString() {
        return "********************************************\n"+  " Dados iniciais do cliente \n"
                + " Nome: " + clientName + "\n Tipo de conta: " + accountType + "\n Numero da conta: " + accountNumber
                + "\n Saldo: R$" + accountBalance + "\n********************************************\n";
    }

}
