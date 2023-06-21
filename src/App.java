import java.util.Scanner;

import entity.Account;
import enums.AccountType;
import service.AccountService;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        AccountService accountService = new AccountService();

        Account conta1 = new Account(null, null, null, null);
        AccountType accountTypeValid;

        System.out.println("Informe nome do titular da conta: ");
        conta1.setClientName(scanner.nextLine());

        System.out.println("Informe o tipo da conta (Corrente ou Poupança): ");
        String recievedDay = scanner.nextLine();
        accountTypeValid = accountService.accountTypeValidate(recievedDay);
        conta1.setAccountType(accountTypeValid);

        System.out.println("Informe o numero da conta: ");
        conta1.setAccountNumber(scanner.nextInt());

        System.out.println("Informe o saldo da conta: ");
        conta1.setAccountBalance(scanner.nextDouble());

        System.out.println(conta1);

        System.out.println("Informe a operação desejada: \n 1 - Consultar saldo\n 2 - Receber valor\n 3 - Transferir valor\n 4 - Sair\n");
        int operation = scanner.nextInt();
        

        switch (operation) {
            case 1:
                System.out.println("Seu Saldo: R$" + conta1.getAccountBalance());
                break;
            case 2:
                System.out.println("Saldo atualizado: R$" + accountService.receiveValue(conta1, conta1.getAccountBalance()));
                break;
            case 3:
                Double newBalanceTransfer = accountService.transferValue(conta1, conta1.getAccountBalance());
                System.out.println("Saldo atualizado: R$" + newBalanceTransfer);
                break;
            case 4:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Operação inválida tente: \\n" +
                        " 1 - Consultar saldo\\n" +
                        " 2 - Receber valor\\n" +
                        " 3 - Transferir valor\\n" +
                        " 4 - Sair\\n" +
                        "");
        } 
        scanner.close();
    }
}

