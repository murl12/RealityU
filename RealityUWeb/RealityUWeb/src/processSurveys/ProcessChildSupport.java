package processSurveys;
/********************************************************************
 *	RealityUWeb: ProcessChildSupport.java
 *	File Created By James Hammond, Team SSR5
 *  File Create date 9/26/2014
 ********************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import obj.Group;
import obj.Survey;
import dao.SurveysDAO;

/**
 * The Class ProcessChildSupport
 */
public class ProcessChildSupport {
	// instantiate ProcessMarried object
	ProcessMarried pm = new ProcessMarried();
	// retrieve list of divorced males from ProcessMarried class
	private List<Survey> listOfDivorcedMales = pm.getDivorcedMales();
	// do the same for females
	private List<Survey> listOfDivorcedFemales = pm.getDivorcedFemales();
	
	/**
	 * Display all divorced males and females to check for correct data.
	 * Used mostly for testing purposes
	 */
	public void displayLists(){
		// use for each loop to cycle through list of divorced male surveys
		for(Survey divMale: listOfDivorcedMales){
			// use display method from survey objects contained in list
			divMale.display();
		}// end for-each
		
		// do the same as above but for females
		for(Survey divFemale: listOfDivorcedFemales){
			divFemale.display();
		}// end for-each
			
		
	}// end displayLists() method
// ================= MAIN METHOD ================================//
	/**
	 * As for now this main method should return a list of all
	 * survey info from all students from group1 that have 
	 * been designated as divorced.
	 * 
	 */
	public static void main(String[] args){
//	create a Survey object list and run the doProcess() method 
// from ProcessMarried class.
		List<Survey> lstSurvey = new ArrayList<Survey>();
//	Create SurveysDAO & Survey Objs
     	SurveysDAO sd = new SurveysDAO();
		lstSurvey = sd.search("groupID", "1");
		lstSurvey = new ProcessMarried().doProcess(lstSurvey);
		ProcessChildSupport pcs = new ProcessChildSupport();
//	run the displayLists() method
		pcs.displayLists();

	}// end main
}// end ProcessChildSupport class

