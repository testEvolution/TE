@Test
    public void testEquals() {

        YIntervalSeries s1 = new YIntervalSeries("s1");
        YIntervalSeries s2 = new YIntervalSeries("s1");
        assertTrue(s1.equals(s2));

        // seriesKey
        s1 = new YIntervalSeries("s2");
        assertFalse(s1.equals(s2));
        s2 = new YIntervalSeries("s2");
        assertTrue(s1.equals(s2));

        // autoSort
        s1 = new YIntervalSeries("s2", false, true);
        assertFalse(s1.equals(s2));
        s2 = new YIntervalSeries("s2", false, true);
        assertTrue(s1.equals(s2));

        // allowDuplicateValues
        s1 = new YIntervalSeries("s2", false, false);
        assertFalse(s1.equals(s2));
        s2 = new YIntervalSeries("s2", false, false);
        assertTrue(s1.equals(s2));

        // add a value
        s1.add(1.0, 0.5, 1.5, 2.0);
        assertFalse(s1.equals(s2));
        s2.add(1.0, 0.5, 1.5, 2.0);
        assertTrue(s2.equals(s1));

        // add another value
        s1.add(2.0, 0.5, 1.5, 2.0);
        assertFalse(s1.equals(s2));
        s2.add(2.0, 0.5, 1.5, 2.0);
        assertTrue(s2.equals(s1));

        // remove a value
        s1.remove(1.0);
        assertFalse(s1.equals(s2));
        s2.remove(1.0);
        assertTrue(s2.equals(s1));
    }

    