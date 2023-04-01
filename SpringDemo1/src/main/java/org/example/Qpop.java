package org.example;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Qpop implements ManyMusic{
    private List<String> qpopList = new ArrayList<>();
    {
        qpopList.add("Qar");
        qpopList.add("Eski taspa");
        qpopList.add("Bayau");
    }
    @Override
    public List<String> getSongs(){
        return qpopList;
    }

}
