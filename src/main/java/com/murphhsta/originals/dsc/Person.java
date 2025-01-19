package com.murphhsta.originals.dsc;
//TODO: Sort out cavalier attitude to access modifiers
public class Person {
    private final String name;
    double weight;
    double incomePerHour;
    double netWorth;

    public static class Builder{
        private String name = "";
        double weight = 0;
        double incomePerHour = 0;
        double incomePerSecond = incomePerHour/3600;
        double netWorth = 0;

        public Builder(String name){
            this.name=name;
        }
        public Builder weight(double val) { weight = val; return this;}
        public Builder incomePerHour(double val){incomePerHour = val; return this;}
        public Builder incomePerSecond(double val){incomePerSecond = val; return this;}
        public Builder netWorth(double val){netWorth = val; return this;}

        public Person build(){
            return new Person(this);
        }
    }
    private Person(Builder builder){
        name = builder.name;
        weight = builder.weight;
        incomePerHour = builder.incomePerHour;
        netWorth = builder.netWorth;
    }
}
