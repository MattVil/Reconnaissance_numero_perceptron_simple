package motor;

import gui.WindowGUI;
import perceptron_simple.Network;

public class Run {

	public static void main(String[] args) {
		Network n = new Network(100, 10);
		WindowGUI w = new WindowGUI(n);
		Run r = new Run();
		
//		int[] test = new int[100];
//		for (int i = 0; i < 100; i++) {
//			if(i/10 == 0)
//				test[i] = 1;
//			else
//				test[i] = 0;
//		}
//		
//		int[] result = new int[10];
//		result = n.calculResult(test);
//		
//		System.out.println("");
//		for (int i = 0; i < result.length; i++) {
//			System.out.print(result[i] + " ");
//		}
	}
}
