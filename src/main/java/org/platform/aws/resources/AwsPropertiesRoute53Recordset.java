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
public class AwsPropertiesRoute53Recordset {

    /**
     * The health check ID that you want to apply to this record set. Route 53 returns this resource record set in response to a DNS query only while record set is healthy. 
     */
    private String HealthCheckId;

    /**
     * Alias resource record sets only: Information about the domain to which you are redirecting traffic. 
     */
    private String AliasTarget;

    /**
     * Any comments that you want to include about the hosted zone. 
     */
    private String Comment;

    /**
     * The name of the domain for the hosted zone where you want to add the record set. 
     */
    private String HostedZoneName;

    /**
     * List of resource records to add. Each record should be in the format appropriate for the record type specified by the Type property. For information about different record types and their record formats, see Values for Basic Resource Record Sets and Appendix: Domain Name Format in the Route 53 Developer Guide. 
     */
    private String ResourceRecords;

    /**
     * The ID of the hosted zone. 
     */
    private String HostedZoneId;

    /**
     * A unique identifier that differentiates among multiple resource record sets that have the same combination of DNS name and type. 
     */
    private String SetIdentifier;

    /**
     * The resource record cache time to live (TTL), in seconds. If you specify this property, do not specify the AliasTarget property. For alias target records, the alias uses a TTL value from the target. 
     */
    private String TTL;

    /**
     * Weighted resource record sets only: Among resource record sets that have the same combination of DNS name and type, a value that determines what portion of traffic for the current resource record set is routed to the associated location. 
     */
    private String Weight;

    /**
     * The name of the domain. You must specify a fully qualified domain name that ends with a period as the last label indication. If you omit the final period, Route 53 adds it. 
     */
    private String Name;

    /**
     * The type of records to add. For valid values, see the Type content in the Amazon Route 53 API Reference. 
     */
    private String Type;

    /**
     * Designates the record set as a PRIMARY or SECONDARY failover record set. When you have more than one resource performing the same function, you can configure Route 53 to check the health of your resources and use only health resources to respond to DNS queries. You cannot create nonfailover resource record sets that have the same Name and Type property values as failover resource record sets. For more information, see the Failover content in the Amazon Route 53 API Reference. 
     */
    private String Failover;

    /**
     * Latency resource record sets only: The Amazon EC2 region where the resource that is specified in this resource record set resides. The resource typically is an AWS resource, for example, Amazon EC2 instance or an Elastic Load Balancing load balancer, and is referred to by an IP address or a DNS domain name, depending on the record type. 
     */
    private String Region;

    /**
     * Describes how Route 53 responds to DNS queries based on the geographic origin of the query. This property is not compatible with the Region property. 
     */
    private String GeoLocation;

    /**
     * @return the HealthCheckId
     */
    public String getHealthCheckId() {
        return HealthCheckId;
    }

    /**
     * @param HealthCheckId the HealthCheckId to set
     */
    public void setHealthCheckId(String HealthCheckId) {
	this.HealthCheckId = HealthCheckId;
    }

    /**
     * @return the AliasTarget
     */
    public String getAliasTarget() {
        return AliasTarget;
    }

    /**
     * @param AliasTarget the AliasTarget to set
     */
    public void setAliasTarget(String AliasTarget) {
	this.AliasTarget = AliasTarget;
    }

    /**
     * @return the Comment
     */
    public String getComment() {
        return Comment;
    }

    /**
     * @param Comment the Comment to set
     */
    public void setComment(String Comment) {
	this.Comment = Comment;
    }

    /**
     * @return the HostedZoneName
     */
    public String getHostedZoneName() {
        return HostedZoneName;
    }

    /**
     * @param HostedZoneName the HostedZoneName to set
     */
    public void setHostedZoneName(String HostedZoneName) {
	this.HostedZoneName = HostedZoneName;
    }

    /**
     * @return the ResourceRecords
     */
    public String getResourceRecords() {
        return ResourceRecords;
    }

    /**
     * @param ResourceRecords the ResourceRecords to set
     */
    public void setResourceRecords(String ResourceRecords) {
	this.ResourceRecords = ResourceRecords;
    }

    /**
     * @return the HostedZoneId
     */
    public String getHostedZoneId() {
        return HostedZoneId;
    }

    /**
     * @param HostedZoneId the HostedZoneId to set
     */
    public void setHostedZoneId(String HostedZoneId) {
	this.HostedZoneId = HostedZoneId;
    }

    /**
     * @return the SetIdentifier
     */
    public String getSetIdentifier() {
        return SetIdentifier;
    }

    /**
     * @param SetIdentifier the SetIdentifier to set
     */
    public void setSetIdentifier(String SetIdentifier) {
	this.SetIdentifier = SetIdentifier;
    }

    /**
     * @return the TTL
     */
    public String getTTL() {
        return TTL;
    }

    /**
     * @param TTL the TTL to set
     */
    public void setTTL(String TTL) {
	this.TTL = TTL;
    }

    /**
     * @return the Weight
     */
    public String getWeight() {
        return Weight;
    }

    /**
     * @param Weight the Weight to set
     */
    public void setWeight(String Weight) {
	this.Weight = Weight;
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

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
	this.Type = Type;
    }

    /**
     * @return the Failover
     */
    public String getFailover() {
        return Failover;
    }

    /**
     * @param Failover the Failover to set
     */
    public void setFailover(String Failover) {
	this.Failover = Failover;
    }

    /**
     * @return the Region
     */
    public String getRegion() {
        return Region;
    }

    /**
     * @param Region the Region to set
     */
    public void setRegion(String Region) {
	this.Region = Region;
    }

    /**
     * @return the GeoLocation
     */
    public String getGeoLocation() {
        return GeoLocation;
    }

    /**
     * @param GeoLocation the GeoLocation to set
     */
    public void setGeoLocation(String GeoLocation) {
	this.GeoLocation = GeoLocation;
    }


}