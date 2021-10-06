@Test
    public void testSerialization() {
        StatisticalBarRenderer r1 = new StatisticalBarRenderer();
        StatisticalBarRenderer r2 = (StatisticalBarRenderer) 
                TestUtils.serialised(r1);
        assertEquals(r1, r2);
    }

    