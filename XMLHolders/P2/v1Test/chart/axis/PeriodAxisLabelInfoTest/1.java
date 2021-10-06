@Test
    public void testHashCode() {
        PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        PeriodAxisLabelInfo info2 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        assertTrue(info1.equals(info2));
        int h1 = info1.hashCode();
        int h2 = info2.hashCode();
        assertEquals(h1, h2);
    }

    