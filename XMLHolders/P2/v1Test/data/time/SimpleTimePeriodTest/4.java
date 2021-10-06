@Test
    public void testClone() {
        SimpleTimePeriod s1 = new SimpleTimePeriod(new Date(10L),
                new Date(20));
        assertFalse(s1 instanceof Cloneable);
    }

    