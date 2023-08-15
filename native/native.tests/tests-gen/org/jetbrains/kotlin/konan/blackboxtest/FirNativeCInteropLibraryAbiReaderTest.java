/*
 * Copyright 2010-2023 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.konan.blackboxtest;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.junit.jupiter.api.Tag;
import org.jetbrains.kotlin.konan.blackboxtest.support.group.FirPipeline;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.GenerateNativeTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/klib/dump-abi/cinterop")
@TestDataPath("$PROJECT_ROOT")
@Tag("frontend-fir")
@FirPipeline()
public class FirNativeCInteropLibraryAbiReaderTest extends AbstractNativeCInteropLibraryAbiReaderTest {
    @Test
    public void testAllFilesPresentInCinterop() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("compiler/testData/klib/dump-abi/cinterop"), Pattern.compile("^(.+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("interop_class_inheritor.kt")
    public void testInterop_class_inheritor() throws Exception {
        runTest("compiler/testData/klib/dump-abi/cinterop/interop_class_inheritor.kt");
    }
}
