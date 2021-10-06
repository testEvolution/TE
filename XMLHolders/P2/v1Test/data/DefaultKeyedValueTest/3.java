@Test
    public void testCloning() throws CloneNotSupportedException {
        DefaultKeyedValue v1 = new DefaultKeyedValue("Test", 45.5);
        DefaultKeyedValue v2 = (DefaultKeyedValue) v1.clone();
        assertTrue(v1 != v2);
        assertTrue(v1.getClass() == v2.getClass());
        assertTrue(v1.equals(v2));

        // confirm that the clone is independent of the original
        v2.setValue(12.3);
        assertFalse(v1.equals(v2));
    }

    