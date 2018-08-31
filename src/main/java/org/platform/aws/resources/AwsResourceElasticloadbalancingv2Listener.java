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
public class AwsResourceElasticloadbalancingv2Listener {

    /**
     * The security policy that defines the ciphers and protocols that the load balancer supports. 
     */
    private String SslPolicy;

    /**
     * The Amazon Resource Name (ARN) of the load balancer to associate with the listener. 
     */
    private String LoadBalancerArn;

    /**
     * The default actions that the listener takes when handling incoming requests. 
     */
    private String DefaultActions;

    /**
     * The port on which the listener listens for requests. 
     */
    private String Port;

    /**
     * The SSL server certificate for the listener. With a certificate, you can encrypt traffic between the load balancer and the clients that initiate HTTPS sessions, and traffic between the load balancer and your targets. 
     */
    private String Certificates;

    /**
     * The protocol that clients must use to send requests to the listener. 
     */
    private String Protocol;

    /**
     * @return the SslPolicy
     */
    public String getSslPolicy() {
        return SslPolicy;
    }

    /**
     * @param SslPolicy the SslPolicy to set
     */
    public void setSslPolicy(String SslPolicy) {
	this.SslPolicy = SslPolicy;
    }

    /**
     * @return the LoadBalancerArn
     */
    public String getLoadBalancerArn() {
        return LoadBalancerArn;
    }

    /**
     * @param LoadBalancerArn the LoadBalancerArn to set
     */
    public void setLoadBalancerArn(String LoadBalancerArn) {
	this.LoadBalancerArn = LoadBalancerArn;
    }

    /**
     * @return the DefaultActions
     */
    public String getDefaultActions() {
        return DefaultActions;
    }

    /**
     * @param DefaultActions the DefaultActions to set
     */
    public void setDefaultActions(String DefaultActions) {
	this.DefaultActions = DefaultActions;
    }

    /**
     * @return the Port
     */
    public String getPort() {
        return Port;
    }

    /**
     * @param Port the Port to set
     */
    public void setPort(String Port) {
	this.Port = Port;
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

    /**
     * @return the Protocol
     */
    public String getProtocol() {
        return Protocol;
    }

    /**
     * @param Protocol the Protocol to set
     */
    public void setProtocol(String Protocol) {
	this.Protocol = Protocol;
    }


}