@Test
    public void testSerialization() {
        MeterInterval m1 = new MeterInterval("X", new Range(1.0, 2.0));
        MeterInterval m2 = (MeterInterval) TestUtils.serialised(m1);
        assertEquals(m1, m2);
    }

}