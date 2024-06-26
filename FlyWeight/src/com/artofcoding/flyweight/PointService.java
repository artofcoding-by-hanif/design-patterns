package com.artofcoding.flyweight;

import java.util.ArrayList;
import java.util.List;

public class PointService {
    private PointIconFactory pointIconFactory;

    public PointService(PointIconFactory pointIconFactory) {
        this.pointIconFactory = pointIconFactory;
    }

    public List<Point> getPoints() {
        List<Point> points = new ArrayList<>();
        var point = new Point(1, 2, this.pointIconFactory.getPointIcon(PointType.CAFE));
        points.add(point);

        return points;
    }
}
