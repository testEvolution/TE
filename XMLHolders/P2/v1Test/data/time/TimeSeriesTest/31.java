@Test
    public void testHashCode() {
        TimeSeries s1 = new TimeSeries("Test");
        TimeSeries s2 = new TimeSeries("Test");
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(1, 1, 2007), 500.0);
        s2.add(new Day(1, 1, 2007), 500.0);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(2, 1, 2007), null);
        s2.add(new Day(2, 1, 2007), null);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(5, 1, 2007), 111.0);
        s2.add(new Day(5, 1, 2007), 111.0);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());

        s1.add(new Day(9, 1, 2007), 1.0);
        s2.add(new Day(9, 1, 2007), 1.0);
        assertEquals(s1, s2);
        assertEquals(s1.hashCode(), s2.hashCode());
    }

    