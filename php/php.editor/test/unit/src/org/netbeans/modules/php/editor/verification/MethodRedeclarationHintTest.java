/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.netbeans.modules.php.editor.verification;

public class MethodRedeclarationHintTest extends PHPHintsTestBase {

    public MethodRedeclarationHintTest(String testName) {
        super(testName);
    }

    @Override
    protected String getTestDirectory() {
        return TEST_DIRECTORY + "MethodRedeclarationHint/";
    }

    public void testMethodRedeclarationHint() throws Exception {
        checkHints(new MethodRedeclarationHintError(), "testMethodRedeclarationHint.php");
    }

    public void testIssue226494() throws Exception {
        checkHints(new MethodRedeclarationHintError(), "testIssue226494.php");
    }

    public void testEnumerations() throws Exception {
        checkHints(new MethodRedeclarationHintError(), "testEnumerations.php");
    }

}
