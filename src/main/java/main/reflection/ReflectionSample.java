package main.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionSample {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		try {
			Class c = Class.forName("main.reflection.Employee");
			Method methods[] = c.getDeclaredMethods();
			System.out.println("The employee methods");

			for(int i = 0; i < methods.length; i++) {
				System.out.println("*** Method signature : " + methods[i].toString());
			}

			Class superClass = c.getSuperclass();
			System.out.println("The name of the super Class is " + superClass.getName());
			Method superMethods[] = superClass.getDeclaredMethods();
			System.out.println("The super class has : ");

			for(int i = 0; i < superMethods.length; i++) {
				System.out.println("*** Method signature : " + superMethods.toString());
				System.out.println("   Return type : " + superMethods[i].getReturnType().getName());
			}

			Class parameterTypes[] = new Class[] {String .class};

			@SuppressWarnings("unchecked")
			Method myMethod = c.getMethod("changeAddress", parameterTypes);
			Object arguments[] = new Object[1];
			arguments[0] = "250 Broadway";
			myMethod.invoke(c.newInstance(), arguments);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
	}
}
