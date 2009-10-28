/*
 * VennEuler -- A Venn and Euler Diagram program.
 *
 * Copyright 2009 by Leland Wilkinson.
 *
 * The contents of this file are subject to the Mozilla Public License Version 1.1 (the "License")
 * You may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/
 *
 * Software distributed under the License is distributed on an "AS IS" basis,
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License
 * for the specific language governing rights and limitations under the License.
 */

package edu.uic.ncdm.venn.data;

import java.awt.*;

public abstract class FilePicker {
    public static String loadFile() {
        FileDialog fd = new FileDialog(new Frame(), "Open", FileDialog.LOAD);
        fd.setLocation(50, 50);
        fd.setVisible(true);
        return fd.getDirectory() + fd.getFile();
    }

    public static String saveFile() {
        FileDialog fd = new FileDialog(new Frame(), "Save", FileDialog.SAVE);
        fd.setLocation(50, 50);
        fd.setVisible(true);
        return fd.getDirectory() + fd.getFile();
    }
}
