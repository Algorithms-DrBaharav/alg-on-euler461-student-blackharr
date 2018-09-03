
/**
 *
 * Evaluating times for EU461 
 * 
 * @author Dr. Baharav
 */
public class Main {

    
    
    public static void main(String[] args) {
        
        int N = 10;   
        Euler461 e = new Euler461(N);
        e.solve1();
        
        
        /*
        * You will need the part below ONLY for when you need to calculate running times
        * for multiple values of N
        */
        
        /*
        int[] nVals={10,20,30,40,50,100,200,300,1000,10000};
        int[] tValsMilliseconds=new int[nVals.length]; 
        
        for (int ii=0; ii<nVals.length;++ii) {
            int n = nVals[ii];
            Euler461 eTemp = new Euler461(n);
            long start = System.nanoTime();
            int lTimes = 4;
            for (int ll=0; ll<lTimes; ++ll) {
                eTemp.solve();
            }
            long end = System.nanoTime();
            tValsMilliseconds[ii] = (int) ( (end-start)/lTimes / 1000000 ); // nano - 10^-9 ==> tVals in milli 
            
            //System.out.format("ii=%d :: n=%d \t==>\t t=%d\n",ii, nVals[ii],tValsMilliseconds[ii]);
        }
        
        
        System.out.println("\nRunning times for different n values:\n");
        for (int ii=0; ii<nVals.length;++ii)
            System.out.format("n=%d \t==>\t t=%d\n", nVals[ii],tValsMilliseconds[ii]);

        */
    }
}
