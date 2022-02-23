package com.company.assignments.assignments7;

public abstract class Rodent {

    abstract void size();

    abstract void diseasesSpread();
}

class mouse extends Rodent{

    mouse()
    {
        System.out.println("I am mouse ");
    }

    @Override
    void size() {
        System.out.println("I am very small in size");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I lead to crop damage and also is the source of antivirus");
    }
}

class gerbil extends Rodent{

    gerbil(){
        System.out.println("I am a gerbil");
    }

    @Override
    void size() {
        System.out.println("I have long hind feet and fairly large ears");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I can also damage crops and also spread leptospirosis");
    }
}

class hamster extends Rodent{

    hamster(){
        System.out.println("I am a hamster");
    }

    @Override
    void size() {
        System.out.println("I have a stout body and elongated cheek pouches");
    }

    @Override
    void diseasesSpread() {
        System.out.println("I spread less disease and prove to be ideal pet");
    }
}

class main{

    public static void main(String[] args) {
        Rodent[] rodentArray = new Rodent[3];

        rodentArray[0] = new mouse(); // while initializing the array of objects it is calling the constructor of the derived classes
        rodentArray[1] = new gerbil();
        rodentArray[2] = new hamster();

        rodentArray[0].size();
        rodentArray[0].diseasesSpread();

        rodentArray[1].size();
        rodentArray[1].diseasesSpread();

        rodentArray[2].size();
        rodentArray[2].diseasesSpread();


    }
}