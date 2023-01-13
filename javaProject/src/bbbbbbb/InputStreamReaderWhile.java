package bbbbbbb;

import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderWhile {

	public static void main(String[] args) {
		int var=0;
		InputStreamReader input= new InputStreamReader(System.in);
		System.out.print("데이터 입력 :");
		try {
			while(true) {
				var=input.read();
				if(var==13)break;
				System.out.println(var+"==>"+(char)var);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
