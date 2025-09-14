import java.util.Arrays;

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
        System.out.println(favDrinks.length);
        int[] keys = {2348, 2345823, 654, 30458, 5049, 589458, 3248238,  2374, 4234, 87756, 45654, 4654, 4566, 465465, 908, 798, 678, 67856785, 100, 234852, 23485, 456654, 543, 324534, 45678, 354, 345423, 23423, 5685, 98567, 23465, 6987, 456, 456, 798};
        for(int i=0;i<keys.length;i++) {
            if(keys[i]==100){
                System.out.println("You found the golden key!");
                break;
            }*/
        int[] playlistA = {
                3094234, 12323, 90990, 373737, 128732, 4388934, 2343947, 6548234, 234823, 4568,
                2345234, 234234, 678768, 6456, 787, 46456, 678567, 354345, 23423, 645745, 23423,
                2435423, 786768, 678786
        };

        int[] playlistB = {
                234823, 678786, 354345, 3094234, 6456, 678567, 23423, 786768,
                46456, 128732, 6548234, 234234, 4568, 4388934, 23423, 12323,
                2343947, 2435423, 645745, 678768, 2345234, 90990, 373737, 787
        };
        Arrays.sort(playlistA);
        Arrays.sort(playlistB);
        boolean isEqual = (Arrays.equals(playlistA,playlistB));
        if(isEqual)
            System.out.println("This is the same playlist.");
        else
            System.out.println("No match was found.");
        }
    }
