package service;

import java.util.Scanner;

import entity.Account;
import enums.AccountType;

public class AccountService {

    public AccountType accountTypeValidate(String recievedDay) {
        try {
            if (recievedDay.equalsIgnoreCase("corrente")) {
                return AccountType.CORRENTE;

            } else if (recievedDay.equalsIgnoreCase("poupanca")) {
                return AccountType.POUPANCA;

            } else {
                return null;
            }
        } catch (IllegalArgumentException e) {
            System.out.println(
                    "Tipo de conta invalido, tente 'CORRENTE' para conta corrente ou 'POUPANCA' para conta poupança");

        }
        return null;
    }

    public Double receiveValue(Account conta1, Double newBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor a ser recebido: ");
        Double recievedValue = scanner.nextDouble();
        scanner.close();
        Double currentBalance = conta1.getAccountBalance();
        newBalance = currentBalance + recievedValue;
        conta1.setAccountBalance(newBalance);
        return conta1.getAccountBalance();
        
    }

    public Double transferValue(Account conta1, Double newBalance) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor a ser recebido: ");
        Double valueToTransfer = scanner.nextDouble();
        scanner.close();
        scanner.close();
        Double currentBalance = conta1.getAccountBalance();

        if(valueToTransfer < currentBalance){
             newBalance = currentBalance - valueToTransfer;
            conta1.setAccountBalance(newBalance);
            return newBalance;

        }else if(valueToTransfer > currentBalance){
            System.out.println("Saldo insuficiente para a transferência!");
        }
        
        return conta1.getAccountBalance();
    }
}
