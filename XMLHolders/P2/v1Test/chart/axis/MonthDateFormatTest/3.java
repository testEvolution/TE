@Test
    public void testSerialization() {
        MonthDateFormat mf1 = new MonthDateFormat();
        MonthDateFormat mf2 = (MonthDateFormat) TestUtils.serialised(mf1);
        assertTrue(mf1.equals(mf2));
    }

}