@Test
    public void testSerialization() {
        TimePeriodValuesCollection c1 = new TimePeriodValuesCollection();
        TimePeriodValuesCollection c2 = (TimePeriodValuesCollection) 
                TestUtils.serialised(c1);
        assertEquals(c1, c2);
    }

    