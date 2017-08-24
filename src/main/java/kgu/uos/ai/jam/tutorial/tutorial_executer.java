package kgu.uos.ai.jam.tutorial;

import uos.ai.jam.Interpreter;
import uos.ai.jam.JAM;

public class tutorial_executer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interpreter i = JAM.parse("tutorial/tutorial_StockRoom/simul");
		i.run();
	}

}
