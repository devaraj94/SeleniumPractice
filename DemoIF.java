package webdriverprojects;

public class DemoIF {

	public static void main(String[] args) {
		String Expected="ABCDE";
		String Actual="ABCDE123";
		
		 boolean status=Expected.equals(Actual);
if (!status) {
	System.out.println("this is success");
	
}
else {
System.out.println("this is failure");	

}
	}
}


