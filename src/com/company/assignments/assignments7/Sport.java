package com.company.assignments.assignments7;

public class Sport {

    void playSports(){
        System.out.println("I am outer sports class");
    }

    class Cricket{

        Cricket(String countryName){
            System.out.println("I am a player of " + countryName);
        }
    }
}

class player extends Sport{

    void aboutPlayer(){
        System.out.println("I am a outer player");
    }

    class PlayerDescription extends Sport.Cricket {

        PlayerDescription(String countryName) {
            super(countryName);
        }
    }

}

class SportsMain{
    public static void main(String[] args) {
        Sport sp = new Sport();
        Sport.Cricket cri = sp.new Cricket("India");
        //Sports.Cricket cri = new Sports.Cricket("India");



    }
}
