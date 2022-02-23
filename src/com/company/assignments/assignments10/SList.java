package com.company.assignments.assignments10;

public class SList <T>{
    Node <T> head;

    SList(){
        this.head = null;
    }
    public SListIterator iterator()
    {

        return new SListIterator(head);
    }
}