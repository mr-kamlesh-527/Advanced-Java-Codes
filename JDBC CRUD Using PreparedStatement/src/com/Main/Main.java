package com.Main;

import com.Controller.DataController;

public class Main {
	public static void main(String[] args)throws Exception {
		DataController dc=new DataController();
		//dc.insert();
		//dc.update();
		//dc.delete();
		dc.select();
	}
}
