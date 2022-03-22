package com.example.task05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/**
 * Ломаная линия
 */
public class PolygonalLine {
    private ArrayList<Point> points;

    public PolygonalLine() {
        points = new ArrayList<>();
    }

    /**
     * Устанавливает точки ломаной линии
     *
     * @param points массив точек, которыми нужно проинициализировать ломаную линию
     */
    public void setPoints(Point[] points) {
        for(Point point : points){
            addPoint(new Point(point.getX(), point.getY()));
        }
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param point точка, которую нужно добавить к ломаной
     */
    public void addPoint(Point point) {
        addPoint(point.getX(), point.getY());
    }

    /**
     * Добавляет точку к ломаной линии
     *
     * @param x координата по оси абсцисс
     * @param y координата по оси ординат
     */
    public void addPoint(double x, double y) {
        points.add(new Point(x, y));
    }

    /**
     * Возвращает длину ломаной линии
     *
     * @return длину ломаной линии
     */
    public double getLength() {
        double totalLength = 0;
        for(int i = 0; i < points.size() - 1; i++) {
            totalLength += points.get(i).getLength(points.get(i + 1));
        }
        return totalLength;
    }

}
