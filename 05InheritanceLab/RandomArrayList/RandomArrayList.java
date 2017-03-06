package RandomArrayList;

import java.util.ArrayList;
import java.util.Random;


public class RandomArrayList extends ArrayList {
    private Random rnd;

    public RandomArrayList(){
        rnd = new Random();
    }

    public Object getRandomElement(){
        int index = rnd.nextInt(super.size());
        Object element = super.get(index);
        super.set(index, super.get(super.size() - 1));
        super.remove(super.size() - 1);
        return element;
    }
}


