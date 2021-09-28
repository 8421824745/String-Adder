

public class Addition {
	public static int Add(String numbers) {
		String arra=numbers.trim();
		if(arra.isEmpty()) {
			return 0;
		}
		if(arra.length()==1) {
			return 1;
		}
		
		String[] arr=numbers.split(",",2);
		int k = Integer.parseInt(arr[0]);
		int j=Integer.parseInt(arr[1]);
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=Integer.parseInt(arr[i]);
		}
		return sum;
	}

	public static void main(String[] args) {
	int s=Add("1,4");
	System.out.println(s);

	}

}
