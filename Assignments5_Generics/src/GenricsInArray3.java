
public class GenricsInArray3 {
	public static final <T> void swap (int[] a, int i, int j) {
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a= {1,2,4,3,5,0,6};
        swap(a, 2, 3);
        for(int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        	
        }
	}

}
