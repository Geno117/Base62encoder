import java.lang.*;

public class b62encoder {
	public static void main(String args[]){
		char[] alphabet = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int stng= Integer.parseInt(args[0]);
		int bbase = 0;
		String encoded="";
		Integer remainder=0;
		while (remainder != stng){
			remainder = stng%((int) Math.pow(62,bbase));
			//System.out.println(bbase +"  "+ remainder);
			bbase+=1;
		}
		bbase-=2;
		remainder =0;
		//System.out.println("encoding bbase: " +bbase);
		while (bbase>-1){
			//System.out.println(bbase);
			encoded+=alphabet[stng/((int) Math.pow(62,bbase))];
			remainder=stng%((int) Math.pow(62,bbase));
			//System.out.println(encoded +"  "+ remainder);
			stng=remainder;
			bbase-=1;
		}
		System.out.println(args[0]+ " base62 encoded is "+encoded);
	}
}