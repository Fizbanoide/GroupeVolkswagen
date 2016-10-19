package com.example.iem.groupevolkswagen;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iem on 19/10/2016.
 */

public class Group {

    protected List<SubComp> volkswagen = new ArrayList<>();

    public void addSubComp(SubComp subComp){
        this.volkswagen.add(subComp);
    }

    public void removeSubComp(SubComp subComp){
        this.volkswagen.remove(subComp);
    }

    
}
