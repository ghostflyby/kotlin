/*
 * Copyright 2010-2015 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.JetTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("js/js.translator/testData/reified/cases")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ReifiedTestGenerated extends AbstractReifiedTest {
    public void testAllFilesPresentInCases() throws Exception {
        JetTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("js/js.translator/testData/reified/cases"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("callChain.kt")
    public void testCallChain() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/callChain.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionLambda.kt")
    public void testExtensionLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/extensionLambda.kt");
        doTest(fileName);
    }

    @TestMetadata("extensionMethod.kt")
    public void testExtensionMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/extensionMethod.kt");
        doTest(fileName);
    }

    @TestMetadata("innerObject.kt")
    public void testInnerObject() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/innerObject.kt");
        doTest(fileName);
    }

    @TestMetadata("isBool.kt")
    public void testIsBool() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/isBool.kt");
        doTest(fileName);
    }

    @TestMetadata("isChar.kt")
    public void testIsChar() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/isChar.kt");
        doTest(fileName);
    }

    @TestMetadata("isClass.kt")
    public void testIsClass() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/isClass.kt");
        doTest(fileName);
    }

    @TestMetadata("isNumber.kt")
    public void testIsNumber() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/isNumber.kt");
        doTest(fileName);
    }

    @TestMetadata("isString.kt")
    public void testIsString() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/isString.kt");
        doTest(fileName);
    }

    @TestMetadata("lambda.kt")
    public void testLambda() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/lambda.kt");
        doTest(fileName);
    }

    @TestMetadata("lambdaNameClash.kt")
    public void testLambdaNameClash() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/lambdaNameClash.kt");
        doTest(fileName);
    }

    @TestMetadata("method.kt")
    public void testMethod() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/method.kt");
        doTest(fileName);
    }

    @TestMetadata("multipleTypeParameters.kt")
    public void testMultipleTypeParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/multipleTypeParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("noValueParameters.kt")
    public void testNoValueParameters() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/noValueParameters.kt");
        doTest(fileName);
    }

    @TestMetadata("parameterSwap.kt")
    public void testParameterSwap() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/parameterSwap.kt");
        doTest(fileName);
    }

    @TestMetadata("vararg.kt")
    public void testVararg() throws Exception {
        String fileName = JetTestUtils.navigationMetadata("js/js.translator/testData/reified/cases/vararg.kt");
        doTest(fileName);
    }
}
