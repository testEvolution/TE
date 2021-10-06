@Test
    public void testSerialization() {
        PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        PeriodAxisLabelInfo info2 = (PeriodAxisLabelInfo) TestUtils.serialised(info1);
        assertEquals(info1, info2);
    }

    