package blatt4.aufgabe9;


public class Rama {

	public static int rama() {
		int n = 1;
		int i3;
		int j3;
		int k3;
		int l3;
		while (true) {
			for (int i = 1; (i3 = i * i * i) < n; i++)
				for (int j = 1; (j3 = j * j * j) < n; j++)
					if (i3 + j3 == n)
						for (int k = 1; (k3 = k * k * k) < n; k++)
							if (k != i && k != j)
								for (int l = 1; (l3 = l * l * l) < n; l++)
									if (k3 + l3 == n)
										return n;
			n++;
		}
	} 
}
