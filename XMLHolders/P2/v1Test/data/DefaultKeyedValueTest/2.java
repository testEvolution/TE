@Test
    public void testEqualsForNullValues() {
        DefaultKeyedValue<String> v1 = new DefaultKeyedValue<>("K1", null);
        DefaultKeyedValue<String> v2 = new DefaultKeyedValue<>("K1", null);
        assertTrue(v1.equals(v2));
        v1.setValue(1);
        assertFalse(v1.equals(v2));
        assertFalse(v2.equals(v1));
    }

    