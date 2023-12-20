/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int rand1 = ((int)(Math.random() * (b - a) + a));
		int rand2 = ((int)(Math.random() * (b - a) + a));
		int rand3 = ((int)(Math.random() * (b - a) + a));
		int minrRand = Math.min(Math.min(rand1,rand2),rand3);
		System.out.println(rand1);
		System.out.println(rand2);
		System.out.println(rand3);
		System.out.println("The minimal generated number is " + minRand);
	}
}
