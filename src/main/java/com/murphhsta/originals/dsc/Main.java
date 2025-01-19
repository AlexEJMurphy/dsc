package com.murphhsta.originals.dsc;

public class Main {



    public static void main(String[] args) {
        UnweightedValue costOfLiftInPounds = new UnweightedValue(10);

        Person alex = new Person.Builder("Alex")
                .weight(100).
                incomePerHour(12)
                .build();

        Person james = new Person.Builder("James")
                .weight(67)
                .incomePerHour(12)
                .build();

        Event liftToWork = new Event(costOfLiftInPounds);

        AddSocialWeightingsToCosts aswc = new AddSocialWeightingsToCosts();
        System.out.println(aswc.splitPetrolCostByWeight(costOfLiftInPounds, james, alex));

    }

}
