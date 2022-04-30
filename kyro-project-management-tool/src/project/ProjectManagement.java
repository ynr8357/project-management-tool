package project;

import beans.BusinessTeam;
import beans.DesignTeam;
import beans.DevelopmentTeam;
import beans.PlatformTeam;
import beans.TestTeam;

/**
 * 
 * ProjectManagement class having the logic of project management having the
 * dependencies of teams and the task to do by the teams.
 */
public class ProjectManagement {
	
	/**
	 * Creating a property to hold the value for userStoryCompleted or not
	 */
	private boolean isUserStoreCompleted;
	
	/**
	 * Create a dependency for BusimessTeam who is responsible
	 * to get problem/enhancement from business
	 */
	private BusinessTeam businessTeam;
	
	/**
	 * Create a dependency for DesignTeam who is responsible
	 * to implement process specification for the dev team
	 */
	private DesignTeam designTeam;
	
	/**
	 * Create a dependency for DevelopmentTeam who is responsible
	 * to implement code change
	 */
	private DevelopmentTeam devTeam;
	
	/**
	 * Create a dependency for PlatformTeam who is responsible
	 * to deploy the code change
	 */
	private PlatformTeam platformTeam;
	
	/**
	 * Create a dependency for TestTeam who is responsible
	 * to test change
	 */
	private TestTeam testTeam;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Method to check if we get requirement from business
	public Boolean isRequirementAvailable(BusinessTeam requirement) {
		
		//This method contains the logic of Business team, how much time it takes to complete task and if it is completed the
		// task or not. It also return the task completed flag to the called method
		return true;
		
	}
	
	//Method to check if we get requirement from business team
	public Boolean isDesignTaskDone(DesignTeam soluctionDoc) {
		
		//This method contains the logic of Design team, how much time it takes to complete task
		//Also this method set the flag of the design task completed or not and return the process spec
		return true;
		
	}
	
	//Method to check if we get requirement from design team and return the flag 
	//if dev work completed in given time or not
	public Boolean isDevDone(DesignTeam soluctionDoc) {
		
		//This method contains the logic of Design team, how much time it takes to complete task
		//Also this method set the flag of the design task completed or not and return the process spec
		return true;
		
	}
	
	//Method to check if we get requirement from business team
	public Boolean isDeploymentDone(DevelopmentTeam devTask) {
		
		//This method contains the logic of Design team, how much time it takes to complete task
		//Also this method set the flag of the design task completed or not and return the process spec
		return true;
		
	}
	
	//Method to check if we get requirement from business team
	public Boolean isTestCompleted(PlatformTeam depoyment) {
		
		//This method contains the logic of Design team, how much time it takes to complete task
		//Also this method set the flag of the design task completed or not and return the process spec
		return true;
		
	}
	
	public BusinessTeam getBusinessTeam() {
		return businessTeam;
	}

	public void setBusinessTeam(BusinessTeam businessTeam) {
		this.businessTeam = businessTeam;
	}

	public DesignTeam getDesignTeam() {
		return designTeam;
	}

	public void setDesignTeam(DesignTeam designTeam) {
		this.designTeam = designTeam;
	}

	public DevelopmentTeam getDevTeam() {
		return devTeam;
	}

	public void setDevTeam(DevelopmentTeam devTeam) {
		this.devTeam = devTeam;
	}

	public PlatformTeam getPlatformTeam() {
		return platformTeam;
	}

	public void setPlatformTeam(PlatformTeam platformTeam) {
		this.platformTeam = platformTeam;
	}

	public TestTeam getTestTeam() {
		return testTeam;
	}

	public void setTestTeam(TestTeam testTeam) {
		this.testTeam = testTeam;
	}

}
