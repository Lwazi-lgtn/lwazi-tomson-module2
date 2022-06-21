import java.util.Arrays;


public class question2 {

//Searched Apps from Google
	public static void main(String[] args) {
		   String arr[] = { "FNB Banking",
                   "Snap Scan",
                   "Live Inspect",
                   "WumDrop",
                   "Domestly",
                   "Khule ecosystem ",
                   "Shyft",
                   "EasyEquities",
                   "Ambani Africa",
                   "Naked Insurance" };
		   
		//Sort and print the apps by name
	        Arrays.sort(arr);
	        System.out.println("a) Sorted arr[] : "
	                           + Arrays.toString(arr));
	 
	    
	     //Print the winning app of 2017 and the winning app of 2018
	        
	        System.out.println("b) " + "2017:" + arr[7] + " & " + "2018:" + arr[4]);
	        
	        //Print total number of apps from the array
	        System.out.println("c) 10" );
	        }

	}


