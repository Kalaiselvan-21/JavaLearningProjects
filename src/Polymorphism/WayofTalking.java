package Polymorphism;

// To define Polymorphism

public class WayofTalking {

    public void talk(Parents talkingStyle){
    System.out.println("Polite");
}

public void talk(Partner talkingStyle){
    System.out.println("Freetalking");
}

public void talk(Boss talkingStyle){
    System.out.println("Nothing Personal");
}

public void talk(Son talkingStyle){
    System.out.println("Magane");
}

public static void main (String[] args){
    WayofTalking talking = new WayofTalking();
    Partner partner = new Partner();
    talking.talk(partner);

   //WayofTalking talking1 = new WayofTalking();
    Boss boss = new Boss();
    talking.talk(boss);
}
}
