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
public class AwsResourceEc2Vpcpeeringconnection {

    /**
     * The ID of the VPC that is requesting a peering connection. 
     */
    private String VpcId;

    /**
     * The Amazon Resource Name (ARN) of the VPC peer role for the peering connection in another AWS account. 
     */
    private String PeerRoleArn;

    /**
     * The ID of the VPC with which you are creating the peering connection. 
     */
    private String PeerVpcId;

    /**
     * The region code for the accepter VPC, if the accepter VPC is located in a region other than the region in which you make the request. The default is the region in which you make the request. 
     */
    private String PeerRegion;

    /**
     * The AWS account ID of the owner of the VPC that you want to peer with. 
     */
    private String PeerOwnerId;

    /**
     * An arbitrary set of tags (key–value pairs) for this resource. 
     */
    private String Tags;

    /**
     * @return the VpcId
     */
    public String getVpcId() {
        return VpcId;
    }

    /**
     * @param VpcId the VpcId to set
     */
    public void setVpcId(String VpcId) {
	this.VpcId = VpcId;
    }

    /**
     * @return the PeerRoleArn
     */
    public String getPeerRoleArn() {
        return PeerRoleArn;
    }

    /**
     * @param PeerRoleArn the PeerRoleArn to set
     */
    public void setPeerRoleArn(String PeerRoleArn) {
	this.PeerRoleArn = PeerRoleArn;
    }

    /**
     * @return the PeerVpcId
     */
    public String getPeerVpcId() {
        return PeerVpcId;
    }

    /**
     * @param PeerVpcId the PeerVpcId to set
     */
    public void setPeerVpcId(String PeerVpcId) {
	this.PeerVpcId = PeerVpcId;
    }

    /**
     * @return the PeerRegion
     */
    public String getPeerRegion() {
        return PeerRegion;
    }

    /**
     * @param PeerRegion the PeerRegion to set
     */
    public void setPeerRegion(String PeerRegion) {
	this.PeerRegion = PeerRegion;
    }

    /**
     * @return the PeerOwnerId
     */
    public String getPeerOwnerId() {
        return PeerOwnerId;
    }

    /**
     * @param PeerOwnerId the PeerOwnerId to set
     */
    public void setPeerOwnerId(String PeerOwnerId) {
	this.PeerOwnerId = PeerOwnerId;
    }

    /**
     * @return the Tags
     */
    public String getTags() {
        return Tags;
    }

    /**
     * @param Tags the Tags to set
     */
    public void setTags(String Tags) {
	this.Tags = Tags;
    }


}