@Test
    public void testEquals() {
        MeanAndStandardDeviation m1 = new MeanAndStandardDeviation(1.2, 3.4);
        MeanAndStandardDeviation m2 = new MeanAndStandardDeviation(1.2, 3.4);
        assertTrue(m1.equals(m2));
        assertTrue(m2.equals(m1));

        m1 = new MeanAndStandardDeviation(1.0, 3.4);
        assertFalse(m1.equals(m2));
        m2 = new MeanAndStandardDeviation(1.0, 3.4);
        assertTrue(m1.equals(m2));

        m1 = new MeanAndStandardDeviation(1.0, 3.0);
        assertFalse(m1.equals(m2));
        m2 = new MeanAndStandardDeviation(1.0, 3.0);
        assertTrue(m1.equals(m2));
    }

    