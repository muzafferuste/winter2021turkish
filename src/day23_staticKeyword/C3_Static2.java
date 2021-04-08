package day23_staticKeyword;

public class C3_Static2 {

	int x;
	static int y;

	C3_Static2(int i) {

		x += i;
		y += i;
	}

	@SuppressWarnings("static-access") // static variable'da obje kullanilmasin diye uyari veriyordu. Uyariyi kaldirmak
										// icin bun kullanabiliriz

	public static void main(String[] args) {

		new C3_Static2(2);
		C3_Static2 st = new C3_Static2(3);
		System.out.println(st.x + "," + st.y);

	}

}
