package project;

import beans.BusinessTeam;

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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
