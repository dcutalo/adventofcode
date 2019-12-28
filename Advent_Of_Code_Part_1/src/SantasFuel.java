import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class SantasFuel {
	
	public static void main(String[] args) throws IOException {
		try {
			int total = 0;
			int temp = 0;
			String fileName = "src/Untitled 1";
			File santasNumbers = new File(fileName);
			BufferedReader br = new BufferedReader(new FileReader(santasNumbers));
			String cur = "";
			
			while((cur = br.readLine()) != null) {
				temp = Integer.parseInt(cur);
				total += repeatMass(temp);
			}
			System.out.println(total + "meep");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static int repeatMass(int moduleMass) {
		int total = 0;
		int tempMass = moduleMass;
		while (tempMass >= 0) {
			tempMass = (tempMass/3) - 2;
			System.out.println(tempMass);
			
			if (tempMass < 0) {
				return total;
			}
			else {
				total += tempMass;
				System.out.println(total);
			}
		}
		System.out.println(total);
		return total;
	}
}
