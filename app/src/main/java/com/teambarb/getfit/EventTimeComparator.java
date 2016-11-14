package com.teambarb.getfit;

import com.google.api.services.calendar.model.Event;
import java.util.Comparator;

/**
 * Created by Benjamin on 11/14/2016.
 */
public class EventTimeComparator implements Comparator<Event>{
    @Override
    public int compare(Event a, Event b){
        long astart = 0, bstart = 0;
        if(a.getStart().getDateTime() == null){
            astart = a.getStart().getDate().getValue();
        } else {
            astart = a.getStart().getDateTime().getValue();
        }
        if(b.getStart().getDateTime() == null){
            bstart = b.getStart().getDate().getValue();
        } else {
            bstart = b.getStart().getDateTime().getValue();
        }


        return astart > bstart ? 1 : (astart == bstart ? 0 : -1);
    }
}

