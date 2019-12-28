import java.util.ArrayList;
import java.util.Arrays;

public class Fix {

	public static void main(String[] args) {
		//OPCODE
		//1 = add
		//2 = mult
		//99 do nothing STOP
		//anything else bail
		

		int[] opCodes = {1,0,0,3,1,1,2,3,1,3,4,3,1,5,0,3,2,1,10,19,1,6,19,23,2,23,6,27,2,6,27,31,2,13,31,35,1,10,35,39,2,39,13,43,1,43,13,47,1,6,47,51,1,10,51,55,2,55,6,59,1,5,59,63,2,9,63,67,1,6,67,71,2,9,71,75,1,6,75,79,2,79,13,83,1,83,10,87,1,13,87,91,1,91,10,95,2,9,95,99,1,5,99,103,2,10,103,107,1,107,2,111,1,111,5,0,99,2,14,0,0};
		
		opCodes[1] = 12;
		opCodes[2] = 2;
		
		for (int i = 0; i <= opCodes.length; i+=4) {
			if (opCodes[i] == 1) {
				opCodes[opCodes[i+3]] = opCodes[opCodes[i+2]] + opCodes[opCodes[i+1]];
			}
			else if (opCodes[i] == 2) {
				opCodes[opCodes[i+3]] = opCodes[opCodes[i+2]] * opCodes[opCodes[i+1]];
			}
			else if (opCodes[i] == 99) {
				System.out.println(Arrays.toString(opCodes));
				System.out.println("Success");
				System.exit(0);
			}
			else {
				System.out.println(Arrays.toString(opCodes));
				System.out.println("Crash");
				System.exit(1);
			}
		}
	}

}
