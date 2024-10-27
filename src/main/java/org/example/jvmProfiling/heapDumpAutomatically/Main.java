package org.example.jvmProfiling.heapDumpAutomatically;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Before run add jvm params
        // Open Intellij Run/Debug Configuration
        // Modify Option and Select VM Options
        // -Xms16m -Xmx16m -XX:+HeapDumpOnOutOfMemoryError

        // You will find hprof file near your project folder.
        // Open hprof file with VisualVM.

        List<People> listOfPeople = new ArrayList<>();
        while (true) {
            listOfPeople.add(new People("TempName"));
        }
    }

}