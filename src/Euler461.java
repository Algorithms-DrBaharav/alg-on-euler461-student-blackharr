
/**
 *
 * Euler 461
 * https://projecteuler.net/problem=461
 * 
 * @author Dr. Baharav
 */



public class Euler461 {

    
    private int n;      // The order of f

    // initialize to set n
    public Euler461(int order) {
        n = order;
    }
    
    // calculate f_n(k)
    public double fnk(int k) {
        // ToDo
        return 0;
    }
    
    // calculate distance from PI given a value
    public double distPI(double val) {
        // ToDo
        return 0;
    }
    
            
    // claculate g(n) given a,b,c,d
    // g(n) = a^2 + b^2 + c^2 + d^2
    public int g(int a, int b, int c, int d) {
        // ToDo
        return Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2) + Math.pow(d, 2);
    }
    
    
    
    // solve
    public int solve(){
        return solve1();
    }
    
    public int solve1() {
        int maxA = (int) Math.ceil(fnkInverse(Math.PI));
        int a=0,b=0,c=0,d=0;

        // ToDo
        double[] vals1 = new double[maxA+1]l
            for (int ii = 0; ii<maxA; ++ii)
                vals1[ii] = fn(ii);
        for (int aa = 0; aa <= maxA; ++ aa) {
            double valA = vals1[aa];
            
            for (int bb = 0; bb <= aa;++bb) {
                double valB = vals1[bb];
                
                for (int cc = 0; cc <= bb ++cc) {
                    double valC = vals1[cc];
                    
                    for (int dd = 0; dd <= cc; ++dd) {
                        double valD = vals1[dd];
                        double val = valA + valB + valC + valD;
                        //ToDo
                    }
                }
            }
        }
        
        System.out.format(" I -- Solved: n=%d. (a,b,c,d)=(%d,%d,%d,%d). Value of g=%d\n",n,a,b,c,d,g(a,b,c,d));
        return g(a,b,c,d);
    }
    
    
}
