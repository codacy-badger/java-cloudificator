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
public class AwsResourceElasticloadbalancingv2Listenercertificate {

    /**
     * The Amazon Resource Name (ARN) of the listener. 
     */
    private String ListenerArn;

    /**
     * Certificates specified for the listener. Duplicates not allowed. 
     */
    private String Certificates;

    /**
     * @return the ListenerArn
     */
    public String getListenerArn() {
        return ListenerArn;
    }

    /**
     * @param ListenerArn the ListenerArn to set
     */
    public void setListenerArn(String ListenerArn) {
	this.ListenerArn = ListenerArn;
    }

    /**
     * @return the Certificates
     */
    public String getCertificates() {
        return Certificates;
    }

    /**
     * @param Certificates the Certificates to set
     */
    public void setCertificates(String Certificates) {
	this.Certificates = Certificates;
    }


}