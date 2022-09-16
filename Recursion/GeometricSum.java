public class GeometricSum {
    public static double findGeometricSum(int k){
		// Write your code here
        
        if (k == 0){
            return 1;
        }
        return (1/Math.pow(2, k)) + findGeometricSum(k-1);
    }

    public static void main(String[] args) {
        System.out.println(findGeometricSum(5));
    }
}   

