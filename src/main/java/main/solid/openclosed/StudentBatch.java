package main.solid.openclosed;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class StudentBatch {
	private List<Student> studentList;

	public StudentBatch() {
		studentList = new ArrayList<Student>();
	}

	//public void getStudentMarkMap(Map<Integer, Double> studentMarkMap)
	public void getStudentMarkMap(Hashtable<Integer, Double> studentMarkMap) {
		if (studentMarkMap == null) {
			//Error
		} else {
			for (Student student : studentList) {
				studentMarkMap.put(student.uid, student.percentage);
			}
		}
	}

	/**
	 * @param studentList the studentList to set
	 */
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

}
