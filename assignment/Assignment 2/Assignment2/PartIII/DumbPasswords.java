
public class DumbPasswords {

	public static void printDumbPasswords(int m, int n) {
		String[] letter = new String[n*n];
		int cnt = 0;
		for(int i = 0;i<n;i++){
			for(int j = 0;j<n;j++){
				letter[cnt] = ""+(char)('a'+i) + (char)('a'+j);
				cnt++;
			}
		}
		for(int i=1;i<m;i++){
			for(int j=1;j<m;j++){
				for(int k = 0;k<n*n;k++){
					for(int s =Math.max(i,j)+1;s<m+1;s++){
						System.out.print(i + "" + j + "" + letter[k] + "" + s+" ");
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int m = Integer.parseInt(args[0]);
		int n = Integer.parseInt(args[1]);
		printDumbPasswords(m,n);
		
	}
}
