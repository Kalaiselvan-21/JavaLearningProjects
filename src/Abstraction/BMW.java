package Abstraction;

// CHILD CLASS 1

public class BMW extends Car {

    @Override
    public void engineSecret(){
        System.out.println("BMW Engine Secret");
    }

    @Override
    public void companyVault(){
        System.out.println("BMW Company Vault");
    }
    public static void main(String[] args){
        Car bmw = new BMW();
        bmw.engineSecret();
        bmw.companyVault();
        bmw.employees();
    }
}
