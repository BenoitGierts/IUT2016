package main.java;

import org.junit.Assert;
import org.junit.Test;



public class ObjectMapperTest {

ObjectMapper sut= new ObjectMapper();

@Test
public void test_String_are_quoted_in_json() {
//Given
// When
String res = sut.object2Json("Hello");
//Then
Assert.assertEquals("\"Hello\"", res);

}


@Test
public void test_Integer_are_not_quoted_in_json() {
//Given
// When
String res = sut.object2Json(123);
//Then
Assert.assertEquals("123", res);
}


@Test
public void test_null_are_stringified_as_null() {
//Given
// When
String res = sut.object2Json(null);
//Then
Assert.assertEquals("null", res);
}

}