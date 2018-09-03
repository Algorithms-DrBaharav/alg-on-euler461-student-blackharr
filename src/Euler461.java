
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
        return 0;
    }
    
    
    
    // solve
    public int solve(){
        return solve1();
    }
    
    public int solve1() {
        int a=0,b=0,c=0,d=0;

        // ToDo
        
        
        
        System.out.format(" I -- Solved: n=%d. (a,b,c,d)=(%d,%d,%d,%d). Value of g=%d\n",n,a,b,c,d,g(a,b,c,d));
        return g(a,b,c,d);
    }
    
    
}
