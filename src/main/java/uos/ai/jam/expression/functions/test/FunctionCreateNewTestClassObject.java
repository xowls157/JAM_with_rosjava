package uos.ai.jam.expression.functions.test;

import test.TestClass;
import uos.ai.jam.Goal;
import uos.ai.jam.Interpreter;
import uos.ai.jam.exception.AgentRuntimeException;
import uos.ai.jam.expression.Binding;
import uos.ai.jam.expression.Expression;
import uos.ai.jam.expression.Function;
import uos.ai.jam.expression.Value;

public class FunctionCreateNewTestClassObject implements Function {
	
	public String getName() {
		return "createNewTestClassObject";
	}

	public Value execute(Interpreter interpreter, Goal currentGoal, Binding binding, Expression... args) throws AgentRuntimeException {
		//
		// Create a TestClass object instance and return it
		//
		// Out:TestClass object
		//
		int arity = (args != null) ? args.length : 0;
		if (arity != 1) {
			System.out.println("Invalid number of arguments: " + arity + " to function \"" + getName() + "\"\n");
			return Value.FALSE;
		}

		Expression protomanExp = args[0];
		TestClass obj = new TestClass();
		binding.setValue(protomanExp, new Value(obj));

		return Value.TRUE;
	}
}
