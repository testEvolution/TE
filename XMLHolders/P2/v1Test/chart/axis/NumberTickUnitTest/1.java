@Test
    public void testHashCode() {
        NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        NumberTickUnit t2 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        int h1 = t1.hashCode();
        int h2 = t2.hashCode();
        assertEquals(h1, h2);
    }

    