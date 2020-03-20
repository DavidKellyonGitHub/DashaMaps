package main;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.*;

public class DashaMapOneTest {
    DashaMapOne testMap = new DashaMapOne();

    @Test
    public void constructorTest(){
        ArrayList<DashaMapOne.Node> testList = new ArrayList();
        for (char i = 'a'; i <= 'z'; i++){
            DashaMapOne.Node letterNode = new DashaMapOne().new Node(null,(char) i, null);
            testList.add(letterNode);
        }
        for (int i = 0; i < 26; i++){
            Object expected = testList.get(i).getKey();
            Object actual = testMap.getHashArray()[i].getKey();
            Assert.assertTrue(expected.equals(actual));
        }
    }

    @Test
    public void addNodeToHashArray() {
    }

    @Test
    public void set() {

    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
    }

    @Test
    public void isEmpty() {
    }

    @Test
    public void size() {
    }

    @Test
    public void bucketSize() {
    }

    @Test
    public void testAddNodeToHashArray() {
    }

    @Test
    public void testSet() {
    }

    @Test
    public void testDelete() {
    }

    @Test
    public void testGet() {
    }

    @Test
    public void testIsEmpty() {
    }

    @Test
    public void testSize() {
    }

    @Test
    public void testBucketSize() {
    }
}