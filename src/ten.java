import java.util.Random;


public class ten {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random();
		int a[][]=new int[30][30];
		int b[][]=new int[30][30];
		int c[][]=new int[30][30];
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				a[i][j]=r.nextInt(20);
				b[i][j]=r.nextInt(20);
			}
		}
		long start=System.currentTimeMillis();
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				c[i][j]=0;
				for(int k=0;k<b.length;k++){
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		/*try {
			//Thread.sleep(3000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}*/
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		 for (int x[] : a) { 
	            for (int e : x) { 
	            		System.out.print(e+"\n");
	            	
	            } 
	        } 
		 System.out.println(System.currentTimeMillis());
		
	}

}
