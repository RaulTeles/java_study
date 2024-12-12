package entities;

public class Client {
    private int numberAccount;
    private String nameClient;
    private double depositAmount;


    public Client(int numberAccount, String nameClient, double initialDeposit){
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
        deposit(initialDeposit);
    }

    public Client(int numberAccount, String nameClient){
        this.numberAccount = numberAccount;
        this.nameClient = nameClient;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public double getDepositAmount() {
        return depositAmount;
    }


    public void deposit(double depositAmount){
        this.depositAmount += depositAmount;
    }

    public void withdran(double depositAmount){
        this.depositAmount = (this.depositAmount - depositAmount) - 5;
    }

    public String toString(){
        return "Cliente: "+ nameClient +
                "\nAccount: "+ numberAccount+
                "\nValue in Account:R$ "+ depositAmount+"\n";
    }


}
