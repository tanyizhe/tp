package seedu.duke.information;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InformationTest {
    @Test
    public void resetDiagosisHistory() {
        ArrayList<String> diagnosisHistory = new ArrayList<>();
        diagnosisHistory.add("Diagnosis 1");
        diagnosisHistory.add("Diagnosis 2");
        diagnosisHistory.clear();
        assertEquals(diagnosisHistory.size(), 0);
    }

    @Test
    public void checkPassword() {
        HashMap<String, String> personalInfo = new HashMap<>();
        String password = "iloveCS2113";
        String name = "Akshay";
        personalInfo.put(password, name);
        assertEquals(personalInfo.containsKey(password), true);

    }
}