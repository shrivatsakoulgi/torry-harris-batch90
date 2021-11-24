import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.torryharris.model.Employee;

public class EmpDeserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// De-Serialization
		
				
				String str;
				FileInputStream fis = new FileInputStream("employees.txt");
				ObjectInputStream objectInputStream = new ObjectInputStream(fis);
				System.out.println("\nDe-serialization");
				System.out.println("--- Employee Details read from file---\n");
				
				ArrayList<Employee> empList2 = new ArrayList<Employee>();
				empList2 = (ArrayList<Employee>) objectInputStream.readObject();
//				while(true) {
//					try {
//						Employee e = (Employee) objectInputStream.readObject();
//						System.out.println(e);
//					}catch(EOFException ex) {
//						break;
//					}
//				}
				
				for(Employee e:empList2) {
					System.out.println(e.serialVersionUID);
					System.out.println(e);
				}
				objectInputStream.close();
				fis.close();
	}

}
