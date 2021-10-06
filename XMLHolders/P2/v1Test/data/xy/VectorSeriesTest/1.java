@Test
    public void testEquals() {

        VectorSeries s1 = new VectorSeries("s1");
        VectorSeries s2 = new VectorSeries("s1");
        assertTrue(s1.equals(s2));

        // seriesKey
        s1 = new VectorSeries("s2");
        assertFalse(s1.equals(s2));
        s2 = new VectorSeries("s2");
        assertTrue(s1.equals(s2));

        // autoSort
        s1 = new VectorSeries("s2", true, true);
        assertFalse(s1.equals(s2));
        s2 = new VectorSeries("s2", true, true);
        assertTrue(s1.equals(s2));

        // allowDuplicateValues
        s1 = new VectorSeries("s2", false, false);
        assertFalse(s1.equals(s2));
        s2 = new VectorSeries("s2", false, false);
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
        s1.remove(new XYCoordinate(1.0, 0.5));
        assertFalse(s1.equals(s2));
        s2.remove(new XYCoordinate(1.0, 0.5));
        assertTrue(s2.equals(s1));

    }

    