
/**
 *
 * Euler 461
 * https://projecteuler.net/problem=461
 * 
 * @author Dr. Baharav
 */



import java.util.Arrays;

public class Euler461 {

    
    private int n;      // The order of f

    // initialize to set n
    public Euler461(int order) {
        n = order;
    }
    
    // calculate f_n(k)
    public double fnk(int k) {
        return Math.exp(k/(double)n) - 1;
    }
    

    // calculate inverse of f_n(k)
    // namely, given val, return (k) such that f_n(k) = val
    public double fnkInverse(double val) {
        return n*Math.log(val+1) ;
    }
        
    // calculate distance from PI given a value
    public double distPI(double val) {
        return Math.abs(val-Math.PI);
    }
    
    // claculate g(n) given a,b,c,d
    // g(n) = a^2 + b^2 + c^2 + d^2
    public int g(int a, int b, int c, int d) {
        return a*a+b*b+c*c+d*d;
    }
    
    
    
    // solve
    public int solve(){
        return solve2();
    }
    
    public int solve1() {
        int maxA = (int) Math.ceil(fnkInverse(Math.PI));  // the value that will cause f_n(a) > PI
        double minDist = Math.PI;   // This is the largest distance it can be if we start from all integers=0
        int a=0,b=0,c=0,d=0;
        for (int aa=0; aa<=maxA; ++aa) {
            double valA = fnk(aa);
            for (int bb=0; bb<=aa; ++bb) {
                double valB = fnk(bb);
                for (int cc=0; cc<=bb; ++cc) {
                    double valC = fnk(cc);
                    for (int dd=0; dd<=cc; ++dd) {
                        double valD = fnk(dd);

                        double val = valA + valB + valC + valD;
                        if (distPI(val) < minDist) {
                            minDist = distPI(val);
                            a = aa; b = bb; c = cc; d=dd;
                        }
                    }
                }
            }
        }
        System.out.format(" I -- Solved: n=%d. (a,b,c,d)=(%d,%d,%d,%d). Value of g=%d\n",n,a,b,c,d,g(a,b,c,d));
        return g(a,b,c,d);
    }
    
    
    
 
    public int solve2() {
        int maxA = (int) Math.ceil(fnkInverse(Math.PI));  // the value that will cause f_n(a) > PI
        
        // vals1 : One array with all the relevant
        double[] vals1 = new double[maxA+1];
        for (int ii=0; ii<vals1.length; ++ii)
            vals1[ii] = fnk(ii);
        
        
        // vals2 : One array with all the relevant values achievable by adding two elements.
        // cnt2 : the number of relevant elements in vasl2

        
        // Number of elements in vals2 is bound by:
        // (1^2 + 2^2 + 3^2 + ... + N^2) =  (N * (N + 1) * (2N + 1)) / 6
        int cnt1 = vals1.length;
        int nelements = (cnt1*(cnt1+1))/2;
        double[] vals2 = new double[nelements];

        int cnt2 = 0;
        double maxTmp = vals1[cnt1-1];  // We shouldn't go higher than this. It is already larger than pi.
        for (int ii=0; ii<vals1.length; ++ii)
            for (int jj=0; jj<=ii; ++jj) {
                if (vals1[ii]+vals1[jj] < maxTmp)
                    vals2[cnt2++] = vals1[ii]+vals1[jj];
                else
                    break;
            }
        
        //System.out.format("Length of vals2 is: %d\n",cnt2);
        
        Arrays.sort(vals2, 0, cnt2);
        
        
        int i1 = 0;         // bottom
        int i2 = cnt2-1;    // top

        double val1 = 0;
        double val2 = 0;
        double minDist = 999;   // we can do smarter, but that should do        
        
        for ( i1=0; i1<i2 ; ++i1) {
            // can we stop here at i2>=i1 ?
            while ( i2>=0   &&   vals2[i1]+vals2[i2] > Math.PI  ) i2--;
            
            // We went BELOW pi
            if ( distPI(vals2[i1]+vals2[i2]) < minDist ) {
                minDist = distPI(vals2[i1]+vals2[i2]);
                val1 = vals2[i1];
                val2 = vals2[i2];
            }
            // let's check the previous one
            if (i2+1<cnt2) {
                if ( distPI(vals2[i1]+vals2[i2+1]) < minDist ) {
                    minDist = distPI(vals2[i1]+vals2[i2+1]);
                    val1 = vals2[i1];
                    val2 = vals2[i2+1];
                }
            }            
            
        }
        
        // unfold indices into the right a,b,c,d
        
        int a=0,b=0,c=0,d=0;
        for (int ii=0; ii<cnt1; ++ii) 
            for (int jj=0; jj<=ii; ++jj) {
                if (vals1[ii] + vals1[jj] == val1) {a=ii; b=jj;}
                if (vals1[ii] + vals1[jj] == val2) {c=ii; d=jj;}                
            }
        
        //System.out.format(" II -- Solved: n=%d. (a,b,c,d)=(%d,%d,%d,%d). Value of g=%d\n",n,a,b,c,d,g(a,b,c,d));
        return g(a,b,c,d);        
    }
    
}
