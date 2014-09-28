package obj;

import dao.GroupsDAO;
import dao.SurveysDAO;

/**
 * 
 * @author James Hammond, SSR5
 * Create Date: 09/28/2014
 */

/**
 * This class will be able to create and delete a test group 
 * of surveys that will have default information in all fields. 
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
	
	// create GroupsDAO object
	GroupsDAO testGroupDao = new GroupsDAO();
	// create Group object
	Group testGroup1 = new Group();
	
	/**
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
		testGroup1 = testGroupDao.find(studentAccessCode);
		// display group data on console
		testGroup1.display();
		return testGroup1;
	}// end create group
	
	/**
	 * deleteGroup()
	 * Removes a desired groups data from database.
	 * Pass in the group object to be deleted.
	 * Uses delete method from GroupsDAO.
	 * Resets Group object's variables to default values.
	 * @param testGroup
	 */
	public void deleteGroup(Group testGroup){
		// Use delete function from GroupDAO,
		// use Group parameter.
		testGroupDao.delete(testGroup);
		// Assign testGroup to a new Group object,
		// to reset values to default.
		testGroup = new Group();
		
	}// end delete group
	
	/**
	 * createSurveys() will create 24 surveys that belong
	 * to the same test group. The surveys have some similar 
	 * information, with varying values for GPA, Marriage,
	 * Schooling and career choices.
	 */
	public void createSurveys(){
		
	}
	
	public static void main(String[] args){
		CreateTestGroup ctg = new CreateTestGroup();

		Group testGroup = ctg.createGroup();
		ctg.deleteGroup(testGroup);

	}// end main
	
}// end class
