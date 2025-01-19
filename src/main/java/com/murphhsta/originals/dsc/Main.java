package com.murphhsta.originals.dsc;

import java.time.Duration;

public class Main {



    public static void main(String[] args) {
        UnweightedValue costOfLiftInPounds = new UnweightedValue(10);
        UnweightedValue shopTripGoodsValueInPounds = new UnweightedValue(2);
        Duration timeToGoToShop = Duration.ofSeconds(300);

        Person alex = new Person.Builder("Alex")
                .weight(100).
                incomePerHour(12)
                .build();

        Person james = new Person.Builder("James")
                .weight(67)
                .incomePerHour(12)
                .build();

        Event liftToWork = new Event(costOfLiftInPounds);
        Event tripToShops = new Event(shopTripGoodsValueInPounds,timeToGoToShop);

        AddSocialWeightingsToCosts aswc = new AddSocialWeightingsToCosts();
        System.out.println(aswc.splitPetrolCostByBodyWeight(costOfLiftInPounds, james, alex));
        System.out.println(aswc.weightedCostOfShopTrip(shopTripGoodsValueInPounds,alex,tripToShops));

    }

}
