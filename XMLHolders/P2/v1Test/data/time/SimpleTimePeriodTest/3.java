@Test
    public void testHashcode() {
        SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        SimpleTimePeriod s2 = new SimpleTimePeriod(new Date(10L),
                new Date(20L));
        assertTrue(s1.equals(s2));
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        assertEquals(h1, h2);
    }

    