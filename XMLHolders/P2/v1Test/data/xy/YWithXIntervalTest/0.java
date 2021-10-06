@Test
    public void testEquals() {
        YWithXInterval i1 = new YWithXInterval(1.0, 0.5, 1.5);
        YWithXInterval i2 = new YWithXInterval(1.0, 0.5, 1.5);
        assertEquals(i1, i2);

        i1 = new YWithXInterval(1.1, 0.5, 1.5);
        assertFalse(i1.equals(i2));
        i2 = new YWithXInterval(1.1, 0.5, 1.5);
        assertTrue(i1.equals(i2));

        i1 = new YWithXInterval(1.1, 0.55, 1.5);
        assertFalse(i1.equals(i2));
        i2 = new YWithXInterval(1.1, 0.55, 1.5);
        assertTrue(i1.equals(i2));

        i1 = new YWithXInterval(1.1, 0.55, 1.55);
        assertFalse(i1.equals(i2));
        i2 = new YWithXInterval(1.1, 0.55, 1.55);
        assertTrue(i1.equals(i2));
    }

    