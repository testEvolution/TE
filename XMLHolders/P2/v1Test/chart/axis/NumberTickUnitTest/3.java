@Test
    public void testSerialization() {
        NumberTickUnit t1 = new NumberTickUnit(1.23, new DecimalFormat("0.00"));
        NumberTickUnit t2 = (NumberTickUnit) TestUtils.serialised(t1);
        assertEquals(t1, t2);
    }

}