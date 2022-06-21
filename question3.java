
public class question3 {

	public static void main(String[] args) {
	
		String arr[] = { "EasyEquities",
                "Best Financial Solution",
                "EasyEquities Team",
                "2020" };
		
		System.out.println("b)" + arr[0]+ " ," + arr[1] + ", " +  arr[2] +  ", " +  arr[3]);
         
	}

	private static void toupper(String[] arr) {
		
		System.out.println(arr[0]+ " ," + arr[1] + ", " +  arr[2] +  ", " +  arr[3]);
        toupper(arr);
	}

}
