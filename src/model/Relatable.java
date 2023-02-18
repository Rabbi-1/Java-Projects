package model;

public interface Relatable {
    boolean equal(GradedActivity g);
    boolean isGreater(GradedActivity g);
    boolean isLess(GradedActivity g);
}
