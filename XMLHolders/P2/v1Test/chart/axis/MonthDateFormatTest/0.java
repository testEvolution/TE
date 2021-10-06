@Test
    public void testEquals() {
        MonthDateFormat mf1 = new MonthDateFormat();
        MonthDateFormat mf2 = new MonthDateFormat();
        assertTrue(mf1.equals(mf2));
        assertTrue(mf2.equals(mf1));

        boolean[] showYear1 = new boolean [12];
        showYear1[0] = true;
        boolean[] showYear2 = new boolean [12];
        showYear1[1] = true;

        // time zone
        mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.US, 1,
            showYear1, new SimpleDateFormat("yy"));
        assertFalse(mf1.equals(mf2));
        mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.US, 1,
            showYear1, new SimpleDateFormat("yy"));
        assertTrue(mf1.equals(mf2));

        // locale
        mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 1,
            showYear1, new SimpleDateFormat("yy"));
        assertFalse(mf1.equals(mf2));
        mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 1,
            showYear1, new SimpleDateFormat("yy"));
        assertTrue(mf1.equals(mf2));

        // chars
        mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear1, new SimpleDateFormat("yy"));
        assertFalse(mf1.equals(mf2));
        mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear1, new SimpleDateFormat("yy"));
        assertTrue(mf1.equals(mf2));

        // showYear[]
        mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear2, new SimpleDateFormat("yy"));
        assertFalse(mf1.equals(mf2));
        mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear2, new SimpleDateFormat("yy"));
        assertTrue(mf1.equals(mf2));

        // yearFormatter
        mf1 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear2, new SimpleDateFormat("yyyy"));
        assertFalse(mf1.equals(mf2));
        mf2 = new MonthDateFormat(TimeZone.getTimeZone("PST"), Locale.FRANCE, 2,
            showYear2, new SimpleDateFormat("yyyy"));
        assertTrue(mf1.equals(mf2));

    }

    