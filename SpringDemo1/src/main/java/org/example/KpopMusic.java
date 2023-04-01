package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class KpopMusic implements ManyMusic {
    private List<String> popList = new ArrayList<>();
    {
        popList.add("English");
        popList.add("Winter");
        popList.add("Happy new year");
    }
    @Override
    public List<String> getSongs(){
        return popList;
    }
}
