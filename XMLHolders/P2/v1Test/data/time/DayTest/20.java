@Test
    public void testNotCloneable() {
        Day d = new Day(1, 2, 2003);
        assertFalse(d instanceof Cloneable);
    }

    