@Test
    public void testSerialization() {
        TimePeriodAnchor a1 = TimePeriodAnchor.START;
        TimePeriodAnchor a2 = (TimePeriodAnchor) TestUtils.serialised(a1);
        assertTrue(a1 == a2);
    }

}