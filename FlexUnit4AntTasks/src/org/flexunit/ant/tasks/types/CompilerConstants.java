package org.flexunit.ant.tasks.types;

import java.util.ArrayList;

public class CompilerConstants {

    ArrayList<CompilerConstant> constants = new ArrayList<CompilerConstant>();

    public void add(CompilerConstant constant) {
        constants.add(constant);

    }

    public ArrayList<CompilerConstant> getConstants() {
        return constants;
    }
}
