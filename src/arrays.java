public class arrays {
    public static void main(String[] args){
        //String[] zombieSurvivalPack = {"Water 🥤", "Dagger 🗡️", "Food 🍞", "Bandaids 🩹", "Helmet ⛑️"};
        /*String[] continents = {"Asia", "Africa", "North America", "South America", "Australia", "Europe", "Antarctica"};

        System.out.println(continents[2]);
        System.out.println(continents[3]);
        System.out.println(continents[4]);
        System.out.println(continents[9]); // There's no index 9!
        String[] favDrinks = {"Thanda", "Juice", "Shorbot", "Pani", "Borof", "Ice-Cream", "Mojo", "Aro", "Fuck Isarel"};
        System.out.println(favDrinks[2]);
        System.out.println(favDrinks[3]);
        System.out.println(favDrinks[6]);
        System.out.println(favDrinks.length);*/
        int[] keys = {2348, 2345823, 654, 30458, 5049, 589458, 3248238,  2374, 4234, 87756, 45654, 4654, 4566, 465465, 908, 798, 678, 67856785, 100, 234852, 23485, 456654, 543, 324534, 45678, 354, 345423, 23423, 5685, 98567, 23465, 6987, 456, 456, 798};
        for(int i=0;i<keys.length;i++) {
            if(keys[i]==100){
                System.out.println("You found the golden key!");
                break;
            }
        }
    }
}
