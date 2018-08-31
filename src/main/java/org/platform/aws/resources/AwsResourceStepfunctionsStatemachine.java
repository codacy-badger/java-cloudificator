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
public class AwsResourceStepfunctionsStatemachine {

    /**
     * The Amazon States Language definition of the state machine. For more information, see Amazon States Language in the AWS Step Functions Developer Guide. 
     */
    private String DefinitionString;

    /**
     * The name of the state machine. If you do not specify a name one will be generated that is similar to MyStateMachine-1234abcdefgh. For more information on creating a valid name see Request Parameters in the AWS Step Functions API Reference. 
     */
    private String StateMachineName;

    /**
     * The Amazon Resource Name (ARN) of the IAM role to use for this state machine. 
     */
    private String RoleArn;

    /**
     * @return the DefinitionString
     */
    public String getDefinitionString() {
        return DefinitionString;
    }

    /**
     * @param DefinitionString the DefinitionString to set
     */
    public void setDefinitionString(String DefinitionString) {
	this.DefinitionString = DefinitionString;
    }

    /**
     * @return the StateMachineName
     */
    public String getStateMachineName() {
        return StateMachineName;
    }

    /**
     * @param StateMachineName the StateMachineName to set
     */
    public void setStateMachineName(String StateMachineName) {
	this.StateMachineName = StateMachineName;
    }

    /**
     * @return the RoleArn
     */
    public String getRoleArn() {
        return RoleArn;
    }

    /**
     * @param RoleArn the RoleArn to set
     */
    public void setRoleArn(String RoleArn) {
	this.RoleArn = RoleArn;
    }


}