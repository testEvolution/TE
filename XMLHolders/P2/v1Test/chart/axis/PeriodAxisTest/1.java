@Test
    public void testEquals() {
        PeriodAxis a1 = new PeriodAxis("Test");
        PeriodAxis a2 = new PeriodAxis("Test");
        assertTrue(a1.equals(a2));
        assertTrue(a2.equals(a1));

        a1.setFirst(new Year(2000));
        assertFalse(a1.equals(a2));
        a2.setFirst(new Year(2000));
        assertTrue(a1.equals(a2));

        a1.setLast(new Year(2004));
        assertFalse(a1.equals(a2));
        a2.setLast(new Year(2004));
        assertTrue(a1.equals(a2));

        a1.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
        assertFalse(a1.equals(a2));
        a2.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
        assertTrue(a1.equals(a2));

        a1.setAutoRangeTimePeriodClass(Quarter.class);
        assertFalse(a1.equals(a2));
        a2.setAutoRangeTimePeriodClass(Quarter.class);
        assertTrue(a1.equals(a2));

        PeriodAxisLabelInfo info[] = new PeriodAxisLabelInfo[1];
        info[0] = new PeriodAxisLabelInfo(Month.class,
                new SimpleDateFormat("MMM"));

        a1.setLabelInfo(info);
        assertFalse(a1.equals(a2));
        a2.setLabelInfo(info);
        assertTrue(a1.equals(a2));

        a1.setMajorTickTimePeriodClass(Minute.class);
        assertFalse(a1.equals(a2));
        a2.setMajorTickTimePeriodClass(Minute.class);
        assertTrue(a1.equals(a2));

        a1.setMinorTickMarksVisible(!a1.isMinorTickMarksVisible());
        assertFalse(a1.equals(a2));
        a2.setMinorTickMarksVisible(a1.isMinorTickMarksVisible());
        assertTrue(a1.equals(a2));

        a1.setMinorTickTimePeriodClass(Minute.class);
        assertFalse(a1.equals(a2));
        a2.setMinorTickTimePeriodClass(Minute.class);
        assertTrue(a1.equals(a2));

        Stroke s = new BasicStroke(1.23f);
        a1.setMinorTickMarkStroke(s);
        assertFalse(a1.equals(a2));
        a2.setMinorTickMarkStroke(s);
        assertTrue(a1.equals(a2));

        a1.setMinorTickMarkPaint(Color.BLUE);
        assertFalse(a1.equals(a2));
        a2.setMinorTickMarkPaint(Color.BLUE);
        assertTrue(a1.equals(a2));
    }

    