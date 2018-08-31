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
public class AwsResourceCloudfrontDistribution {

    /**
     * The distribution's configuration information. 
     */
    private String DistributionConfig;

    /**
     * An arbitrary set of tags (key–value pairs) to associate with a CloudFront distribution. 
     */
    private String Tags;

    /**
     * @return the DistributionConfig
     */
    public String getDistributionConfig() {
        return DistributionConfig;
    }

    /**
     * @param DistributionConfig the DistributionConfig to set
     */
    public void setDistributionConfig(String DistributionConfig) {
	this.DistributionConfig = DistributionConfig;
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