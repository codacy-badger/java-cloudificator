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
public class AwsResourceLambdaEventsourcemapping {

    /**
     * The position in a DynamoDB or Kinesis stream where Lambda starts reading. Not required is you set an Amazon SQS queue as the event source. The AT_TIMESTAMP value is supported only for Kinesis streams. For valid values, see CreateEventSourceMapping in the AWS Lambda Developer Guide. 
     */
    private String StartingPosition;

    /**
     * The largest number of records that Lambda retrieves from your event source when invoking your function. Your function receives an event with all the retrieved records. For the default and valid values, see CreateEventSourceMapping in the AWS Lambda Developer Guide. 
     */
    private String BatchSize;

    /**
     * The name or ARN of a Lambda function to invoke when Lambda detects an event on the stream. 
     */
    private String FunctionName;

    /**
     * Indicates whether Lambda begins polling the event source. 
     */
    private String Enabled;

    /**
     * The Amazon Resource Name (ARN) of the event source. Any record added to this stream can invoke the Lambda function. For more information, see CreateEventSourceMapping in the AWS Lambda Developer Guide. 
     */
    private String EventSourceArn;

    /**
     * @return the StartingPosition
     */
    public String getStartingPosition() {
        return StartingPosition;
    }

    /**
     * @param StartingPosition the StartingPosition to set
     */
    public void setStartingPosition(String StartingPosition) {
	this.StartingPosition = StartingPosition;
    }

    /**
     * @return the BatchSize
     */
    public String getBatchSize() {
        return BatchSize;
    }

    /**
     * @param BatchSize the BatchSize to set
     */
    public void setBatchSize(String BatchSize) {
	this.BatchSize = BatchSize;
    }

    /**
     * @return the FunctionName
     */
    public String getFunctionName() {
        return FunctionName;
    }

    /**
     * @param FunctionName the FunctionName to set
     */
    public void setFunctionName(String FunctionName) {
	this.FunctionName = FunctionName;
    }

    /**
     * @return the Enabled
     */
    public String getEnabled() {
        return Enabled;
    }

    /**
     * @param Enabled the Enabled to set
     */
    public void setEnabled(String Enabled) {
	this.Enabled = Enabled;
    }

    /**
     * @return the EventSourceArn
     */
    public String getEventSourceArn() {
        return EventSourceArn;
    }

    /**
     * @param EventSourceArn the EventSourceArn to set
     */
    public void setEventSourceArn(String EventSourceArn) {
	this.EventSourceArn = EventSourceArn;
    }


}