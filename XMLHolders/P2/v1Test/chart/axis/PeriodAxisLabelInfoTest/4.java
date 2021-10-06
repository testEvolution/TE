@Test
    public void testCreateInstance() {
        TimeZone zone = TimeZone.getTimeZone("GMT");
        PeriodAxisLabelInfo info = new PeriodAxisLabelInfo(Day.class,
                new SimpleDateFormat("d"));
        Day d = (Day) info.createInstance(new Date(0L), zone, Locale.UK);
        assertEquals(new Day(1, 1, 1970), d);

        info = new PeriodAxisLabelInfo(Year.class, new SimpleDateFormat("YYYY"));
        Year y = (Year) info.createInstance(new Date(0L), zone, Locale.UK);
        assertEquals(new Year(1970), y);
    }

}