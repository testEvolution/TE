@Test
    public void testEquals() {
        RelativeDateFormat df1 = new RelativeDateFormat();
        RelativeDateFormat df2 = new RelativeDateFormat();
        assertEquals(df1, df2);

        df1.setBaseMillis(123L);
        assertFalse(df1.equals(df2));
        df2.setBaseMillis(123L);
        assertTrue(df1.equals(df2));

        df1.setDayFormatter(new DecimalFormat("0%"));
        assertFalse(df1.equals(df2));
        df2.setDayFormatter(new DecimalFormat("0%"));
        assertTrue(df1.equals(df2));

        df1.setDaySuffix("D");
        assertFalse(df1.equals(df2));
        df2.setDaySuffix("D");
        assertTrue(df1.equals(df2));

        df1.setHourFormatter(new DecimalFormat("0%"));
        assertFalse(df1.equals(df2));
        df2.setHourFormatter(new DecimalFormat("0%"));
        assertTrue(df1.equals(df2));

        df1.setHourSuffix("H");
        assertFalse(df1.equals(df2));
        df2.setHourSuffix("H");
        assertTrue(df1.equals(df2));

        df1.setMinuteFormatter(new DecimalFormat("0%"));
        assertFalse(df1.equals(df2));
        df2.setMinuteFormatter(new DecimalFormat("0%"));
        assertTrue(df1.equals(df2));

        df1.setMinuteSuffix("M");
        assertFalse(df1.equals(df2));
        df2.setMinuteSuffix("M");
        assertTrue(df1.equals(df2));

        df1.setSecondSuffix("S");
        assertFalse(df1.equals(df2));
        df2.setSecondSuffix("S");
        assertTrue(df1.equals(df2));

        df1.setShowZeroDays(!df1.getShowZeroDays());
        assertFalse(df1.equals(df2));
        df2.setShowZeroDays(!df2.getShowZeroDays());
        assertTrue(df1.equals(df2));

        df1.setSecondFormatter(new DecimalFormat("0.0"));
        assertFalse(df1.equals(df2));
        df2.setSecondFormatter(new DecimalFormat("0.0"));
        assertTrue(df1.equals(df2));
    }

    