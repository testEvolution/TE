@Test
    public void testCloning() throws CloneNotSupportedException {
        PeriodAxisLabelInfo info1 = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        PeriodAxisLabelInfo info2 = (PeriodAxisLabelInfo) info1.clone();
        assertTrue(info1 != info2);
        assertTrue(info1.getClass() == info2.getClass());
        assertTrue(info1.equals(info2));
    }

    