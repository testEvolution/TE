@Test
    public void testSerialization() {
        TimeSeriesURLGenerator g1 = new TimeSeriesURLGenerator();
        TimeSeriesURLGenerator g2 = (TimeSeriesURLGenerator) 
                TestUtils.serialised(g1);
        assertEquals(g1, g2);
    }

    