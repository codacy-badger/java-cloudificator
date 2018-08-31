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
public class AwsResourceEksCluster {

    /**
     * The Kubernetes server version for the cluster. 
     */
    private String Version;

    /**
     * The VPC subnets and security groups used by the cluster control plane. Amazon EKS VPC resources have specific requirements to work properly with Kubernetes. For more information, see Cluster VPC Considerations and Cluster Security Group Considerations in the Amazon EKS User Guide. 
     */
    private String ResourcesVpcConfig;

    /**
     * The Amazon Resource Name (ARN) of the IAM role that provides permissions for the Kubernetes control plane to make calls to AWS API operations on your behalf. 
     */
    private String RoleArn;

    /**
     * The name of the cluster. 
     */
    private String Name;

    /**
     * @return the Version
     */
    public String getVersion() {
        return Version;
    }

    /**
     * @param Version the Version to set
     */
    public void setVersion(String Version) {
	this.Version = Version;
    }

    /**
     * @return the ResourcesVpcConfig
     */
    public String getResourcesVpcConfig() {
        return ResourcesVpcConfig;
    }

    /**
     * @param ResourcesVpcConfig the ResourcesVpcConfig to set
     */
    public void setResourcesVpcConfig(String ResourcesVpcConfig) {
	this.ResourcesVpcConfig = ResourcesVpcConfig;
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