@Test
    public void testNotCloneable() {
        FixedMillisecond m = new FixedMillisecond(500000L);
        assertFalse(m instanceof Cloneable);
    }

    