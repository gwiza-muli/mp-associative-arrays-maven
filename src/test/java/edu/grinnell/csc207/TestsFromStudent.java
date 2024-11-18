package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Sheilla Muligande
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {} // alwaysPass()

} // class TestsFromStudent


  // @Test

  // /*
  //  * Tests that you can set a key's value, change that value, and clone the array it is in.
  //  */

  // public void muligandeSheillaTest01() throws NullKeyException {

  //   AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
  //   arr.set("Hi", "there");
  //   arr.set("Another", "one");
  //   try {
  //     assertEquals(("there"), arr.get("Hi"));
  //   } catch (Exception e) {
  //     fail("Array does not contain expected key value.");
  //   } // try/catch
  //   try {
  //     assertEquals(("one"), arr.get("Another"));
  //   } catch (Exception e) {
  //     fail("Array does not contain expected key value.");
  //   } // try/catch


  //   // change the original key. and check that is has been changed.
  //   arr.set("Hi", "person");
  //   try {
  //     assertEquals(("person"), arr.get("Hi"));
  //   } catch (Exception e) {
  //     fail("Array does not contain the new/changed value.");
  //   } // try/catch

  //   // clone the array
  //   AssociativeArray<String, String> arr2 = arr.clone();
  //   try {
  //     assertEquals(("person"), arr2.get("Hi"));
  //   } catch (Exception e) {
  //     fail("Copy array does not contain original value");
  //   } // try/catch

  // }

  // @Test

  // /*
  //  * check that removing a key from original array does not change the clone array.
  //  */

  // public void muligandeSheillaTest02() throws NullKeyException {

  //   AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
  //   // add an element to arr
  //   arr.set("Good", "morning");
  //   try {
  //     assertEquals(("morning"), arr.get("Good"));
  //   } catch (Exception e) {
  //     fail("Array does not contain expected key value.");
  //   } // try/catch

  //   // clone it
  //   AssociativeArray<String, String> arr2 = arr.clone();
  //   try {
  //     assertEquals(("morning"), arr2.get("Good"));
  //   } catch (Exception e) {
  //     fail("Copy array does not contain original value");
  //   } // try/catch

  //   // remove a key from the original.
  //   arr.remove("Good");
  //   try {
  //     arr.get("Good");
  //     fail("Did not throw KeyNotFound exception.");
  //   } catch (KeyNotFoundException e) {

  //   } // try/catch

  //   // check that the clone was unchanged after we removed key.
  //   try {
  //     assertEquals(("morning"), arr2.get("Good"));
  //   } catch (Exception e) {
  //     fail("Clone array was changed when original was changed.");
  //   } // try/catch

  // }

  // @Test

  // /**
  //  * Check that setting an already existing key does not change size.
  //  */
  // public void muligandeSheillaEdge01() {

  //   AssociativeArray<String, String> arr = new AssociativeArray<String, String>();
  //   // add an element to arr
  //   arr.set("Hello", "world");
  //   try {
  //     assertEquals(("world"), arr.get("Hello"));
  //   } catch (Exception e) {
  //     fail("Array does not contain expected key value.");
  //   } // try/catch

  //   arr.set("Hello", "banana");
  //   try {
  //     assertEquals(("banana"), arr.get("Hello"));
  //   } catch (Exception e) {
  //     fail("Array does not contain expected changed key value.");
  //   } // try/catch
  //   try {
  //     assertEquals(1, arr.size(), "arr size");
  //   } catch (Exception e) {
  //     fail("length was changed by changing an already existing key's value.");
  //   } // try/catch
  // }


