@Test
    public void testEquals() {
        Month m1 = new Month(MonthConstants.MAY, 2002);
        Month m2 = new Month(MonthConstants.MAY, 2002);
        assertTrue(m1.equals(m2));
    }

    