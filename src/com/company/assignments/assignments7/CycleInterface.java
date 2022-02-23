package com.company.assignments.assignments7;

interface CycleInterface {

    int numberOfTyres();
}

class NewUnicycle implements CycleInterface {

    int tyres = 1;

    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class NewBicycle implements CycleInterface{

    int tyres = 2;
    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class NewTricycle implements CycleInterface{

    int tyres = 3;
    @Override
    public int numberOfTyres() {
        return tyres;
    }
}

class CycleFactory{
    public CycleInterface createNewCycle(String tyre){
        if(tyre == null || tyre.isEmpty())
            return null;
        if("One".equals(tyre))
            return new NewUnicycle();
        else if("Two".equals(tyre))
            return new NewBicycle();
        else if("Three".equals(tyre))
            return new NewTricycle();
        return null;
    }
}

class BuyACycle {
    public static void main(String[] args) {
        CycleFactory cyclefactory = new CycleFactory();
        CycleInterface newCycle = cyclefactory.createNewCycle("Two");
        System.out.println(newCycle.numberOfTyres());
    }


}
