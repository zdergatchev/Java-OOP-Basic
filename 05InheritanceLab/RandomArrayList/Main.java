package RandomArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        RandomArrayList ral = new RandomArrayList();
        ral.add(1);
        ral.add("gosho");
        ral.add(2);
        ral.add(new RandomArrayList());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
        System.out.println(ral.getRandomElement());
    }
}
