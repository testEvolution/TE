@Test
    public void testEquals() {
        assertEquals(DateTickMarkPosition.START, DateTickMarkPosition.START);
        assertEquals(DateTickMarkPosition.MIDDLE, DateTickMarkPosition.MIDDLE);
        assertEquals(DateTickMarkPosition.END, DateTickMarkPosition.END);
        assertFalse(DateTickMarkPosition.START.equals(null));
        assertFalse(DateTickMarkPosition.START.equals(
                DateTickMarkPosition.END));
        assertFalse(DateTickMarkPosition.MIDDLE.equals(
                DateTickMarkPosition.END));
    }

    