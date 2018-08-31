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
public class AwsResourceOpsworksElbattachment {

    /**
     * The AWS OpsWorks layer ID that the Elastic Load Balancing load balancer will be attached to. 
     */
    private String LayerId;

    /**
     * Elastic Load Balancing load balancer name. 
     */
    private String ElasticLoadBalancerName;

    /**
     * @return the LayerId
     */
    public String getLayerId() {
        return LayerId;
    }

    /**
     * @param LayerId the LayerId to set
     */
    public void setLayerId(String LayerId) {
	this.LayerId = LayerId;
    }

    /**
     * @return the ElasticLoadBalancerName
     */
    public String getElasticLoadBalancerName() {
        return ElasticLoadBalancerName;
    }

    /**
     * @param ElasticLoadBalancerName the ElasticLoadBalancerName to set
     */
    public void setElasticLoadBalancerName(String ElasticLoadBalancerName) {
	this.ElasticLoadBalancerName = ElasticLoadBalancerName;
    }


}