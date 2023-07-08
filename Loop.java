public class Loop {
    public static void main(String[] a){
//       for (int valueEntered = 0; valueEntered < 7;valueEntered++) {
//           System.out.println(valueEntered);
//

        // Iterate over collection of elements
        String[] newFruits={
                "Apple",
                "Banana",
                "Fig"
       };

        for( String fruit: newFruits){
            System.out.println(fruit);
        }
    }
}
