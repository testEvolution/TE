@Test
    public void testEquals() {
        OHLCSeries s1 = new OHLCSeries("s1");
        OHLCSeries s2 = new OHLCSeries("s1");
        assertTrue(s1.equals(s2));

        // seriesKey
        s1 = new OHLCSeries("s2");
        assertFalse(s1.equals(s2));
        s2 = new OHLCSeries("s2");
        assertTrue(s1.equals(s2));

        // add a value
        s1.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        assertFalse(s1.equals(s2));
        s2.add(new Year(2006), 2.0, 4.0, 1.0, 3.0);
        assertTrue(s2.equals(s1));

        // add another value
        s1.add(new Year(2008), 2.0, 4.0, 1.0, 3.0);
        assertFalse(s1.equals(s2));
        s2.add(new Year(2008), 2.0, 4.0, 1.0, 3.0);
        assertTrue(s2.equals(s1));

        // remove a value
        s1.remove(new Year(2008));
        assertFalse(s1.equals(s2));
        s2.remove(new Year(2008));
        assertTrue(s2.equals(s1));
    }

    