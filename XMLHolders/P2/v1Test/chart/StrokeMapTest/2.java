@Test
    public void testEquals() {
        StrokeMap m1 = new StrokeMap();
        StrokeMap m2 = new StrokeMap();
        assertTrue(m1.equals(m1));
        assertTrue(m1.equals(m2));
        assertFalse(m1.equals(null));
        assertFalse(m1.equals("ABC"));

        m1.put("K1", new BasicStroke(1.1f));
        assertFalse(m1.equals(m2));
        m2.put("K1", new BasicStroke(1.1f));
        assertTrue(m1.equals(m2));

        m1.put("K2", new BasicStroke(2.2f));
        assertFalse(m1.equals(m2));
        m2.put("K2", new BasicStroke(2.2f));
        assertTrue(m1.equals(m2));

        m1.put("K2", null);
        assertFalse(m1.equals(m2));
        m2.put("K2", null);
        assertTrue(m1.equals(m2));
    }

    