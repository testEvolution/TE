@Test
    public void testEquals() {
        NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        NumberTickUnit t2 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        assertTrue(t1.equals(t2));
        assertTrue(t2.equals(t1));

        t1 = new NumberTickUnit(3.21, new DecimalFormat("0.00"));
        assertFalse(t1.equals(t2));
        t2 = new NumberTickUnit(3.21, new DecimalFormat("0.00"));
        assertTrue(t1.equals(t2));

        t1 = new NumberTickUnit(3.21, new DecimalFormat("0.000"));
        assertFalse(t1.equals(t2));
        t2 = new NumberTickUnit(3.21, new DecimalFormat("0.000"));
        assertTrue(t1.equals(t2));
    }

    