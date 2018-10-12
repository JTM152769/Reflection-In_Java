package com.amit.dotClassForObjectDemo;

public class dotClassDemo {
	
	public static void main(String[] args)
    {
        /*
         * If a type is available but there is no instance then it is possible
         * to obtain a Class by appending ".class" to the name of the type.It
         * can be used for primitive data type also.
         */
        Class<Employee> _emp = Employee.class;
        System.out.println(_emp.getName());

        Class<Integer> _intClassObj = int.class;
        System.out.println(_intClassObj.getName());
        
        Class<Float> _floatClassObj = float.class;
        System.out.println(_floatClassObj.getName());
    }

}
