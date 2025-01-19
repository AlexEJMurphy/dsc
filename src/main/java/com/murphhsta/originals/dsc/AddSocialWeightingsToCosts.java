package com.murphhsta.originals.dsc;

import jakarta.persistence.Entity;

import java.util.ArrayList;
import java.util.List;

@Entity
public class AddSocialWeightingsToCosts {

    //TODO:
    // Refactor to split any cost by any weighting
    public List<Double> splitPetrolCostByBodyWeight(UnweightedValue unweightedValue, Person james, Person alex) {
        double petrolCost = unweightedValue.unweightedValue;
        double totalWeight = james.weight + alex.weight;
        double proportionOfTotalWeightJames = james.weight / totalWeight;
        double proportionOfTotalWeightAlex = 1 - proportionOfTotalWeightJames;
        double jamesPetrolCost = petrolCost * proportionOfTotalWeightJames;
        double alexPetrolCost = petrolCost * proportionOfTotalWeightAlex;
        List<Double> costRatio = new ArrayList<>();
        costRatio.add(jamesPetrolCost);
        costRatio.add(alexPetrolCost);
        return costRatio;
    }

    //TODO: Refactor to weight any cost according to income
    public double weightedCostOfShopTrip(UnweightedValue unweightedValue, Person person, Event shopTrip){
        double incomePerSecond = person.incomePerHour/3600;
        double weightedCost = unweightedValue.unweightedValue+(shopTrip.durationOfEvent.getSeconds()*incomePerSecond);
        return weightedCost;
    }
}
