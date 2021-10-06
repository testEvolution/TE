@Test
    public void testEquals() {
        Year year1 = new Year(2002);
        Year year2 = new Year(2002);
        assertTrue(year1.equals(year2));

        year1 = new Year(1999);
        assertFalse(year1.equals(year2));
        year2 = new Year(1999);
        assertTrue(year1.equals(year2));
    }

    