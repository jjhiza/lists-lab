package ListLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Driver {
	
	private static String[] firstNames = {"Josh", "John", "Jason", "Dave", "Mike", "Dan", "Gary", "Frank", "Joe",
			"Eric", "Bob", "Kyle", "Bill", "Shane", "Andrew", "Jim", "Doug", "Chris", "Katie", 
			"Kayla", "Sarah", "Elizabeth", "Stef", "Mary", "Jane", "Kelly", "Jessica", "Beth",
			"Carla", "Becky", "Linda", "Ruth", "Sandra", "Amy", "Claire", "Donna"};
	
	private static String[] lastNames = {"Smith", "Davis", "Jones", "Taylor", "Manning", "Jennings", "Williams",
			"Parker", "Elliot", "Patrick", "Johnson", "Davidson", "O'Connor", "Fritz", "Green",
			"Gold", "Foley", "Freeman", "Willis", "Grant"};

	public static void main(String[] args) {
		List<Student> studentArrayList = new ArrayList<>();
		MyLinkedList<Student> studentLinkedList = new MyLinkedList<>();
		
		generateStudents(20, studentArrayList);
		generateStudents(20, studentLinkedList);
		
		//Determine which data structure is fastest for each
		//operation. Complete the action
		
		//Delete the first, if any, Student with the last name of "Smith"
		
		//Change the name of the 3rd entry to "Joe Montana"
		
		//Remove the 10th element

		//Answers:
		// 1. For deleting of the first instance of Student with a lastName of "Smith":
		//      The faster one would be for the array list since it doesn't have to traverse
		//      the items that come before each element checked in each run of the loop
		// 2. For changing the name of the 3rd entry to "Joe Montana"
		//      Still, the array list operation is faster since for the linked list, it
		//      involves traversing the elements from first to third
		// 3. For removing the 10th element
		//      The operation on the array list may be slower because, since we are removing from the
		//      middle, the array list has to reassign every element - that comes after the one
		//      it removed - down one step

		//Delete the first, if any, Student with the last name of "Smith"

		for (int i = 0; i < studentLinkedList.getSize(); i++) {
			if(studentLinkedList.get(i).getLastName().equalsIgnoreCase("Smith")){
				studentLinkedList.remove(i);
				break;
			}
		}
		for (int i = 0; i < studentArrayList.size(); i++) {
			if (studentArrayList.get(i).getLastName().equalsIgnoreCase("Smith")) {
				studentArrayList.remove(i);
				break;
			}
		}

		//Change the name of the 3rd entry to "Joe Montana"
		studentLinkedList.get(2).setFirstName("Joe");
		studentLinkedList.get(2).setLastName("Montana");

		studentArrayList.get(2).setFirstName("Joe");
		studentArrayList.get(2).setLastName("Montana");

		//Remove the 10th element
		studentLinkedList.remove(10);
		studentArrayList.remove(10);

		//print out
		printLinkedNames(studentLinkedList);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		studentLinkedList.add(2, new Student("Jay", "Hiza", 4.0));
		printLinkedNames(studentLinkedList);
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();

//        Iterator itr = studentLinkedList.iterator();
//
//        while(itr.hasNext()){
//            System.out.println("Using iterator");
//            Student student = (Student) itr.next();
//            System.out.println(student.getFirstName() + " " + student.getLastName() + student.getGpa());
//        }
		System.out.println();
		System.out.println("-----------------------------");
		System.out.println();
		printArrayNames(studentArrayList);

	}

	static void printLinkedNames(MyLinkedList<Student> students){
		System.out.println("LinkedList Size: " + students.getSize());
		for (int i = 0; i < students.getSize(); i++) {
			System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
		}
	}

	static void printArrayNames(List<Student> students){
		System.out.println("ArrayList Size: " + students.size());
		for (int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i).getFirstName() + " " + students.get(i).getLastName());
		}
	}

	//To generate the ArrayList
	private static void generateStudents(int numberOfStudents, List<Student> outList) {
		Random random = new Random();

		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));
		}
	}
}
	
	//To generate the ArrayList
	private static void generateStudents(int numberOfStudents, List<Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));	
		}
	}

	//To fill the custom LinkedList
	private static void generateStudents(int numberOfStudents, MyLinkedList<Student> outList) {
		Random random = new Random();
		
		for(int i = 0; i < numberOfStudents; i++) {
			int firstNameIndex = random.nextInt(firstNames.length -1);
			int lastNameIndex = random.nextInt(lastNames.length -1);
			double gpa = 3.5 * random.nextDouble() + 0.5;
			outList.add(new Student(firstNames[firstNameIndex], lastNames[lastNameIndex], gpa));	
		}
	}
}
