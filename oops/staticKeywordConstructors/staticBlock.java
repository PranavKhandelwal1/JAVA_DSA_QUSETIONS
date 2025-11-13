package oops.staticKeywordConstructors;

public class staticBlock {
    static String planet = "Earth";
    static long population;

    // this will only load once when the class in loadedx.
    static {
        System.out.println("I am planet: " + planet + "(Only run once, no matter how many obj you create.)");
        population = 8000000000L;
    }

    public static void main(String[] args) {
        staticBlock sb = new staticBlock();
        System.out.println("Planet: " + staticBlock.planet);
        System.out.println("Population: " + staticBlock.population);

        staticBlock.population += 1;;

        staticBlock sb1 = new staticBlock();
        System.out.println("Planet: " + staticBlock.planet);
        System.out.println("Population: " + staticBlock.population);
    }
}
