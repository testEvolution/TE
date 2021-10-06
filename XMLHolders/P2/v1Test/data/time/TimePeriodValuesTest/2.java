@Test
    public void testAddValue() {
        TimePeriodValues tpvs = new TimePeriodValues("Test");
        tpvs.add(new Year(1999), 1);
        int value = tpvs.getValue(0).intValue();
        assertEquals(1, value);
    }

    