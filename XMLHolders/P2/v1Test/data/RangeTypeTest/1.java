@Test
    public void testHashCode() {
        RangeType r1 = RangeType.FULL;
        RangeType r2 = RangeType.FULL;
        assertTrue(r1.equals(r2));
        int h1 = r1.hashCode();
        int h2 = r2.hashCode();
        assertEquals(h1, h2);
    }

    