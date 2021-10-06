@Test
    public void testHashCode() {
        MonthDateFormat mf1 = new MonthDateFormat();
        MonthDateFormat mf2 = new MonthDateFormat();
        assertTrue(mf1.equals(mf2));
        int h1 = mf1.hashCode();
        int h2 = mf2.hashCode();
        assertEquals(h1, h2);
    }

    