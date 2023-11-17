package com.DesignPatterns.Builder;

public class Person {
    private String name;
    private int age;
    private String emailId;
    private String phoneNumber;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emailId='" + emailId + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public Person(String name, int age, String emailId, String phoneNumber){
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Builder builder(){
        return new Builder();
    }
    public static class Builder{
        private String name;
        private int age;
        private String emailId;
        private String phoneNumber;

        public Builder(){}

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder emailId(String emailId) {
            this.emailId = emailId;
            return this;
        }

        public Builder phoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }
        public boolean validate(){
            return true;
        }
        public Person build(){
            validate();
            return new Person(name, age, emailId, phoneNumber);
        }
    }
}
