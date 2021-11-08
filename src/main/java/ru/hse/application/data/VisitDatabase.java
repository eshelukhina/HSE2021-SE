package ru.hse.application.data;

import ru.hse.application.models.Visit;

import java.util.HashMap;
import java.util.Map;

public class VisitDatabase {
    private static final Map<Integer, Visit> data = new HashMap<>();

    public static void addVisit(Visit visit) {
        Integer nextId = data.size();
        data.put(nextId, visit);
        visit.setId(nextId);
    }

    public static void clear() {
        data.clear();
    }
}
