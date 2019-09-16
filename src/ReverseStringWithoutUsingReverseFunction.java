
public class ReverseStringWithoutUsingReverseFunction {

	public static void main(String[] args) {
		String str="Hello people" ;
		StringBuffer strb = new StringBuffer();
		int length =str.length();
		for(int i=length-1;i>=0 ; i--)
		{
			strb=strb.append(str.charAt(i));
		}
		System.out.println(strb);
	}

}
