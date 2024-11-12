package Org.howard.edu.lsp.assignment6;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class IntegerSetTest {
    private IntegerSet set;
    private IntegerSet setB;
    
    @BeforeEach
    public void setup() {
        set = new IntegerSet();
        setB = new IntegerSet();
    }
    
    @Test
    @DisplayName("Test case for clear method")
    public void testClear() {
        set.add(1);
        set.add(2);
        set.clear();
        assertTrue(set.isEmpty(), "Set should be empty after clear.");
    }
    
    @Test
    @DisplayName("Test case for length method")
    public void testLength() {
        assertEquals(0, set.length(), "Empty set should have length 0.");
        set.add(1);
        assertEquals(1, set.length(), "Set should have length 1 after adding an element.");
    }
    
    @Test
    @DisplayName("Test case for equals method")
    public void testEquals() {
        set.add(1);
        set.add(2);
        setB.add(2);
        setB.add(1);
        assertTrue(set.equals(setB), "Sets should be equal if they contain the same elements in any order.");
        
        setB.add(3);
        assertFalse(set.equals(setB), "Sets should not be equal if they have different elements.");
    }
    
    @Test 
    @DisplayName("Test case for contains method")
    public void testContains() {
        set.add(5);
        assertTrue(set.contains(5), "Set should contain 5.");
        assertFalse(set.contains(10), "Set should not contain 10.");
    }
    
    @Test
    @DisplayName("Test case for smallest method")
    public void testSmallest() throws IntegerSetException {
        set.add(1);
        set.add(2);
        set.add(3);
        assertEquals(1, set.smallest(), "Smallest element should be 1.");
        
        set.clear();
        Exception exception = assertThrows(IntegerSetException.class, () -> set.smallest());
        assertEquals("Set is empty", exception.getMessage(), "Should throw exception for empty set.");
    }
    
    @Test 
    @DisplayName("Test case for remove method")
    public void testRemove() {
        set.add(1);
        set.add(2);
        set.remove(1);
        assertFalse(set.contains(1), "Set should not contain removed element.");
        
        set.remove(3);
        assertEquals(1, set.length(), "Removing non-existing element should not change set size.");
    }
    
    @Test 
    @DisplayName("Test case for union method")
    public void testUnion() {
        set.add(1);
        set.add(2);
        setB.add(3);
        setB.add(4);
        set.union(setB);
        
        assertTrue(set.contains(1) && set.contains(2) && set.contains(3) && set.contains(4),
            "Union should contain all elements from both sets.");
    }
    
    @Test 
    @DisplayName("Test case for diff method")
    public void testDiff() {
        set.add(1);
        set.add(2);
        setB.add(2);
        setB.add(3);
        set.diff(setB);
        
        assertTrue(set.contains(1) && !set.contains(2) && !set.contains(3),
            "Difference should contain only elements unique to the first set.");
    }
    
    @Test 
    @DisplayName("Test case for toString method")
    public void testToString() {
        set.add(1);
        set.add(2);
        assertEquals("[1, 2]", set.toString(), "toString should return a string representation of the set.");
    }
}
