package thirdLesson;

import java.util.HashMap;

public class ContactMap extends HashMap<String,Contact> {
    public void add(String phone, String surname) {
        this.put(surname + "_" + this.size(), new Contact(phone, surname));
    }
    public String get(String surname) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String key :
                this.keySet()) {
            if (key.matches("^" + surname + "_[0-9]+$")) {
                stringBuilder.append(super.get(key)).append("\n");
            }
        }
        if (stringBuilder.isEmpty()) {
            stringBuilder.append("No contacts found!");
        }
        return stringBuilder.toString();
    }
}
