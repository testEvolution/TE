@Test
    public void testHashCode() {
        AxisSpace s1 = new AxisSpace();
        AxisSpace s2 = new AxisSpace();
        assertTrue(s1.equals(s2));
        int h1 = s1.hashCode();
        int h2 = s2.hashCode();
        assertEquals(h1, h2);
    }

    