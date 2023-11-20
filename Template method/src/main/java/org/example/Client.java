package org.example;

class Client
{
    public static void main(String[] args)
    {
        OrderProcess netOrder = new NetOrder();
        netOrder.processOrder(true);
        System.out.println();
        OrderProcess storeOrder = new StoreOrder();
        storeOrder.processOrder(true);
    }
}