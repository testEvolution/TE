@Test
    public void testNotCloneable() {
        Quarter q = new Quarter(2, 2003);
        assertFalse(q instanceof Cloneable);
    }

    