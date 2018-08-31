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
public class AwsResourceCodedeployDeploymentgroup {

    /**
     * The name of an existing AWS CodeDeploy application to associate this deployment group with. 
     */
    private String ApplicationName;

    /**
     * Attributes that determine the type of deployment to run and whether to route deployment traffic behind a load balancer. 
     */
    private String DeploymentStyle;

    /**
     * A service role Amazon Resource Name (ARN) that grants AWS CodeDeploy permission to make calls to AWS services on your behalf. For more information, see Create a Service Role for AWS CodeDeploy in the AWS CodeDeploy User Guide. 
     */
    private String ServiceRoleArn;

    /**
     * A list of associated Auto Scaling groups that AWS CodeDeploy automatically deploys revisions to when new instances are created. Duplicates are not allowed. 
     */
    private String AutoScalingGroups;

    /**
     * Information about the notification triggers for the deployment group. Duplicates are not allowed. 
     */
    private String TriggerConfigurations;

    /**
     * The application revision to deploy to this deployment group. If you specify this property, your target application revision will be deployed as soon as the provisioning process is complete. If you specify this property, don't specify the AutoRollbackConfiguration property. 
     */
    private String Deployment;

    /**
     * A deployment configuration name or a predefined configuration name. With predefined configurations, you can deploy application revisions to one instance at a time, half of the instances at a time, or all the instances at once. For more information and valid values, see Working with Deployment Configurations in the AWS CodeDeploy User Guide. 
     */
    private String DeploymentConfigName;

    /**
     * Information about the Amazon CloudWatch alarms that are associated with the deployment group. 
     */
    private String AlarmConfiguration;

    /**
     * The EC2 tags that are already applied to EC2 instances that you want to include in the deployment group. AWS CodeDeploy includes all EC2 instances identified by any of the tags you specify in this deployment group. Duplicates are not allowed. 
     */
    private String Ec2TagFilters;

    /**
     * Information about the automatic rollback configuration that is associated with the deployment group. If you specify this property, don't specify the Deployment property. 
     */
    private String AutoRollbackConfiguration;

    /**
     * Information about the load balancer used in the deployment. For more information, see Integrating AWS CodeDeploy with Elastic Load Balancing in the AWS CodeDeploy User Guide. 
     */
    private String LoadBalancerInfo;

    /**
     * A name for the deployment group. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the deployment group name. For more information, see Name Type. 
     */
    private String DeploymentGroupName;

    /**
     * The on-premises instance tags already applied to on-premises instances that you want to include in the deployment group. AWS CodeDeploy includes all on-premises instances identified by any of the tags you specify in this deployment group. To register on-premises instances with AWS CodeDeploy, see Working with On-Premises Instances for AWS CodeDeploy in the AWS CodeDeploy User Guide. Duplicates are not allowed. 
     */
    private String OnPremisesInstanceTagFilters;

    /**
     * @return the ApplicationName
     */
    public String getApplicationName() {
        return ApplicationName;
    }

    /**
     * @param ApplicationName the ApplicationName to set
     */
    public void setApplicationName(String ApplicationName) {
	this.ApplicationName = ApplicationName;
    }

    /**
     * @return the DeploymentStyle
     */
    public String getDeploymentStyle() {
        return DeploymentStyle;
    }

    /**
     * @param DeploymentStyle the DeploymentStyle to set
     */
    public void setDeploymentStyle(String DeploymentStyle) {
	this.DeploymentStyle = DeploymentStyle;
    }

    /**
     * @return the ServiceRoleArn
     */
    public String getServiceRoleArn() {
        return ServiceRoleArn;
    }

    /**
     * @param ServiceRoleArn the ServiceRoleArn to set
     */
    public void setServiceRoleArn(String ServiceRoleArn) {
	this.ServiceRoleArn = ServiceRoleArn;
    }

    /**
     * @return the AutoScalingGroups
     */
    public String getAutoScalingGroups() {
        return AutoScalingGroups;
    }

    /**
     * @param AutoScalingGroups the AutoScalingGroups to set
     */
    public void setAutoScalingGroups(String AutoScalingGroups) {
	this.AutoScalingGroups = AutoScalingGroups;
    }

    /**
     * @return the TriggerConfigurations
     */
    public String getTriggerConfigurations() {
        return TriggerConfigurations;
    }

    /**
     * @param TriggerConfigurations the TriggerConfigurations to set
     */
    public void setTriggerConfigurations(String TriggerConfigurations) {
	this.TriggerConfigurations = TriggerConfigurations;
    }

    /**
     * @return the Deployment
     */
    public String getDeployment() {
        return Deployment;
    }

    /**
     * @param Deployment the Deployment to set
     */
    public void setDeployment(String Deployment) {
	this.Deployment = Deployment;
    }

    /**
     * @return the DeploymentConfigName
     */
    public String getDeploymentConfigName() {
        return DeploymentConfigName;
    }

    /**
     * @param DeploymentConfigName the DeploymentConfigName to set
     */
    public void setDeploymentConfigName(String DeploymentConfigName) {
	this.DeploymentConfigName = DeploymentConfigName;
    }

    /**
     * @return the AlarmConfiguration
     */
    public String getAlarmConfiguration() {
        return AlarmConfiguration;
    }

    /**
     * @param AlarmConfiguration the AlarmConfiguration to set
     */
    public void setAlarmConfiguration(String AlarmConfiguration) {
	this.AlarmConfiguration = AlarmConfiguration;
    }

    /**
     * @return the Ec2TagFilters
     */
    public String getEc2TagFilters() {
        return Ec2TagFilters;
    }

    /**
     * @param Ec2TagFilters the Ec2TagFilters to set
     */
    public void setEc2TagFilters(String Ec2TagFilters) {
	this.Ec2TagFilters = Ec2TagFilters;
    }

    /**
     * @return the AutoRollbackConfiguration
     */
    public String getAutoRollbackConfiguration() {
        return AutoRollbackConfiguration;
    }

    /**
     * @param AutoRollbackConfiguration the AutoRollbackConfiguration to set
     */
    public void setAutoRollbackConfiguration(String AutoRollbackConfiguration) {
	this.AutoRollbackConfiguration = AutoRollbackConfiguration;
    }

    /**
     * @return the LoadBalancerInfo
     */
    public String getLoadBalancerInfo() {
        return LoadBalancerInfo;
    }

    /**
     * @param LoadBalancerInfo the LoadBalancerInfo to set
     */
    public void setLoadBalancerInfo(String LoadBalancerInfo) {
	this.LoadBalancerInfo = LoadBalancerInfo;
    }

    /**
     * @return the DeploymentGroupName
     */
    public String getDeploymentGroupName() {
        return DeploymentGroupName;
    }

    /**
     * @param DeploymentGroupName the DeploymentGroupName to set
     */
    public void setDeploymentGroupName(String DeploymentGroupName) {
	this.DeploymentGroupName = DeploymentGroupName;
    }

    /**
     * @return the OnPremisesInstanceTagFilters
     */
    public String getOnPremisesInstanceTagFilters() {
        return OnPremisesInstanceTagFilters;
    }

    /**
     * @param OnPremisesInstanceTagFilters the OnPremisesInstanceTagFilters to set
     */
    public void setOnPremisesInstanceTagFilters(String OnPremisesInstanceTagFilters) {
	this.OnPremisesInstanceTagFilters = OnPremisesInstanceTagFilters;
    }


}