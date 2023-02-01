package main;

import frame.Frame_Base;
import frame.Frame_Login;
import frame.Frame_MyPage;

public class Together_Main {

	public static void main(String[] args) {

		Frame_Base.getInstance(new Frame_Login());
		
	}

}
