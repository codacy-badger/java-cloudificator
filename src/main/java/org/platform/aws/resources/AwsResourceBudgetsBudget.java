/*******************************************************************************
 * Copyright 2018
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.  You may obtain a copy
 * of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations under
 * the License.
 ******************************************************************************/
package org.platform.aws.resources;

/**
 * Generated class
 */
public class AwsResourceBudgetsBudget {

    /**
     * The notification that you want associated with the budget. A budget can have up to five notifications, and each notification can have one SNS subscriber and up to ten email subscribers. 
     */
    private String NotificationsWithSubscribers;

    /**
     * The budget for tracking your service usage, costs, and RI utilization. Single accounts and master and member accounts in an organization can, by default, create budgets. 
     */
    private String Budget;

    /**
     * @return the NotificationsWithSubscribers
     */
    public String getNotificationsWithSubscribers() {
        return NotificationsWithSubscribers;
    }

    /**
     * @param NotificationsWithSubscribers the NotificationsWithSubscribers to set
     */
    public void setNotificationsWithSubscribers(String NotificationsWithSubscribers) {
	this.NotificationsWithSubscribers = NotificationsWithSubscribers;
    }

    /**
     * @return the Budget
     */
    public String getBudget() {
        return Budget;
    }

    /**
     * @param Budget the Budget to set
     */
    public void setBudget(String Budget) {
	this.Budget = Budget;
    }


}