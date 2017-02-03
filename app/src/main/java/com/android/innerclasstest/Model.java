package com.android.innerclasstest;

import android.util.Log;

/**
 * Created by max on 03.02.17.
 */

public class Model {

    protected void someMethodInModel() {
        Log.i("test", "someMethodInModel()");
    }

    public void test() {
        M1 m1 = new M1();
        m1.someMethod();
    }

    public class M1 {
        public void someMethod() {
            someMethodInModel();
        }
    }

    public class M2 {

    }
}
