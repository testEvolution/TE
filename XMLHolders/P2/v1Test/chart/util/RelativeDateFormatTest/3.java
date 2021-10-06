@Test
    public void test2033092() {
        RelativeDateFormat rdf = new RelativeDateFormat();
        rdf.setShowZeroDays(false);
        rdf.setShowZeroHours(false);
        rdf.setMinuteSuffix(":");
        rdf.setHourSuffix(":");
        rdf.setSecondSuffix("");
        DecimalFormat hoursFormatter = new DecimalFormat();
        hoursFormatter.setMaximumFractionDigits(0);
        hoursFormatter.setMaximumIntegerDigits(2);
        hoursFormatter.setMinimumIntegerDigits(2);
        rdf.setHourFormatter(hoursFormatter);
        DecimalFormat minsFormatter = new DecimalFormat();
        minsFormatter.setMaximumFractionDigits(0);
        minsFormatter.setMaximumIntegerDigits(2);
        minsFormatter.setMinimumIntegerDigits(2);
        rdf.setMinuteFormatter(minsFormatter);
        DecimalFormat secondsFormatter = new DecimalFormat();
        secondsFormatter.setMaximumFractionDigits(0);
        secondsFormatter.setMaximumIntegerDigits(2);
        secondsFormatter.setMinimumIntegerDigits(2);
        rdf.setSecondFormatter(secondsFormatter);
        String s = rdf.format(new Date(2 * 60L * 60L * 1000L + 122500L));
        assertEquals("02:02:02", s);
    }

    