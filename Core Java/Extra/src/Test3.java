
public class Test3 {

	public static void main(String[] args) {
		String s = "Let's get Start";
		System.out.println(reverse(s));
	}

	public static String reverse(String s) {
		char[] c = s.toCharArray();
		int i = 0;
		for (int j = 0; j < c.length; j++) {
			if (c[j] == ' ') {
				rev(c, i, j - 1);
				i=j+1;
			}
		}
		rev(c,i,c.length-1);
		return new String(c);
	

	}

	public static void rev(char[] c, int i, int j) {
		while (i <= j) {
			char temp = c[j];
			c[j] = c[i];
			c[i] = temp;
			i++;
			j--;
		}
	}
}