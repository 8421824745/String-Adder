

public class Addition {
	public static int Add(String numbers) throws Exception {
		String arra=numbers.trim();
		arra = arra.replaceAll("\n", ",");
		//System.out.println(arra);
		if(arra.isEmpty()) {
			return 0;
		}
		if(arra.length()==1) {
			return 1;
		}
		
		String[] arr=arra.split(",");
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			if(Integer.parseInt(arr[i])<0){
				throw new Exception("negative number found");
			}
			else{
			sum+=Integer.parseInt(arr[i]);
			}
		}
		return sum;
	}

	public static void main(String[] args) throws Exception {
		// handling new line input
		int s=Add("1,\n");
		System.out.println(s);
        
		// handling multiple inputs
		int c=Add("1,2,3,4,5");
		System.out.println(c);


	}

}
