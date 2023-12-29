package HashMapProject;
import java.util.HashMap;
public class StudentHashMap {
public static void main(String[] args) {
			// student IDs and marks
	        String[] studentIds = {"1", "2", "3", "4"};
	        int[] studentMarks = {90, 78, 85, 98};

	        //HashMap to store student information
	        HashMap<String, Integer> studentMap = new HashMap<>();

	        // Iterate through the arrays and store information in the HashMap
	        for (int i = 0; i < studentIds.length; i++) {
	            String studentId = studentIds[i];
	            int studentMark = studentMarks[i];

	            // Store the information in the HashMap
	            studentMap.put(studentId, studentMark);
	        }

	         //stored values in HashMap
	        System.out.println("Student Information:");
	        for (String id : studentMap.keySet()) {
	            int mark = studentMap.get(id);
	            System.out.println("Student ID: " + id + ", Marks: " + mark);
	        }

	        // Print the size of the HashMap
	        System.out.println("Size of the HashMap: " + studentMap.size());
	    }
	}
