@Test
    public void testNotCloneable() {
        Week w = new Week(1, 1999);
        assertFalse(w instanceof Cloneable);
    }

    