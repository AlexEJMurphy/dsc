package com.murphhsta.originals.dsc;

import java.time.Duration;

public class Event {
    public Event(UnweightedValue unweightedValue, Duration durationOfEvent) {
        this.unweightedValue = unweightedValue;
        this.durationOfEvent = durationOfEvent;
    }

    public Event(UnweightedValue unweightedValue){
        this.unweightedValue = unweightedValue;
    }

    UnweightedValue unweightedValue;
    Duration durationOfEvent;

}
