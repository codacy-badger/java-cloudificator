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
public class AwsResourceEcsService {

    /**
     * The platform version on which to run your service. If one is not specified, the latest version will be used by default. 
     */
    private String PlatformVersion;

    /**
     * The period of time, in seconds, that the Amazon ECS service scheduler ignores unhealthy Elastic Load Balancing target health checks after a task has first started. 
     */
    private String HealthCheckGracePeriodSeconds;

    /**
     * The placement constraints for the tasks in the service. 
     */
    private String PlacementConstraints;

    /**
     * The name or Amazon Resource Name (ARN) of the cluster that you want to run your Amazon ECS service on. If you do not specify a cluster, Amazon ECS uses the default cluster. 
     */
    private String Cluster;

    /**
     * A list of load balancer objects to associate with the cluster. If you specify the Role property, LoadBalancers must be specified as well. For information about the number of load balancers that you can specify per service, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. 
     */
    private String LoadBalancers;

    /**
     * The number of simultaneous tasks that you want to run on the cluster. Specify the tasks with the TaskDefinition property. 
     */
    private String DesiredCount;

    /**
     * The placement strategies that determine how tasks for the service are placed. 
     */
    private String PlacementStrategies;

    /**
     * Details of the service registry. 
     */
    private String ServiceRegistries;

    /**
     * The launch type on which to run your service. If one is not specified, EC2 will be used by default. Valid values include EC2 and FARGATE. 
     */
    private String LaunchType;

    /**
     * The name or ARN of an AWS Identity and Access Management (IAM) role that allows your Amazon ECS container agent to make calls to your load balancer. 
     */
    private String Role;

    /**
     * The ARN of the task definition (including the revision number) that you want to run on the cluster, such as arn:aws:ecs:us-east-1:123456789012:task-definition/mytask:3. You can't use :latest to specify a revision because it's ambiguous. For example, if AWS CloudFormation needed to roll back an update, it wouldn't know which revision to roll back to. 
     */
    private String TaskDefinition;

    /**
     * The name of your service. The name is limited to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores. Service names must be unique within a cluster, but you can have similarly named services in multiple clusters within a region or across multiple regions. 
     */
    private String ServiceName;

    /**
     * The network configuration for the service. This parameter is required for task definitions that use the awsvpc network mode to receive their own Elastic Network Interface, and it is not supported for other network modes. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide. 
     */
    private String NetworkConfiguration;

    /**
     * Configures how many tasks run during a deployment. 
     */
    private String DeploymentConfiguration;

    /**
     * @return the PlatformVersion
     */
    public String getPlatformVersion() {
        return PlatformVersion;
    }

    /**
     * @param PlatformVersion the PlatformVersion to set
     */
    public void setPlatformVersion(String PlatformVersion) {
	this.PlatformVersion = PlatformVersion;
    }

    /**
     * @return the HealthCheckGracePeriodSeconds
     */
    public String getHealthCheckGracePeriodSeconds() {
        return HealthCheckGracePeriodSeconds;
    }

    /**
     * @param HealthCheckGracePeriodSeconds the HealthCheckGracePeriodSeconds to set
     */
    public void setHealthCheckGracePeriodSeconds(String HealthCheckGracePeriodSeconds) {
	this.HealthCheckGracePeriodSeconds = HealthCheckGracePeriodSeconds;
    }

    /**
     * @return the PlacementConstraints
     */
    public String getPlacementConstraints() {
        return PlacementConstraints;
    }

    /**
     * @param PlacementConstraints the PlacementConstraints to set
     */
    public void setPlacementConstraints(String PlacementConstraints) {
	this.PlacementConstraints = PlacementConstraints;
    }

    /**
     * @return the Cluster
     */
    public String getCluster() {
        return Cluster;
    }

    /**
     * @param Cluster the Cluster to set
     */
    public void setCluster(String Cluster) {
	this.Cluster = Cluster;
    }

    /**
     * @return the LoadBalancers
     */
    public String getLoadBalancers() {
        return LoadBalancers;
    }

    /**
     * @param LoadBalancers the LoadBalancers to set
     */
    public void setLoadBalancers(String LoadBalancers) {
	this.LoadBalancers = LoadBalancers;
    }

    /**
     * @return the DesiredCount
     */
    public String getDesiredCount() {
        return DesiredCount;
    }

    /**
     * @param DesiredCount the DesiredCount to set
     */
    public void setDesiredCount(String DesiredCount) {
	this.DesiredCount = DesiredCount;
    }

    /**
     * @return the PlacementStrategies
     */
    public String getPlacementStrategies() {
        return PlacementStrategies;
    }

    /**
     * @param PlacementStrategies the PlacementStrategies to set
     */
    public void setPlacementStrategies(String PlacementStrategies) {
	this.PlacementStrategies = PlacementStrategies;
    }

    /**
     * @return the ServiceRegistries
     */
    public String getServiceRegistries() {
        return ServiceRegistries;
    }

    /**
     * @param ServiceRegistries the ServiceRegistries to set
     */
    public void setServiceRegistries(String ServiceRegistries) {
	this.ServiceRegistries = ServiceRegistries;
    }

    /**
     * @return the LaunchType
     */
    public String getLaunchType() {
        return LaunchType;
    }

    /**
     * @param LaunchType the LaunchType to set
     */
    public void setLaunchType(String LaunchType) {
	this.LaunchType = LaunchType;
    }

    /**
     * @return the Role
     */
    public String getRole() {
        return Role;
    }

    /**
     * @param Role the Role to set
     */
    public void setRole(String Role) {
	this.Role = Role;
    }

    /**
     * @return the TaskDefinition
     */
    public String getTaskDefinition() {
        return TaskDefinition;
    }

    /**
     * @param TaskDefinition the TaskDefinition to set
     */
    public void setTaskDefinition(String TaskDefinition) {
	this.TaskDefinition = TaskDefinition;
    }

    /**
     * @return the ServiceName
     */
    public String getServiceName() {
        return ServiceName;
    }

    /**
     * @param ServiceName the ServiceName to set
     */
    public void setServiceName(String ServiceName) {
	this.ServiceName = ServiceName;
    }

    /**
     * @return the NetworkConfiguration
     */
    public String getNetworkConfiguration() {
        return NetworkConfiguration;
    }

    /**
     * @param NetworkConfiguration the NetworkConfiguration to set
     */
    public void setNetworkConfiguration(String NetworkConfiguration) {
	this.NetworkConfiguration = NetworkConfiguration;
    }

    /**
     * @return the DeploymentConfiguration
     */
    public String getDeploymentConfiguration() {
        return DeploymentConfiguration;
    }

    /**
     * @param DeploymentConfiguration the DeploymentConfiguration to set
     */
    public void setDeploymentConfiguration(String DeploymentConfiguration) {
	this.DeploymentConfiguration = DeploymentConfiguration;
    }


}