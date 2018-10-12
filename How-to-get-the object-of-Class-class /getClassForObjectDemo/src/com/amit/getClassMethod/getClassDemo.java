package com.amit.getClassMethod;

public class getClassDemo {
	
	public static void main(String[] args) {
		
		Employee student = new Employee("Amit", 25);

        /*
         * Returns:The Class object that represents the runtime class of this
         * object.
         */
        Class<? extends Employee> classObj = student.getClass();
        System.out.println(classObj.getName());
			
	}

}
