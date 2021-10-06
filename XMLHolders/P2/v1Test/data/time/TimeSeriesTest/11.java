@Test
    public void testEquals() {
        TimeSeries s1 = new TimeSeries("Time Series 1");
        TimeSeries s2 = new TimeSeries("Time Series 2");
        boolean b1 = s1.equals(s2);
        assertFalse(b1, "b1");

        s2.setKey("Time Series 1");
        boolean b2 = s1.equals(s2);
        assertTrue(b2, "b2");

        RegularTimePeriod p1 = new Day();
        RegularTimePeriod p2 = p1.next();
        s1.add(p1, 100.0);
        s1.add(p2, 200.0);
        boolean b3 = s1.equals(s2);
        assertFalse(b3, "b3");

        s2.add(p1, 100.0);
        s2.add(p2, 200.0);
        boolean b4 = s1.equals(s2);
        assertTrue(b4, "b4");

        s1.setMaximumItemCount(100);
        boolean b5 = s1.equals(s2);
        assertFalse(b5, "b5");

        s2.setMaximumItemCount(100);
        boolean b6 = s1.equals(s2);
        assertTrue(b6, "b6");

        s1.setMaximumItemAge(100);
        boolean b7 = s1.equals(s2);
        assertFalse(b7, "b7");

        s2.setMaximumItemAge(100);
        boolean b8 = s1.equals(s2);
        assertTrue(b8, "b8");
    }

    