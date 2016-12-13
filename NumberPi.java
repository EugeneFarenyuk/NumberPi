// Task: 1.Compute Number Pi using formula: Pi = 4* (1 -1/3 +1/5 -1/7 +...).
//       2.Limit the result to six significant digits.
import java.lang.*;
public class NumberPi {
    public static void main(String args[]) {        
        // in sequence {1,3,5,7,...} the n-th term = 2*n-1.
        // to alternate plus and minus use Math.pow(-1.0, i + 1.0).
        int iMax= 1000000; // max number of iterations necessary and sufficient for task #2.
        // the number 1 million was determined by testing (compare outputs to the commonly known exact Pi).
        double Pi=0;
        // in sequence {1,3,5,7,...} the n-th term = 2*n-1.
        // to alternate plus and minus use Math.pow(-1.0, i+1.0).
        for(int i=1; i<=iMax; i++)  Pi = Pi + 1.0/(2.0*i-1) * Math.pow(-1.0, i+1.0);
        Pi = 4*Pi; 
        System.out.printf("Pi = %.5f (limited to six s.f.)\n", Pi);
}}