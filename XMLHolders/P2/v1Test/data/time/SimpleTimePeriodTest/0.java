@Test
    public void testEqualsSelf() {
        SimpleTimePeriod p = new SimpleTimePeriod(new Date(1000L),
                new Date(1001L));
        assertTrue(p.equals(p));
    }

    