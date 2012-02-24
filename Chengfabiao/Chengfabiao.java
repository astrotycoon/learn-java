import java.util.Scanner;
public class Chengfabiao {
	public static void main(String args[]) {
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		Print print = new Print(number);
		print.print_chengfabiao();	
	}
}

class Print {
	int i;

	Print(int i) {	//构造方法
		this.i = i;
	}

	public void print_chengfabiao() {
		for (int i = 1; i <= this.i; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.printf("%d x %d = %d\t", j, i, i * j);
			}
			System.out.println("");	//换行
		}
	}
	
}
