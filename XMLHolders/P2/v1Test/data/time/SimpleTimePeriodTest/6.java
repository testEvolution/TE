@Test
    public void testCompareTo() {
        SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        SimpleTimePeriod s2 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        assertEquals(0, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(9L), new Date(21L));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(-1, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(11L), new Date(19L));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(1, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(9L), new Date(19L));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(-1, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(11L), new Date(21));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(1, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(10L), new Date(18));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(-1, s1.compareTo(s2));

        s1 = new SimpleTimePeriod(new Date(10L), new Date(22));
        s2 = new SimpleTimePeriod(new Date(10L), new Date(20L));
        assertEquals(1, s1.compareTo(s2));
    }

}