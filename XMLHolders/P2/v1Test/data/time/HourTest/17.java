@Test
    public void testNotCloneable() {
        Hour h = new Hour(7, 9, 10, 1999);
        assertFalse(h instanceof Cloneable);
    }

    