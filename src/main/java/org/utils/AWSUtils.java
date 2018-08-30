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
package org.utils;

/**
 * The Class AWSUtils.
 *
 * @author Inaki Rodriguez
 */
public final class AWSUtils {

    /**
     * Instantiates a new AWS utils.
     */
    private AWSUtils() {
    }

    /** The Constant FIELD_TEMPLATE_VERSION. */
    public static final String FIELD_TEMPLATE_VERSION = "AWSTemplateFormatVersion";

    /** The Constant FIELD_TEMPLATE_DESCRIPTION. */
    public static final String FIELD_TEMPLATE_DESCRIPTION = "Description";

    /** The Constant FIELD_TEMPLATE_SECTION_RESOURCES. */
    public static final String FIELD_TEMPLATE_SECTION_RESOURCES = "Resources";

    /** The Constant FIELD_TEMPLATE_SECTION_OUTPUTS. */
    public static final String FIELD_TEMPLATE_SECTION_OUTPUTS = "Outputs";

    /** The Constant FIELD_TEMPLATE_SECTION_PARAMETERS. */
    public static final String FIELD_TEMPLATE_SECTION_PARAMETERS = "Parameters";

    /** The Constant FIELD_TEMPLATE_SECTION_MAPPINGS. */
    public static final String FIELD_TEMPLATE_SECTION_MAPPINGS = "Mappings";

    /** The Constant FIELD_TEMPLATE_SECTION_CONDITIONS. */
    public static final String FIELD_TEMPLATE_SECTION_CONDITIONS = "Conditions";

    /** The Constant RESOURCE_TYPE_HOSTED_ZONE. */
    public static final String RESOURCE_TYPE_HOSTED_ZONE = "AWS::Route53::HostedZone";

}
