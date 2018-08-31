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
public class AwsResourceAuthentication {

    /**
     * Specifies the access key ID for S3 authentication. 
     */
    private String accessKeyId;

    /**
     * A comma-delimited list of URIs to be associated with the basic authentication credentials. The authorization applies to the specified URIs and any more specific URI. For example, if you specify http://www.example.com, the authorization will also apply to http://www.example.com/test. 
     */
    private String uris;

    /**
     * Specifies the password for basic authentication. 
     */
    private String password;

    /**
     * Specifies the secret key for S3 authentication. 
     */
    private String secretKey;

    /**
     * A comma-delimited list of Amazon S3 buckets to be associated with the S3 authentication credentials. 
     */
    private String buckets;

    /**
     * Describes the role for role-based authentication. 
     */
    private String roleName;

    /**
     * Specifies whether the authentication scheme uses a user name and password ("basic") or an access key ID and secret key ("S3"). 
     */
    private String type;

    /**
     * Specifies the user name for basic authentication. 
     */
    private String username;

    /**
     * @return the accessKeyId
     */
    public String getaccessKeyId() {
        return accessKeyId;
    }

    /**
     * @param accessKeyId the accessKeyId to set
     */
    public void setaccessKeyId(String accessKeyId) {
	this.accessKeyId = accessKeyId;
    }

    /**
     * @return the uris
     */
    public String geturis() {
        return uris;
    }

    /**
     * @param uris the uris to set
     */
    public void seturis(String uris) {
	this.uris = uris;
    }

    /**
     * @return the password
     */
    public String getpassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setpassword(String password) {
	this.password = password;
    }

    /**
     * @return the secretKey
     */
    public String getsecretKey() {
        return secretKey;
    }

    /**
     * @param secretKey the secretKey to set
     */
    public void setsecretKey(String secretKey) {
	this.secretKey = secretKey;
    }

    /**
     * @return the buckets
     */
    public String getbuckets() {
        return buckets;
    }

    /**
     * @param buckets the buckets to set
     */
    public void setbuckets(String buckets) {
	this.buckets = buckets;
    }

    /**
     * @return the roleName
     */
    public String getroleName() {
        return roleName;
    }

    /**
     * @param roleName the roleName to set
     */
    public void setroleName(String roleName) {
	this.roleName = roleName;
    }

    /**
     * @return the type
     */
    public String gettype() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void settype(String type) {
	this.type = type;
    }

    /**
     * @return the username
     */
    public String getusername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setusername(String username) {
	this.username = username;
    }


}