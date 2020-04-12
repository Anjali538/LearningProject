package com.basic.designpattern.creation.singlton;

import java.io.*;

public class SingletonSerializedTest {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSinglton instanceOne = SerializedSinglton.getInstance();
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
		out.writeObject(instanceOne);
		out.close();
		
		//deserialize it
		ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
		SerializedSinglton instanceTwo = (SerializedSinglton) in.readObject();
		in.close();
		
		System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
		
		
		

	}

}
