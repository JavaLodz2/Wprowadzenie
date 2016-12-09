package helloworld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("What is your name? ");
        String myName = br.readLine();
		System.out.println("Hello world, "+myName+" welcome in Java.");
	}

}
