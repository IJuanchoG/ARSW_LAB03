package edu.eci.arsw.blueprints.filter.impl;

import edu.eci.arsw.blueprints.filter.FilterBlueprints;
import edu.eci.arsw.blueprints.model.Blueprint;
import edu.eci.arsw.blueprints.model.Point;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Component
@Qualifier("redundancyFilter")
public class RedundancyFilter implements FilterBlueprints {
    @Override
    public Blueprint filterBlueprint(Blueprint bp) {
        ArrayList<Point> aux = new ArrayList<Point>();
        Point flag = null;
        for (Point p : bp.getPoints()){
            if (flag==null|| !p.equals(flag)){
                aux.add(p);
                flag=p;
            }
        }
        Point[] converted = toStaticList(aux);
        return new Blueprint(bp.getAuthor(),bp.getName(),converted);
    }

    private Point[] toStaticList(ArrayList<Point> arreglo){
        Point[] rta = new Point[arreglo.size()];
        for(int i=0; i<arreglo.size(); i++ ){
            rta[i] = arreglo.get(i);
        }
        return rta;
    }

}
