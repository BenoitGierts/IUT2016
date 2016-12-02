package main.java;

public class ObjectMapper {

public String object2Json(Object value) {
if (value == null) {
return "null";
} else {

if (value instanceof String) {
return "\"" + value + "\"";
} else if (value instanceof Integer) {
return Integer.toString((Integer) value);
}
return null;

}
}
}

