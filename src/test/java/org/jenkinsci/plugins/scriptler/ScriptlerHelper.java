/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2014-2020 Ioannis Moutsatsos, Bruno P. Kinoshita
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package org.jenkinsci.plugins.scriptler;


import org.apache.commons.fileupload2.core.FileItem;

/**
 * @see <a href="https://github.com/jenkinsci/scriptler-plugin/blob/5308c27816ed8da5924eedcc6cb12c5655a7e5b3/src/test/java/org/jenkinsci/plugins/scriptler/ScriptlerManagementHelper.java">
 *     https://github.com/jenkinsci/scriptler-plugin/blob/5308c27816ed8da5924eedcc6cb12c5655a7e5b3/src/test/java/org/jenkinsci/plugins/scriptler/ScriptlerManagementHelper.java</a>
 */
public class ScriptlerHelper {
    private final ScriptlerManagement scriptler;

    public ScriptlerHelper(ScriptlerManagement scriptler) {
        this.scriptler = scriptler;
    }

    public void saveScript(FileItem<?> file, boolean nonAdministerUsing, String fileName) throws Exception {
        scriptler.saveScript(file, nonAdministerUsing, fileName);
    }
}
