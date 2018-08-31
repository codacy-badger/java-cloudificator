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
public class AwsResourceElasticsearchDomain {

    /**
     * The cluster configuration for the Amazon ES domain. You can specify options such as the instance type and the number of instances. For more information, see Configuring Amazon ES Domains in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String ElasticsearchClusterConfig;

    /**
     * Additional options to specify for the Amazon ES domain. For more information, see Configuring Advanced Options in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String AdvancedOptions;

    /**
     * A name for the Amazon ES domain. For valid values, see the DomainName data type in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String DomainName;

    /**
     * The version of Elasticsearch to use, such as 2.3. For information about the versions that Amazon ES supports, see the Elasticsearch-Version parameter for the CreateElasticsearchDomain action in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String ElasticsearchVersion;

    /**
     * The configurations of Amazon Elastic Block Store (Amazon EBS) volumes that are attached to data nodes in the Amazon ES domain. For more information, see Configuring EBS-based Storage in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String EBSOptions;

    /**
     * The automated snapshot configuration for the Amazon ES domain indices. 
     */
    private String SnapshotOptions;

    /**
     * The virtual private cloud (VPC) configuration for the Amazon ES domain. For more information, see VPC Support for Amazon Elasticsearch Service Domains in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String VPCOptions;

    /**
     * An AWS Identity and Access Management (IAM) policy document that specifies who can access the Amazon ES domain and their permissions. For more information, see Configuring Access Policies in the Amazon Elasticsearch Service Developer Guide. 
     */
    private String AccessPolicies;

    /**
     * Whether the domain should encrypt data at rest, and if so, the AWS Key Management Service (KMS) key to use. Can only be used to create a new domain, not update an existing one. 
     */
    private String EncryptionAtRestOptions;

    /**
     * An arbitrary set of tags (key–value pairs) to associate with the Amazon ES domain. 
     */
    private String Tags;

    /**
     * @return the ElasticsearchClusterConfig
     */
    public String getElasticsearchClusterConfig() {
        return ElasticsearchClusterConfig;
    }

    /**
     * @param ElasticsearchClusterConfig the ElasticsearchClusterConfig to set
     */
    public void setElasticsearchClusterConfig(String ElasticsearchClusterConfig) {
	this.ElasticsearchClusterConfig = ElasticsearchClusterConfig;
    }

    /**
     * @return the AdvancedOptions
     */
    public String getAdvancedOptions() {
        return AdvancedOptions;
    }

    /**
     * @param AdvancedOptions the AdvancedOptions to set
     */
    public void setAdvancedOptions(String AdvancedOptions) {
	this.AdvancedOptions = AdvancedOptions;
    }

    /**
     * @return the DomainName
     */
    public String getDomainName() {
        return DomainName;
    }

    /**
     * @param DomainName the DomainName to set
     */
    public void setDomainName(String DomainName) {
	this.DomainName = DomainName;
    }

    /**
     * @return the ElasticsearchVersion
     */
    public String getElasticsearchVersion() {
        return ElasticsearchVersion;
    }

    /**
     * @param ElasticsearchVersion the ElasticsearchVersion to set
     */
    public void setElasticsearchVersion(String ElasticsearchVersion) {
	this.ElasticsearchVersion = ElasticsearchVersion;
    }

    /**
     * @return the EBSOptions
     */
    public String getEBSOptions() {
        return EBSOptions;
    }

    /**
     * @param EBSOptions the EBSOptions to set
     */
    public void setEBSOptions(String EBSOptions) {
	this.EBSOptions = EBSOptions;
    }

    /**
     * @return the SnapshotOptions
     */
    public String getSnapshotOptions() {
        return SnapshotOptions;
    }

    /**
     * @param SnapshotOptions the SnapshotOptions to set
     */
    public void setSnapshotOptions(String SnapshotOptions) {
	this.SnapshotOptions = SnapshotOptions;
    }

    /**
     * @return the VPCOptions
     */
    public String getVPCOptions() {
        return VPCOptions;
    }

    /**
     * @param VPCOptions the VPCOptions to set
     */
    public void setVPCOptions(String VPCOptions) {
	this.VPCOptions = VPCOptions;
    }

    /**
     * @return the AccessPolicies
     */
    public String getAccessPolicies() {
        return AccessPolicies;
    }

    /**
     * @param AccessPolicies the AccessPolicies to set
     */
    public void setAccessPolicies(String AccessPolicies) {
	this.AccessPolicies = AccessPolicies;
    }

    /**
     * @return the EncryptionAtRestOptions
     */
    public String getEncryptionAtRestOptions() {
        return EncryptionAtRestOptions;
    }

    /**
     * @param EncryptionAtRestOptions the EncryptionAtRestOptions to set
     */
    public void setEncryptionAtRestOptions(String EncryptionAtRestOptions) {
	this.EncryptionAtRestOptions = EncryptionAtRestOptions;
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