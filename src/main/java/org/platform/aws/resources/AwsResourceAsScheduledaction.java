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
public class AwsResourceAsScheduledaction {

    /**
     * The minimum number of Amazon EC2 instances in the Auto Scaling group. At least one of MaxSize, MinSize, or DesiredCapacity must be specified. 
     */
    private String MinSize;

    /**
     * The time in UTC when recurring future actions will start. You specify the start time by following the Unix cron syntax format. For more information about cron syntax, go to http://en.wikipedia.org/wiki/Cron. 
     */
    private String Recurrence;

    /**
     * The time in UTC for this schedule to end. For example, 2010-06-01T00:00:00Z. 
     */
    private String EndTime;

    /**
     * The name or ARN of the Auto Scaling group. 
     */
    private String AutoScalingGroupName;

    /**
     * The time in UTC for this schedule to start. For example, 2010-06-01T00:00:00Z. 
     */
    private String StartTime;

    /**
     * The number of Amazon EC2 instances that should be running in the Auto Scaling group. At least one of MaxSize, MinSize, or DesiredCapacity must be specified. 
     */
    private String DesiredCapacity;

    /**
     * The maximum number of Amazon EC2 instances in the Auto Scaling group. At least one of MaxSize, MinSize, or DesiredCapacity must be specified. 
     */
    private String MaxSize;

    /**
     * @return the MinSize
     */
    public String getMinSize() {
        return MinSize;
    }

    /**
     * @param MinSize the MinSize to set
     */
    public void setMinSize(String MinSize) {
	this.MinSize = MinSize;
    }

    /**
     * @return the Recurrence
     */
    public String getRecurrence() {
        return Recurrence;
    }

    /**
     * @param Recurrence the Recurrence to set
     */
    public void setRecurrence(String Recurrence) {
	this.Recurrence = Recurrence;
    }

    /**
     * @return the EndTime
     */
    public String getEndTime() {
        return EndTime;
    }

    /**
     * @param EndTime the EndTime to set
     */
    public void setEndTime(String EndTime) {
	this.EndTime = EndTime;
    }

    /**
     * @return the AutoScalingGroupName
     */
    public String getAutoScalingGroupName() {
        return AutoScalingGroupName;
    }

    /**
     * @param AutoScalingGroupName the AutoScalingGroupName to set
     */
    public void setAutoScalingGroupName(String AutoScalingGroupName) {
	this.AutoScalingGroupName = AutoScalingGroupName;
    }

    /**
     * @return the StartTime
     */
    public String getStartTime() {
        return StartTime;
    }

    /**
     * @param StartTime the StartTime to set
     */
    public void setStartTime(String StartTime) {
	this.StartTime = StartTime;
    }

    /**
     * @return the DesiredCapacity
     */
    public String getDesiredCapacity() {
        return DesiredCapacity;
    }

    /**
     * @param DesiredCapacity the DesiredCapacity to set
     */
    public void setDesiredCapacity(String DesiredCapacity) {
	this.DesiredCapacity = DesiredCapacity;
    }

    /**
     * @return the MaxSize
     */
    public String getMaxSize() {
        return MaxSize;
    }

    /**
     * @param MaxSize the MaxSize to set
     */
    public void setMaxSize(String MaxSize) {
	this.MaxSize = MaxSize;
    }


}