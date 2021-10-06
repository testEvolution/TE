@Test
    public void testImmutable() {
        SimpleTimePeriod p1 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        SimpleTimePeriod p2 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        assertEquals(p1, p2);
        p1.getStart().setTime(11L);
        assertEquals(p1, p2);

        Date d1 = new Date(10L);
        Date d2 = new Date(20L);
        p1 = new SimpleTimePeriod(d1, d2);
        d1.setTime(11L);
        assertEquals(new Date(10L), p1.getStart());
    }

    