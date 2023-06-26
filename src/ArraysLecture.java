import java.util.Arrays;

public class ArraysLecture {
    public static void main(String[] args) {
        double[] prices;
        prices = new double[4];

        prices[0] = 9.99;
        prices[1] = 10.99;
        prices[3] = 899.99;

        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        System.out.println(prices[3]);
        System.out.println(Arrays.toString(prices));

        String[] beatles = {"Paul", "John", "Ringo", "George"};
//        beatles[4] = "Yoko";
        System.out.println(Arrays.toString(beatles));

        for (int i = 0; i < prices.length; i++){
            System.out.println(prices[i]);
        }

        for (double price : prices){
            System.out.println(price);
        }

        for(String beatle : beatles){
            System.out.printf("A member of The Beatles is named %s.%n", beatle);
        }

        int[] allTheSame = new int[20];
        Arrays.fill(allTheSame, 99);
        allTheSame[0] = 10;
        System.out.println(Arrays.toString(allTheSame));

        String[] alsoBeatles = Arrays.copyOf(beatles, 4);
        System.out.println(alsoBeatles);
        System.out.println(beatles);
        System.out.println(beatles == alsoBeatles);
        System.out.println(Arrays.equals(beatles, alsoBeatles));

        alsoBeatles = Arrays.copyOf(alsoBeatles, 5);
        alsoBeatles[4] = "Yoko";
        System.out.println(Arrays.toString(alsoBeatles));
        System.out.println(alsoBeatles);
        Arrays.sort(alsoBeatles);
        System.out.println(Arrays.toString(alsoBeatles));



    }
}
