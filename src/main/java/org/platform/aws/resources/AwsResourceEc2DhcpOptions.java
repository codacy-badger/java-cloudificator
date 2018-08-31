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
public class AwsResourceEc2DhcpOptions {

    /**
     * The IP address (IPv4) of a NetBIOS name server. You can specify up to four addresses. 
     */
    private String NetbiosNameServers;

    /**
     * The IP address (IPv4) of a Network Time Protocol (NTP) server. You can specify up to four addresses. 
     */
    private String NtpServers;

    /**
     * A domain name of your choice. 
     */
    private String DomainName;

    /**
     * An integer value indicating the NetBIOS node type: 
     */
    private String NetbiosNodeType;

    /**
     * The IP (IPv4) address of a domain name server. You can specify up to four addresses. 
     */
    private String DomainNameServers;

    /**
     * An arbitrary set of tags (key–value pairs) for this resource. 
     */
    private String Tags;

    /**
     * @return the NetbiosNameServers
     */
    public String getNetbiosNameServers() {
        return NetbiosNameServers;
    }

    /**
     * @param NetbiosNameServers the NetbiosNameServers to set
     */
    public void setNetbiosNameServers(String NetbiosNameServers) {
	this.NetbiosNameServers = NetbiosNameServers;
    }

    /**
     * @return the NtpServers
     */
    public String getNtpServers() {
        return NtpServers;
    }

    /**
     * @param NtpServers the NtpServers to set
     */
    public void setNtpServers(String NtpServers) {
	this.NtpServers = NtpServers;
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
     * @return the NetbiosNodeType
     */
    public String getNetbiosNodeType() {
        return NetbiosNodeType;
    }

    /**
     * @param NetbiosNodeType the NetbiosNodeType to set
     */
    public void setNetbiosNodeType(String NetbiosNodeType) {
	this.NetbiosNodeType = NetbiosNodeType;
    }

    /**
     * @return the DomainNameServers
     */
    public String getDomainNameServers() {
        return DomainNameServers;
    }

    /**
     * @param DomainNameServers the DomainNameServers to set
     */
    public void setDomainNameServers(String DomainNameServers) {
	this.DomainNameServers = DomainNameServers;
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