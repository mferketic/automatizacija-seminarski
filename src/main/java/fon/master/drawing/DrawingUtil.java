package fon.master.drawing;

public class DrawingUtil {
    public void piramidaZvezdica(int br) {
		for (int i=br; i>0; i--) {
			for(int j=0; j<=br; j++) {
				if(j < i) {
					System.out.print(" ");
				} else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
    }

    public void obrnutaXpiramida(int br) {
		for (int i=0; i<br; i++) {
			for(int j=0; j<br; j++) {
				if(j>=i) {
					System.out.print("x");
				}else {
					System.out.print(" ");
				}
			}
			for(int k=0; k<br; k++) {
				if(k>i) {
					System.out.print("x");
				}
			}
			System.out.println();
		}
    }
}