

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
		//int k = Integer.parseInt(arr[0]);
		//int j=Integer.parseInt(arr[1]);
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
	int s=Add("1\n2,3");
	System.out.println(s);

	}

}
