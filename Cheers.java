//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    String name = args[0];
            int n = Integer.parseInt(args[1]);
            char letter;
            for(int i = 0; i<name.length(); i++)
            {
                String x ="a";
                letter = name.charAt(i);
                if (letter=='A'|| letter=='E' || letter=='F' || letter=='H' || letter=='I' || letter=='L' || letter=='M' || letter=='N' || letter=='O' || letter=='R' || letter=='S' || letter=='X') {
                      x = "an";  
                }
                System.out.println("Give me " + x + " " + letter + ": " + letter + "!");

            }



            System.out.println("What does that spell?");
            for(int i = 0; i < n; i++)
            {
                System.out.println(name + "!!!");
            }
        }
}
