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
public class AwsResourceLogsMetricfilter {

    /**
     * Describes how to transform data from a log into a CloudWatch metric. 
     */
    private String MetricTransformations;

    /**
     * Describes the pattern that CloudWatch Logs follows to interpret each entry in a log. A log entry might contain fields such as timestamps, IP addresses, error codes, bytes transferred, and so on. You use the pattern to specify those fields and to specify what to look for in the log file. For example, if you're interested in error codes that begin with 1234, your filter pattern might be [timestamps, ip_addresses, error_codes = 1234*, size, ...]. For more information, see Filter and Pattern Syntax in the Amazon CloudWatch User Guide. 
     */
    private String FilterPattern;

    /**
     * The name of an existing log group that you want to associate with this metric filter. 
     */
    private String LogGroupName;

    /**
     * @return the MetricTransformations
     */
    public String getMetricTransformations() {
        return MetricTransformations;
    }

    /**
     * @param MetricTransformations the MetricTransformations to set
     */
    public void setMetricTransformations(String MetricTransformations) {
	this.MetricTransformations = MetricTransformations;
    }

    /**
     * @return the FilterPattern
     */
    public String getFilterPattern() {
        return FilterPattern;
    }

    /**
     * @param FilterPattern the FilterPattern to set
     */
    public void setFilterPattern(String FilterPattern) {
	this.FilterPattern = FilterPattern;
    }

    /**
     * @return the LogGroupName
     */
    public String getLogGroupName() {
        return LogGroupName;
    }

    /**
     * @param LogGroupName the LogGroupName to set
     */
    public void setLogGroupName(String LogGroupName) {
	this.LogGroupName = LogGroupName;
    }


}