@Test
    public void testSerialization() {
        RangeType r1 = RangeType.FULL;
        RangeType r2 = (RangeType) TestUtils.serialised(r1);
        assertSame(r1, r2);
    }

}