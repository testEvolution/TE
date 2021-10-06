@Test
    public void testEquals2() {
        TimeSeries s1 = new TimeSeries("Series", null, null);
        TimeSeries s2 = new TimeSeries("Series", null, null);
        assertTrue(s1.equals(s2));
    }

    