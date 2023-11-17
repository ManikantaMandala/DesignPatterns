package com.DesignPatterns.Creational.Singleton;

public class Singleton {
    /*
    //Eager initialisation
    private static final Singleton instance = new Singleton();
    private Singleton(){ }
    public static Singleton getInstance(){
        return instance;
    }
     */
    /*
    // static block initialization
    private static Singleton instance;
    private Singleton(){}
    static {
        try{
            instance = new Singleton();
        }catch(Exception e){
        }
    }
    public static Singleton getInstance(){
        return instance;
    }
    */
    /*
    //Lazy initialization
    private static Singleton instance;
    private Singleton(){};
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    */
    /*
    //synchronized method
    private static Singleton instance;
    private Singleton(){};
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
     */
    //double check synchronized method

    private static Singleton instance;
    private Singleton(){};
    public static  Singleton getInstance(){
        if(instance ==null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
    /*
    //Bill pugh Singleton
    private Singleton(){}
    private static class BillPughSingleton{
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance(){
        return BillPughSingleton.INSTANCE;
    }
     */

}
