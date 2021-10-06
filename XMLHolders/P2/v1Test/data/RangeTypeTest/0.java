@Test
    public void testEquals() {
        assertEquals(RangeType.FULL, RangeType.FULL);
        assertEquals(RangeType.NEGATIVE, RangeType.NEGATIVE);
        assertEquals(RangeType.POSITIVE, RangeType.POSITIVE);
        assertFalse(RangeType.FULL.equals(RangeType.NEGATIVE));
        assertFalse(RangeType.FULL.equals(RangeType.POSITIVE));
        assertFalse(RangeType.FULL.equals(null));
        assertFalse(RangeType.NEGATIVE.equals(RangeType.FULL));
        assertFalse(RangeType.NEGATIVE.equals(RangeType.POSITIVE));
        assertFalse(RangeType.NEGATIVE.equals(null));
        assertFalse(RangeType.POSITIVE.equals(RangeType.NEGATIVE));
        assertFalse(RangeType.POSITIVE.equals(RangeType.FULL));
        assertFalse(RangeType.POSITIVE.equals(null));
    }

    