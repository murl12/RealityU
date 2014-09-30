package obj;

import dao.GroupsDAO;
import dao.SurveysDAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author James Hammond, SSR5
 * Create Date: 09/28/2014
 */

/**
 * This class will be able to create and delete a test group 
 * filled with test surveys that will have default information
 * in most fields. 
 * This class was created for the purposes of testing the
 * survey processing classes.
 */
public class CreateTestGroup {
	
	// properties for testGroup1 creation
	
	String groupName = "testGroup1";
	String created = "";
	String modified = "";
	String highSchool = "testSchool";
	String teacher = "mr.Test";
	String classPeriod = "testPeriod";
	String surveyStartDate = "";
	String surveyEndDate = "";
	String eventDate = "";
	String studentAccessCode = "Test1";
	
	// create GroupsDAO object to be used with createGroup() 
	// and deleteGroup() methods
	GroupsDAO testGroupDao = new GroupsDAO();
	
	// create a SurveysDAO object to be used with 
	// createSurveys() method
	SurveysDAO testSurveysDao = new SurveysDAO();
	
	/**
	 * creatGroup()
	 * This is for creating a test group to be filled with 
	 * test surveys.
	 * Fill properties of testGroup1 with values pulled from 
	 * the data base.
	 */
	public Group createGroup(){
		// add group data to the database
		int rows = testGroupDao.insert(groupName, created, modified, highSchool, 
				teacher, classPeriod, surveyStartDate, surveyEndDate,
				eventDate, studentAccessCode);
		System.out.println("Inserted "+ rows + "rows.");
		// create a group object with GroupsDAO.find(String) method
		Group testGroup1 = new Group();
		testGroup1 = testGroupDao.find(studentAccessCode);
		// display group data on console
		testGroup1.display();
		return testGroup1;
	}// end create group
	
	/**
	 * deleteGroup(Group)
	 * This is meant to clear the group data to allow for
	 * a new test group to be made.
	 * Removes a desired groups data, from the database.
	 * Pass in the group object to be deleted.
	 * Uses delete method from GroupsDAO.
	 * Resets Group object's variables to default values.
	 * @param testGroup
	 */
	public void deleteGroup(Group testGroup){
		// Use delete function from GroupDAO,
		// use method parameter Group testGroup.
		testGroupDao.delete(testGroup);
		// Assign testGroup to a new Group object,
		// to reset values to default.
		testGroup = new Group();
		
	}// end delete group
	
	/**
	 * createSurveys() will create 24 surveys that belong
	 * to the same test group created with the createGroup
	 * method. The surveys have some similar information, 
	 * with varying values for GPA, Marriage, Schooling and
	 * career choices.
	 * This method is meant to create surveys with many
	 * different values in order to test as many possibilities
	 * as possible.
	 * This method will return a Survey List so to be used
	 * with the processSurveys classes
	 * TODO Randomize Education
	 * TODO Randomize prefJob
	 * TODO Randomize Married
	 * TODO Randomize Children
	 * TODO Randomize numChild
	 * TODO Randomize cCards
	 * TODO Randomize cCardsUses
	 * TODO Randomize groceries
	 * TODO Randomize clothing
	 * TODO Randomize save
	 */
	public List<Survey> createSurveys(){
		// create a Random object for use with the GPA
		Random random = new Random();
		// assign a variable to type student,
		// you could do it inside the for loop if preferred
		Survey student;
		// Start a loop that repeats 24 times, each repetition
		// will create a new student object and insert it into
		// the database
		List<Survey> surveyList = new ArrayList<>();
		for(int i=0; i<24; i++){
			
			String gender;
			// Randomly generate a number to put in if statements
			// to assign a random gender
			int x = random.nextInt(2);
			if(x == 0)
				gender = "Male";
			else
				gender = "Female";
			// Reset random object variable for next use.
			// Note that this may not be necessary.
			random = new Random();
			
			// have a new random double generated each time through
			// the loop for a random gpa each time.
			double gpa = 0.5 + (4.0 - 0.5) * random.nextDouble();
			
			// Make a new object each time through loop, tag the 
			// incrementing i variable to the end of names to
			// avoid having too much redundant information.
			student = new Survey(0,"fName"+i,"lName"+i,"01/01/2001"+i,gpa,
						gender, 8, "education", "prefJob","job",
						"married", 0, "Children", 0, "cCards","cCardUses",
						"groceries","clothing", "home", "vehicle", 0.0, 0.0,
						"Save","fun");
			
			// add the new student survey to the survey list
			surveyList.add(student);
			
		}//end for loop
		return surveyList;
	}// end create surveys
	
	public static void main(String[] args){
//		CreateTestGroup ctg = new CreateTestGroup();
//	// test create group and delete group.
//	// should add a group to the database
//		Group testGroup = ctg.createGroup();
//	// should delete test group from the database
//		ctg.deleteGroup(testGroup);
		
		
//		// test random gender
//		// should randomly output 0male or 1female to console
//		String gender;
//		Random random = new Random();
//		int x = random.nextInt(2);
//		System.out.print(" "+x);
//		if(x == 0)
//			gender = "Male";
//		else
//			gender = "Female";
//		System.out.println(gender);
//		x=0;
		
//		// test random gpa
//		// should output a double between 0.5 and 4.0
//		double randomDouble = 0.5 + (4.0 - 0.5) * random.nextDouble();
//		System.out.println("Random double is " + randomDouble);

	}// end main

}// end class
