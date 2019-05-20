package edu.handong.csee.java.example.binarydemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class NumbersDoubledReader {

		// TODO Auto-generated method stub
		ArrayList<Integer> numbersFromBinaryFile = new ArrayList<Integer>();

		public static void main(String[] args) {
			DoublerinLecture21 demonstraotor = new DoublerinLecture21();
			demonstraotor.run();

		}

		public void run() {
			String biranyFileName = "numbersDoubled.dat";
			try {
				ObjectInputStream stream = new ObjectInputStream(new FileInputStream(biranyFileName));
				
				int anInteger = stream.readInt();;
				while(anInteger >=0) {
					numbersFromBinaryFile.add(anInteger);
					anInteger = stream.readInt();
				}
				stream.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
}

