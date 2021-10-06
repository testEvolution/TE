@Test
    public void testNotCloneable() {
        Year y = new Year(1999);
        assertFalse(y instanceof Cloneable);
    }

    