@Test
    public void testGetKeys() {
        DefaultKeyedValues d = new DefaultKeyedValues();
        List keys = d.getKeys();
        assertTrue(keys.isEmpty());
        d.addValue("A", 1.0);
        keys = d.getKeys();
        assertEquals(1, keys.size());
        assertTrue(keys.contains("A"));
        d.addValue("B", 2.0);
        keys = d.getKeys();
        assertEquals(2, keys.size());
        assertTrue(keys.contains("A"));
        assertTrue(keys.contains("B"));
        d.clear();
        keys = d.getKeys();
        assertEquals(0, keys.size());
    }

    