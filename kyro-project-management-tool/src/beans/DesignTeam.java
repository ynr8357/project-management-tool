package beans;

import java.util.Date;

public class DesignTeam {
	
	//Creating property for to hold the value of task completion
	private boolean isTaskCompleted;
	
	//Creating a property to hold the value of date of the task picked 
	private Date taskStartDate;
	
	//Creating a property to hold the value of date of the task should be completed 
	private Date taskEndDate;

	public boolean isTaskCompleted() {
		return isTaskCompleted;
	}

	public void setTaskCompleted(boolean isTaskCompleted) {
		this.isTaskCompleted = isTaskCompleted;
	}

	public Date getTaskStartDate() {
		return taskStartDate;
	}

	public void setTaskStartDate(Date taskStartDate) {
		this.taskStartDate = taskStartDate;
	}

	public Date getTaskEndDate() {
		return taskEndDate;
	}

	public void setTaskEndDate(Date taskEndDate) {
		this.taskEndDate = taskEndDate;
	}

	
}
