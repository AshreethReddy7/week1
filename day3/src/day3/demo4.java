package day3;

public class demo4 {

	public static void main(String[] args) {
		String data="hello";
		StringBuffer str=new StringBuffer("welcome");
		
		long pT=System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			data=data+1;
		}
		long cT=System.currentTimeMillis();
		long diffT=cT-pT;
		
		long pT1=System.currentTimeMillis();
		for(int i=1;i<=10000;i++) {
			str=str.append(""+i);
			
		}
		long cT1=System.currentTimeMillis();
		long diffT1=cT1-pT1;
		
		System.out.println("from string---->"+diffT);
		System.out.println("from stringBuffer----->"+diffT1);
	}

}
