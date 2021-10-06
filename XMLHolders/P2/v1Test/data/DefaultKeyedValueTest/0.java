@Test
    public void testConstructor() {
        DefaultKeyedValue v = new DefaultKeyedValue("A", 1);
        assertEquals("A", v.getKey());
        assertEquals(1, v.getValue());

        // try null key
        boolean pass = false;
        try {
            v = new DefaultKeyedValue(null, 1);
        } catch (IllegalArgumentException e) {
            pass = true;
        }
        assertTrue(pass);

        // try a null value
        v = new DefaultKeyedValue("A", null);
        assertNull(v.getValue());
    }

    