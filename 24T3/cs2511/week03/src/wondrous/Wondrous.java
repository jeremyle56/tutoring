package wondrous;

import java.util.ArrayList;
import java.util.List;

public class Wondrous {
    public List<Integer> wondrous(int start) {
        if (start < 1)
            throw new IllegalArgumentException("wondrous start must be >= 1");
        else if (start == 1)
            return new ArrayList<Integer>();

        int current = start;
        List<Integer> sequence = new ArrayList<Integer>();

        while (current != 1) {
            sequence.add(current);
            if (current % 2 == 0) {
                current /= 2;
            } else {
                current = (current * 3) + 1;
            }
        }

        sequence.add(current);
        return sequence;
    }
}