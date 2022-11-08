package Lesson6;

import java.util.ArrayList;
import java.util.List;

public class Lab4 {
    public static void main(String[] args) {
        String URL = "https://kenh14.vn";
        List<String> URLElementsList = getElementsURL(URL);
        System.out.println("-->" + URLElementsList);
    }

    private static List<String> getElementsURL(String url) {
        List<String> ElementsURL = new ArrayList<>();
        String Elements = url.split("://")[0];
        ElementsURL.add(Elements);

        String domainElements = url.split("://")[1];
        String[] domainElementsArray = domainElements.split("\\.");
        for (String item: domainElementsArray){
            ElementsURL.add(item);
        }
        return ElementsURL;
    }
}
