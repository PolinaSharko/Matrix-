public class main {
	public static void main	(String[] args) {
        Matrix k = new Matrix(7);
	Matrix g = new Matrix(6);

	System.out.println(k.toString());
	System.out.println(g.toString());
	k=k.shuffleRows();
	g=g.shuffleRows();
	System.out.println(k.toString());
	System.out.println(g.toString());
	}
}
