@Test
    public void testEquals() {
        Week w1 = new Week(1, 2002);
        Week w2 = new Week(1, 2002);
        assertTrue(w1.equals(w2));
        assertTrue(w2.equals(w1));

        w1 = new Week(2, 2002);
        assertFalse(w1.equals(w2));
        w2 = new Week(2, 2002);
        assertTrue(w1.equals(w2));

        w1 = new Week(2, 2003);
        assertFalse(w1.equals(w2));
        w2 = new Week(2, 2003);
        assertTrue(w1.equals(w2));
    }

    