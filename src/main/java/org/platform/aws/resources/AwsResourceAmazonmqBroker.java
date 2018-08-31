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
public class AwsResourceAmazonmqBroker {

    /**
     * The list of rules (1 minimum, 125 maximum) that authorize connections to brokers. 
     */
    private String SecurityGroups;

    /**
     * The version of the broker engine. 
     */
    private String EngineVersion;

    /**
     * The broker configuration. If no configuration exists for a broker, Amazon MQ creates a default configuration. 
     */
    private String Configuration;

    /**
     * The parameters that determine the WeeklyStartTime. 
     */
    private String MaintenanceWindowStartTime;

    /**
     * The broker's instance type. For more information, see Instance Types in the Amazon MQ Developer Guide. 
     */
    private String HostInstanceType;

    /**
     * Enables automatic upgrades to new minor versions for brokers, as Apache releases the versions. The automatic upgrades occur during the maintenance window of the broker or after a manual broker reboot. 
     */
    private String AutoMinorVersionUpgrade;

    /**
     * The list of all ActiveMQ usernames for the specified broker. 
     */
    private String Users;

    /**
     * The Amazon CloudWatch Logs configuration for the broker. 
     */
    private String Logs;

    /**
     * The list of groups (2 maximum) that define which subnets and IP ranges the broker can use from different Availability Zones. A SINGLE_INSTANCE deployment requires one subnet (for example, the default subnet). An ACTIVE_STANDBY_MULTI_AZ deployment requires two subnets. 
     */
    private String SubnetIds;

    /**
     * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters. 
     */
    private String BrokerName;

    /**
     * The deployment mode of the broker. SINGLE_INSTANCE creates a single-instance broker in a single Availability Zone. ACTIVE_STANDBY_MULTI_AZ creates an active/standby broker for high availability. 
     */
    private String DeploymentMode;

    /**
     * The type of broker engine. 
     */
    private String EngineType;

    /**
     * Enables connections from applications outside of the VPC that hosts the broker's subnets. 
     */
    private String PubliclyAccessible;

    /**
     * @return the SecurityGroups
     */
    public String getSecurityGroups() {
        return SecurityGroups;
    }

    /**
     * @param SecurityGroups the SecurityGroups to set
     */
    public void setSecurityGroups(String SecurityGroups) {
	this.SecurityGroups = SecurityGroups;
    }

    /**
     * @return the EngineVersion
     */
    public String getEngineVersion() {
        return EngineVersion;
    }

    /**
     * @param EngineVersion the EngineVersion to set
     */
    public void setEngineVersion(String EngineVersion) {
	this.EngineVersion = EngineVersion;
    }

    /**
     * @return the Configuration
     */
    public String getConfiguration() {
        return Configuration;
    }

    /**
     * @param Configuration the Configuration to set
     */
    public void setConfiguration(String Configuration) {
	this.Configuration = Configuration;
    }

    /**
     * @return the MaintenanceWindowStartTime
     */
    public String getMaintenanceWindowStartTime() {
        return MaintenanceWindowStartTime;
    }

    /**
     * @param MaintenanceWindowStartTime the MaintenanceWindowStartTime to set
     */
    public void setMaintenanceWindowStartTime(String MaintenanceWindowStartTime) {
	this.MaintenanceWindowStartTime = MaintenanceWindowStartTime;
    }

    /**
     * @return the HostInstanceType
     */
    public String getHostInstanceType() {
        return HostInstanceType;
    }

    /**
     * @param HostInstanceType the HostInstanceType to set
     */
    public void setHostInstanceType(String HostInstanceType) {
	this.HostInstanceType = HostInstanceType;
    }

    /**
     * @return the AutoMinorVersionUpgrade
     */
    public String getAutoMinorVersionUpgrade() {
        return AutoMinorVersionUpgrade;
    }

    /**
     * @param AutoMinorVersionUpgrade the AutoMinorVersionUpgrade to set
     */
    public void setAutoMinorVersionUpgrade(String AutoMinorVersionUpgrade) {
	this.AutoMinorVersionUpgrade = AutoMinorVersionUpgrade;
    }

    /**
     * @return the Users
     */
    public String getUsers() {
        return Users;
    }

    /**
     * @param Users the Users to set
     */
    public void setUsers(String Users) {
	this.Users = Users;
    }

    /**
     * @return the Logs
     */
    public String getLogs() {
        return Logs;
    }

    /**
     * @param Logs the Logs to set
     */
    public void setLogs(String Logs) {
	this.Logs = Logs;
    }

    /**
     * @return the SubnetIds
     */
    public String getSubnetIds() {
        return SubnetIds;
    }

    /**
     * @param SubnetIds the SubnetIds to set
     */
    public void setSubnetIds(String SubnetIds) {
	this.SubnetIds = SubnetIds;
    }

    /**
     * @return the BrokerName
     */
    public String getBrokerName() {
        return BrokerName;
    }

    /**
     * @param BrokerName the BrokerName to set
     */
    public void setBrokerName(String BrokerName) {
	this.BrokerName = BrokerName;
    }

    /**
     * @return the DeploymentMode
     */
    public String getDeploymentMode() {
        return DeploymentMode;
    }

    /**
     * @param DeploymentMode the DeploymentMode to set
     */
    public void setDeploymentMode(String DeploymentMode) {
	this.DeploymentMode = DeploymentMode;
    }

    /**
     * @return the EngineType
     */
    public String getEngineType() {
        return EngineType;
    }

    /**
     * @param EngineType the EngineType to set
     */
    public void setEngineType(String EngineType) {
	this.EngineType = EngineType;
    }

    /**
     * @return the PubliclyAccessible
     */
    public String getPubliclyAccessible() {
        return PubliclyAccessible;
    }

    /**
     * @param PubliclyAccessible the PubliclyAccessible to set
     */
    public void setPubliclyAccessible(String PubliclyAccessible) {
	this.PubliclyAccessible = PubliclyAccessible;
    }


}