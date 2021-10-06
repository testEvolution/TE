@Test
    public void testEquals() {
        DefaultKeyedValue v1 = new DefaultKeyedValue("Test", 45.5);
        DefaultKeyedValue v2 = new DefaultKeyedValue("Test", 45.5);
        assertTrue(v1.equals(v2));
        assertTrue(v2.equals(v1));

        v1 = new DefaultKeyedValue("Test 1", 45.5);
        v2 = new DefaultKeyedValue("Test 2", 45.5);
        assertFalse(v1.equals(v2));

        v1 = new DefaultKeyedValue("Test", 45.5);
        v2 = new DefaultKeyedValue("Test", 45.6);
        assertFalse(v1.equals(v2));
    }
    
    