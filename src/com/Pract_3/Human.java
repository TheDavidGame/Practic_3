package com.Pract_3;

public class Human {
private String name = "Alex";

    public String getName() {
        return name;
    }

    public class Head{
    private String brain = "brain";

        public String getBrain() {
            return brain;
        }
    }
    public class Leg{
    private int leg_size = 44;

        public int getLeg_size() {
            return leg_size;
        }
    }

    public class Hand{
   private int finger_count = 10;

        public int getFinger_count() {
            return finger_count;
        }
    }
}
