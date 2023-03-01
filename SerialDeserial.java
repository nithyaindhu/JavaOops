package com.SerializableDeserializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class SerialDeserial {

	public static void main(String[] args) throws IOException {
		String str ="file.ser";
		Employee emp[] = new Employee[5];
		try {
			FileOutputStream file = new FileOutputStream(str,true);
			ObjectOutputStream obj = new ObjectOutputStream(file);
			for(int i=0;i<5;i++) {
				emp[i]=new Employee(i+1,"Nithya"+i, 21 ,"Female "+i);
			
			}
			//emp[4].gender ="Male";
			for(int i = 0; i<5 ; i++) {
				obj.writeObject(emp[i]);
			}
			
			obj.close();
			file.close();
			System.out.println(Arrays.toString(emp));
			System.out.println("Object is serialized!!!");
		}catch(Exception e) {
			System.out.print(e);
		}
		for(int i = 0; i<5 ; i++) {
			emp[i]=null;
		}

		Employee emp1=null;
		try {
			FileInputStream dfile = new FileInputStream(str);
			ObjectInputStream iobj = new ObjectInputStream(dfile);
			int i = 0;
			try {
				//while(dfile.available()>0){
					emp1 = (Employee) iobj.readObject();
					System.out.println(emp1.getEmpId()+" "+emp1.getEmpName()+" "+ emp1.empAge+ " "+emp1.gender);//transient field can't be serialized
				
//					emp[i] = (Employee) iobj.readObject();
//					System.out.println(emp[i].getEmpId()+" "+emp[i].getEmpName()+" "+
//					emp[i].empAge+ " "+emp[i].gender);//transient field can't be serialized
//					i++;
				//}
				dfile.close();
				iobj.close();
			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.print(e);
		}
		

	}

}
