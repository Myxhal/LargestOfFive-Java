/*************************************************************************
 *  Compilation:  javac LargestOfFive.java
 *  Execution:    java LargestOfFive 35 10 32 1 8
 *
 *  @author:
 * Mychal Ortega
 * mlo77@scarletmail.rutgers.edu
 * mlo77
 *
 *  Takes five distinct integers as command-line arguments and prints the 
 *  largest value
 *
 *
 *  % java LargestOfFive 35 10 32 1 8
 *  35
 *
 *  Assume the inputs are 5 distinct integers.
 *  Print only the largest value, nothing else.
 *
 *************************************************************************/

public class LargestOfFive {

    public static void main (String[] args) {

        int max = 0;
        for(int i = 0; i < args.length; i++){
            int x = Integer.parseInt(args[i]);
            if(x > max){
                max = x;
            }

        }
        System.out.println(max);
        // WRITE YOUR CODE HERE
    }
}
