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
public class AwsResourceEventsRule {

    /**
     * Describes which events CloudWatch Events routes to the specified target. These routed events are matched events. For more information, see Events and Event Patterns in the Amazon CloudWatch User Guide. 
     */
    private String EventPattern;

    /**
     * The schedule or rate (frequency) that determines when CloudWatch Events runs the rule. For more information, see Schedule Expression Syntax for Rules in the Amazon CloudWatch User Guide. 
     */
    private String ScheduleExpression;

    /**
     * A description of the rule's purpose. 
     */
    private String Description;

    /**
     * Indicates whether the rule is enabled. For valid values, see the State parameter for the PutRule action in the Amazon CloudWatch Events API Reference. 
     */
    private String State;

    /**
     * The resources, such as Lambda functions or Kinesis streams, that CloudWatch Events routes events to and invokes when the rule is triggered. For information about valid targets, see the PutTargets action in the Amazon CloudWatch Events API Reference. 
     */
    private String Targets;

    /**
     * A name for the rule. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the rule name. For more information, see Name Type. 
     */
    private String Name;

    /**
     * @return the EventPattern
     */
    public String getEventPattern() {
        return EventPattern;
    }

    /**
     * @param EventPattern the EventPattern to set
     */
    public void setEventPattern(String EventPattern) {
	this.EventPattern = EventPattern;
    }

    /**
     * @return the ScheduleExpression
     */
    public String getScheduleExpression() {
        return ScheduleExpression;
    }

    /**
     * @param ScheduleExpression the ScheduleExpression to set
     */
    public void setScheduleExpression(String ScheduleExpression) {
	this.ScheduleExpression = ScheduleExpression;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
	this.Description = Description;
    }

    /**
     * @return the State
     */
    public String getState() {
        return State;
    }

    /**
     * @param State the State to set
     */
    public void setState(String State) {
	this.State = State;
    }

    /**
     * @return the Targets
     */
    public String getTargets() {
        return Targets;
    }

    /**
     * @param Targets the Targets to set
     */
    public void setTargets(String Targets) {
	this.Targets = Targets;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
	this.Name = Name;
    }


}