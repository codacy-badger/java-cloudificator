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
public class AwsResourceCognitoIdentitypoolroleattachment {

    /**
     * How users for a specific identity provider are to mapped to roles. This is a string to RoleMapping object map. The string identifies the identity provider, for example, "graph.facebook.com" or "cognito-idp-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id" 
     */
    private String RoleMappings;

    /**
     * An identity pool ID in the format REGION:GUID. 
     */
    private String IdentityPoolId;

    /**
     * The map of roles associated with this pool. For a given role, the key will be either "authenticated" or "unauthenticated" and the value will be the Role ARN. 
     */
    private String Roles;

    /**
     * @return the RoleMappings
     */
    public String getRoleMappings() {
        return RoleMappings;
    }

    /**
     * @param RoleMappings the RoleMappings to set
     */
    public void setRoleMappings(String RoleMappings) {
	this.RoleMappings = RoleMappings;
    }

    /**
     * @return the IdentityPoolId
     */
    public String getIdentityPoolId() {
        return IdentityPoolId;
    }

    /**
     * @param IdentityPoolId the IdentityPoolId to set
     */
    public void setIdentityPoolId(String IdentityPoolId) {
	this.IdentityPoolId = IdentityPoolId;
    }

    /**
     * @return the Roles
     */
    public String getRoles() {
        return Roles;
    }

    /**
     * @param Roles the Roles to set
     */
    public void setRoles(String Roles) {
	this.Roles = Roles;
    }


}