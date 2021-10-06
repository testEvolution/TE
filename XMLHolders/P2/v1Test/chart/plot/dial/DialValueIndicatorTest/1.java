@Test
    public void testHashCode() {
        DialValueIndicator i1 = new DialValueIndicator(0);
        DialValueIndicator i2 = new DialValueIndicator(0);
        assertTrue(i1.equals(i2));
        int h1 = i1.hashCode();
        int h2 = i2.hashCode();
        assertEquals(h1, h2);
    }

    