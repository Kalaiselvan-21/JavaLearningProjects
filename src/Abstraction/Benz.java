package Abstraction;

// CHILD CLASS 2

public class Benz extends Car implements UpcomingProjects{

    @Override
    public void engineSecret() {
        System.out.println("Benz Engine Secret");
    }

    @Override
    public void companyVault() {
        System.out.println("Benz Company Vault");

    }

    @Override
    public void method1() {
        System.out.println("Method 1 from Interface UpcomingProjects");
    }

    @Override
    public void method2() {
        System.out.println("Method 2 from Interface UpcomingProjects");
    }

    public static void main(String[] args){
        Car benz = new Benz();
        benz.engineSecret();
        benz.companyVault();

        UpcomingProjects projects = new Benz();
        projects.method1();
        projects.method2();

    }

}
