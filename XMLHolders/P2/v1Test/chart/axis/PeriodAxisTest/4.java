@Test
    public void testCloning() throws CloneNotSupportedException {
        PeriodAxis a1 = new PeriodAxis("Test");
        PeriodAxis a2 = (PeriodAxis) a1.clone();
        assertTrue(a1 != a2);
        assertTrue(a1.getClass() == a2.getClass());
        assertTrue(a1.equals(a2));

        // some checks that the clone is independent of the original
        a1.setLabel("New Label");
        assertFalse(a1.equals(a2));
        a2.setLabel("New Label");
        assertTrue(a1.equals(a2));

        a1.setFirst(new Year(1920));
        assertFalse(a1.equals(a2));
        a2.setFirst(new Year(1920));
        assertTrue(a1.equals(a2));

        a1.setLast(new Year(2020));
        assertFalse(a1.equals(a2));
        a2.setLast(new Year(2020));
        assertTrue(a1.equals(a2));

        PeriodAxisLabelInfo[] info = new PeriodAxisLabelInfo[2];
        info[0] = new PeriodAxisLabelInfo(Day.class, new SimpleDateFormat("d"));
        info[1] = new PeriodAxisLabelInfo(Year.class,
                new SimpleDateFormat("yyyy"));
        a1.setLabelInfo(info);
        assertFalse(a1.equals(a2));
        a2.setLabelInfo(info);
        assertTrue(a1.equals(a2));

        a1.setAutoRangeTimePeriodClass(Second.class);
        assertFalse(a1.equals(a2));
        a2.setAutoRangeTimePeriodClass(Second.class);
        assertTrue(a1.equals(a2));

        a1.setTimeZone(new SimpleTimeZone(123, "Bogus"));
        assertFalse(a1.equals(a2));
        a2.setTimeZone(new SimpleTimeZone(123, "Bogus"));
        assertTrue(a1.equals(a2));
    }

    