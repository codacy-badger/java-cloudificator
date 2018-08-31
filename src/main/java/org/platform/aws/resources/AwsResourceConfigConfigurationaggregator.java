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
public class AwsResourceConfigConfigurationaggregator {

    /**
     * A collection of accounts and regions. 
     */
    private String AccountAggregationSources;

    /**
     * The name of the configuration aggregator. 
     */
    private String ConfigurationAggregatorName;

    /**
     * A collection of regions and IAM role to retrieve AWS Organizations details. 
     */
    private String OrganizationAggregationSource;

    /**
     * @return the AccountAggregationSources
     */
    public String getAccountAggregationSources() {
        return AccountAggregationSources;
    }

    /**
     * @param AccountAggregationSources the AccountAggregationSources to set
     */
    public void setAccountAggregationSources(String AccountAggregationSources) {
	this.AccountAggregationSources = AccountAggregationSources;
    }

    /**
     * @return the ConfigurationAggregatorName
     */
    public String getConfigurationAggregatorName() {
        return ConfigurationAggregatorName;
    }

    /**
     * @param ConfigurationAggregatorName the ConfigurationAggregatorName to set
     */
    public void setConfigurationAggregatorName(String ConfigurationAggregatorName) {
	this.ConfigurationAggregatorName = ConfigurationAggregatorName;
    }

    /**
     * @return the OrganizationAggregationSource
     */
    public String getOrganizationAggregationSource() {
        return OrganizationAggregationSource;
    }

    /**
     * @param OrganizationAggregationSource the OrganizationAggregationSource to set
     */
    public void setOrganizationAggregationSource(String OrganizationAggregationSource) {
	this.OrganizationAggregationSource = OrganizationAggregationSource;
    }


}