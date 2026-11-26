package corejava.loops.Patterns;

public class InvertedNumTriangle {

	public static void main(String[] args) {
		int num=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5-i;j++) {
				System.out.print(j+" ");
				num++;
			}
			System.out.println();
		}

	}

}
