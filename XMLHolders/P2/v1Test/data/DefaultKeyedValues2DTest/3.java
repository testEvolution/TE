@Test
    public void testEquals() {
        DefaultKeyedValues2D d1 = new DefaultKeyedValues2D();
        DefaultKeyedValues2D d2 = new DefaultKeyedValues2D();
        assertTrue(d1.equals(d2));
        assertTrue(d2.equals(d1));

        d1.addValue(1.0, 2.0, "S1");
        assertFalse(d1.equals(d2));
        d2.addValue(1.0, 2.0, "S1");
        assertTrue(d1.equals(d2));
    }

    